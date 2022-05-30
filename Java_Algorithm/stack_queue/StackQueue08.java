package stack_queue;

import java.util.*;

/**
 * 응급실
 * 진료 순서
 * 1. 환자가 접수한 순서대로 목록에서 제일 앞에 있는 환자 목록을 꺼낸다.
 * 2. 나머지 대기 목록에서 꺼낸 환자 보다 위험도가 높은 환자가 존재하면 대기 목록 제일 뒤로 다시 넣는다.
 * ( 대기 목록에 자기보다 위험도가 높은 환자가 없을 때 자신이 진료를 받는 구조)
 * N명 환자의 대기 목록이 주어질 때, 대기 목록상 M 번째 환자가 몇 번째로 진료를 받는지 출력하는 프로그램을 작성하라.
 */
public class StackQueue08 {
    static class Patient {
        int idx; // 환자 번호
        int risk; // 위험도

        Patient(int idx, int risk) {
            this.idx = idx;
            this.risk = risk;
        }

        public int getRisk() {
            return risk;
        }

    }

    public static int solution(int patientNum, int designatedPatient, int[] patientRisk) {
        int answer = 0;
        Queue<Patient> sequence = new LinkedList<>();

        for (int idx = 0; idx < patientNum; idx++) {
            sequence.add(new Patient(idx, patientRisk[idx]));
        }

        while (!sequence.isEmpty()) {
            int max = sequence.stream().max(Comparator.comparingInt(Patient::getRisk)).orElseThrow(NoSuchElementException::new).risk;
            Patient patient = sequence.poll();

            if (max != patient.risk) { // 다시 대기
                sequence.add(patient);
            } else { // 진료 받음
                answer++;

                if (patient.idx == designatedPatient) {
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int patientNum = input.nextInt(); // 환자 수
        int designatedPatient = input.nextInt(); // 지정한 환자
        int[] patientRisk = new int[patientNum];

        for (int idx = 0; idx < patientNum; idx++) {
            patientRisk[idx] = input.nextInt();
        }

        System.out.println(solution(patientNum, designatedPatient, patientRisk));
    }
}
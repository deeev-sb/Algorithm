package COS;

import java.util.Arrays;

// [2차] 로봇을 움직여주세요
class COS1G2P06 {
    public int[] solution(String commands) {
        // 여기에 코드를 작성해주세요.
        int[] answer = {0, 0};
        for (char cmd : commands.toCharArray()) {
            if (cmd == 'U') answer[1] += 1;
            else if (cmd == 'D') answer[1] -= 1;
            else if (cmd == 'R') answer[0] += 1;
            else answer[0] -= 1;
        }
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        COS1G2P06 sol = new COS1G2P06();
        String commands = "URDDL";
        int[] ret = sol.solution(commands);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + Arrays.toString(ret) + " 입니다.");
    }
}
package COS;

// [1차] 타임머신
class COS1G1P04 {
    public long solution(long num) {
        long answer = num + 1;
        String numStr = String.valueOf(answer);
        String temp = "";
        for (char str : numStr.toCharArray()) {
            if (str == '0') temp += '1';
            else temp += str;
        }
        answer = Long.valueOf(temp);
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        COS1G1P04 sol = new COS1G1P04();
        long num = 9949999;
        long ret = sol.solution(num);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
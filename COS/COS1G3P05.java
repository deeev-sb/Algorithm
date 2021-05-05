package COS;

// [3차] 전광판 문구 출력
class COS1G3P05 {
    public String solution(String phrases, int second) {
        // 여기에 코드를 작성해주세요.
        String answer = "";
        int lenP = phrases.length();
        int which = second / lenP;
        int sliceLen = second % lenP;

        if (which % 2 == 0) {
            String sliceP = phrases.substring(0, sliceLen);
            for (int i = 0; i < 14 - sliceLen; i++) {
                answer += '_';
            }
            answer += sliceP;
        } else {
            String sliceP = phrases.substring(sliceLen, lenP);
            answer += sliceP;
            for (int i = 0; i < 14 - sliceP.length(); i++) {
                answer += '_';
            }
        }

        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        COS1G3P05 sol = new COS1G3P05();
        String phrases = new String("happy-birthday");
        int second = 3;
        String ret = sol.solution(phrases, second);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 \"" + ret + "\" 입니다.");

    }
}


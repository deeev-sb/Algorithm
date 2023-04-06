package cos;

// [3차] 중복 문자열 이어붙이기
class COS1G3P04 {
    public int solution(String s1, String s2) {
        // 여기에 코드를 작성해주세요.
        int answer = Math.min(checkStart(s1, s2), checkStart(s2, s1));
        return answer;
    }

    public int checkStart(String s1, String s2) {
        int s1Len = s1.length();
        int s2Len = s2.length();
        for (int i = 0; i < s1Len; i++) {
            String subStr = s1.substring(i, s1Len);
            if (s2.startsWith(subStr)) {
                return s1Len + s2Len - subStr.length();
            }
        }
        return s1Len + s2Len;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        COS1G3P04 sol = new COS1G3P04();
        String s1 = new String("ababc");
        String s2 = new String("abcdab");
        int ret = sol.solution(s1, s2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}


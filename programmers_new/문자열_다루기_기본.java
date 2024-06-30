// https://school.programmers.co.kr/learn/courses/30/lessons/12918
// 연습문제
public class 문자열_다루기_기본 {

    public static void main(String[] args) {
        System.out.println(solution("a234")); // false
        System.out.println(solution("1234")); // true
    }

    public static boolean solution(String s) {
        int size = s.length();

        if (size != 4 && size != 6) return false;

        for (int i = 0; i < size; i++) {
            System.out.println(s.charAt(i));
            if (!Character.isDigit(s.charAt(i))) return false;
        }

        return true;
    }
}

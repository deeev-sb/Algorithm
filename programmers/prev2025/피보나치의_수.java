package prev2025;

// https://school.programmers.co.kr/learn/courses/30/lessons/12945
public class 피보나치의_수 {

    public static void main(String[] args) {
        System.out.println(solution(3)); // 2
        System.out.println(solution(5)); // 5
        System.out.println(solution(10)); // 55
    }

    public static int solution(int n) {
        if (n == 0 || n == 1) return n;

        int[] fibonacci = new int[n+1];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < n+1; i++) {
            fibonacci[i] = (fibonacci[i-1] + fibonacci[i-2])%1234567;
        }

        return (fibonacci[n-1] + fibonacci[n-2])%1234567;
    }
}

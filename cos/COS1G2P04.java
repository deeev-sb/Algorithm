package cos;

import java.util.HashSet;
import java.util.Set;

// [2차] 합이 k배가 되는 수
class COS1G2P04 {
    public int solution(int[] arr, int K) {
        // 여기에 코드를 작성해주세요.
        int sum;
        int len = arr.length;
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < len - 2; i++) {
            for (int j = i; j < len - 1; j++) {
                for (int k = j; k < len; k++) {
                    sum = arr[i] + arr[j] + arr[k];
                    if ((sum) % K == 0) set.add(sum);
                }
            }
        }
        return set.size();
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        COS1G2P04 sol = new COS1G2P04();
        int[] arr = {1, 2, 3, 4, 5};
        int K = 3;
        int ret = sol.solution(arr, K);


        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
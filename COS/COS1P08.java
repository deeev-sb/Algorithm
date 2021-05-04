package COS;

// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

// 꽃피우기
class COS1P08 {
    public int solution(int[][] garden) {
        // 여기에 코드를 작성해주세요.
        int answer = 0;
        Queue<Integer> queue = new LinkedList<Integer>();
        int row = garden.length;
        int cos = garden[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cos; j++) {
                if (garden[i][j] == 1) queue.offer(i*cos + j);
            }
        }

        int temp = 0, r = 0, c = 0, nr = 0, nc = 0, lenQueue = 0;
        int[] dr = {1, 0, -1, 0};
        int[] dc = {0, 1, 0, -1};
        boolean check;
        while (!queue.isEmpty()) {
            lenQueue = queue.size();
            check = false;
            while (lenQueue-- > 0){
                temp = queue.poll();
                r = temp/cos;
                c = temp%cos;
                for (int i = 0; i < 4; i++) {
                    nr = r + dr[i];
                    nc = c + dc[i];
                    if (0 <= nr && nr < row && 0 <= nc && nc < cos && garden[nr][nc] == 0) {
                        garden[nr][nc] = 1;
                        queue.offer(nr*cos + nc);
                        check = true;
                    }
                }
            }
            if (check) answer++;
        }

        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        COS1P08 sol = new COS1P08();
        int[][] garden1 = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int ret1 = sol.solution(garden1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int[][] garden2 = {{1, 1}, {1, 1}};
        int ret2 = sol.solution(garden2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");

    }
}
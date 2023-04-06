package cos;

// [3차] 비숍으로부터 도망쳐
class COS1G3P03 {
    public int solution(String[] bishops) {
        // 여기에 코드를 작성해주세요.
        int answer = 0;
        int[][] visited = new int[8][8]; // 방문 확인을 위한 matrix
        int[] dr = {-1, 1, 1, -1};
        int[] dc = {1, 1, -1, -1};
        for (String rc : bishops) {
            int row = 8 - Integer.valueOf(rc.charAt(1) - '0');
            int cos = Integer.valueOf(rc.charAt(0) - 'A');
            if (visited[row][cos] == 0) {
                visited[row][cos] = 1;
                answer++;
            }

            for (int i = 0; i < 4; i++) {
                int r = row;
                int c = cos;
                while (true) {
                    int nr = r + dr[i];
                    int nc = c + dc[i];
                    if (0 <= nr && nr < 8 && 0 <= nc && nc < 8) {
                        if (visited[nr][nc] == 0) {
                            visited[nr][nc] = 1;
                            answer++;
                        }
                        r = nr;
                        c = nc;
                    } else break;
                }
            }
        }
        return 64 - answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        COS1G3P03 sol = new COS1G3P03();
        String[] bishops1 = {new String("D5")};
        int ret1 = sol.solution(bishops1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        String[] bishops2 = {new String("D5"), new String("E8"), new String("G2")};
        int ret2 = sol.solution(bishops2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}

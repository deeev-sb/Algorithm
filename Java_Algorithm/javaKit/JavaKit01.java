package javaKit;

/**
 * 기지국 설치 - Greedy
 * N개의 아파드가 일렬로 쭉 늘어서 있으며, 일부 아파트 옥상에는 4g 기지국이 설치되어 있다.
 * 기지국을 4g에서 5g로 바꾸려는데, 4g보다 5g의 전달 범위가 좁아 어떤 아파트에 전파가 도달하지 않을 수 있다.
 * 도달거리가 w이면 현재 위치 기준 양 옆 1칸식만 전달할 수 있다.
 * 아파트의 개수 N, 기지국이 설치된 아파트 번호 stations, 전파 도달 거리 W 일 때,
 * 모든 아파트에 전파를 전달하기 위해 증설해야 하는 기지국 개수의 최솟값을 리턴
 * 11 [4, 11] 1 -> 3
 * 16 [9]     2 -> 3
 * ======
 * 넘어온 stations 를 기준점으로 하여 그 사이에 몇 개의 값이 포함될 수 있는지?
 * 범위가 만약 stations 포함 전체 도달 범위보다 작아도 +1 해야 함
 */
public class JavaKit01 {
    public static int solution(int n, int[] stations, int w) {
        int answer = 0;

        int startIdx = 1;
        int endIdx;

        final int MAX_W = w * 2 + 1;

        for (int station : stations) {
            endIdx = station - w - 1;
            answer += (endIdx - startIdx) / MAX_W;
            if ((endIdx - startIdx) % MAX_W >= 0) {
                answer++;
            }
            startIdx = station + w + 1;
        }

        answer += (n - startIdx) / MAX_W;
        if ((n - startIdx) % MAX_W >= 0) {
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] n = {11, 16};
        int[][] stations = {{4, 11}, {9}};
        int[] w = {1, 2};
        for (int idx = 0; idx < 2; idx++) {
            System.out.println(solution(n[idx], stations[idx], w[idx]));
        }
    }
}
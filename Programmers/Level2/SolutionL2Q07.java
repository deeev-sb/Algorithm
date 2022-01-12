import java.util.LinkedList;
import java.util.Queue;

public class SolutionL2Q07 { // 다리를 지나는 트럭
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        int truck_nums = truck_weights.length;
        int idx = 0;
        int cur_weights = 0;

        while(idx < truck_nums) {
            if (queue.size() == bridge_length) {
                cur_weights -= queue.poll();
            }

            if (cur_weights + truck_weights[idx] <= weight) {
                queue.offer(truck_weights[idx]);
                cur_weights += truck_weights[idx];
                idx++;
            } else {
                queue.offer(0);
            }
            answer++;
        }

        return answer + bridge_length;
    }
}

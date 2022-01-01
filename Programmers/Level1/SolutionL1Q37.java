// 최소 직사각형
public class SolutionL1Q37 {
    public int solution(int[][] sizes) {
        int answer = 0;
        int sizesLen = sizes.length;
        int w = 0;
        int h = 0;

        for (int i = 0; i < sizesLen; i++) {
            if (sizes[i][0] > sizes[i][1]) {
                w = Math.max(w, sizes[i][0]);
                h = Math.max(h, sizes[i][1]);
            } else {
                w = Math.max(w, sizes[i][1]);
                h = Math.max(h, sizes[i][0]);
            }
        }


        answer = w * h;

        return answer;
    }
}

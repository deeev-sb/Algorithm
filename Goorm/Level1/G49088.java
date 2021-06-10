import java.io.*;
import java.util.*;

// 의좋은 형제
class G49088 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n1 = Integer.parseInt(st.nextToken());
		int n2 = Integer.parseInt(st.nextToken());
		int day = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= day; i++) {
			if (i % 2 != 0) {
				int temp = n1;
				n1 /= 2;
				n2 += temp - n1;
			}
			else {
				int temp = n2;
				n2 /= 2;
				n1 += temp - n2;
			}
		}
		
		System.out.printf("%d %d", n1, n2);
	}
}

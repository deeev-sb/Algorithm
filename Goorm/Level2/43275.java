import java.io.*;
import java.util.*;

// 완전수
class G43275 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		
		for (int i = num1; i <= num2; i++) {
			int total = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0)
					total += j;
			}
			if (i == total)
				System.out.printf("%d ", i);
		}
		
	}
}

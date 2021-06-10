import java.io.*;
import java.util.*;

// 뱀이 지나간 자리
class G51353 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		for (int i = 1; i <= r; i++) {
			for (int j = 0; j < c; j++) {
				if (i % 2 == 0){
					if (i % 4 == 0 && j == 0)
						System.out.print("#");
					else if (i % 4 != 0 && j == c - 1)
						System.out.print("#");
					else
						System.out.print(".");
				}
				else
					System.out.print("#");
			}
			System.out.println();
		}
	}
}

import java.io.*;
import java.util.*;

class G49074 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 램 개수
		ArrayList<Integer> error = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= n; i++){
			int ram = Integer.parseInt(st.nextToken());
			if ((ram & (ram - 1)) != 0) // 2의 제곱이 아닌 경우
				error.add(i);
		}
		
		int errorLen = error.size();
		if (errorLen > 0) {
			System.out.println(errorLen);
			for (int i = 0; i < errorLen; i++)
				System.out.printf("%d ", error.get(i));
		}
		else
			System.out.println(errorLen);
	}
}

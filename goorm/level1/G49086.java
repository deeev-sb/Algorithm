import java.io.*;

// 정사각형의 개수
class G49086 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Integer.parseInt(br.readLine());
		long answer = 0;
		for (int i = 1; i <= n; i++)
			answer += (long) i * i;
		System.out.println(answer);
	}
}

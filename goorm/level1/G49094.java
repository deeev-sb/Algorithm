import java.io.*;

// 태민이의 취미
class G49094 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Integer.parseInt(br.readLine());
		long answer = n * (n + 1) / 2 % 1000000007;
		answer = answer * answer % 1000000007;
		System.out.println(answer);
	}
}

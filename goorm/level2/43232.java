import java.io.*;

class G43232 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		int answer = 0;
		for (int i = 1; i <= input; i++)
			if (input % i == 0)
				answer += i;
		
		System.out.println(answer);
	}
}

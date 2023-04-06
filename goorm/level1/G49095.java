import java.io.*;
import java.util.*;

// 고장난 컴퓨터
class G49095 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int inputNum = Integer.parseInt(st.nextToken());
		long sec = Integer.parseInt(st.nextToken());
		long[] inputs = new long[inputNum];
		long answer = 1;

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < inputNum; i++)
			inputs[i] = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < inputNum - 1; i++)
			if (inputs[i] + sec < inputs[i + 1])
				answer = 1;
			else
				answer++;
		
		System.out.println(answer);
	}
}

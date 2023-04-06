import java.io.*;

// 앵무새 꼬꼬
class G49053 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(br.readLine());
		String possible = "AEIOUaeiou";
		while(testcase-- > 0) {
			String text = br.readLine();
			String answer = "";
			for (int i = 0; i < text.length(); i++)
				if (possible.contains(String.valueOf(text.charAt(i))))
					answer += text.charAt(i);
			if (answer.length()  > 0)
				System.out.println(answer);
			else
				System.out.println("???");
		}
	}
}

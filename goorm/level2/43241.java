import java.io.*;
import java.util.*;
// 계산기
class G43241 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num1 = Integer.parseInt(st.nextToken());
		String ope = st.nextToken();
		int num2 = Integer.parseInt(st.nextToken());
		
		if (ope.equals("+"))
			System.out.println(num1 + num2);
		else if (ope.equals("-"))
			System.out.println(num1 - num2);
		else if (ope.equals("*"))
			System.out.println(num1 * num2);
		else
			System.out.printf("%.2f", (num1 / (double) num2));
		
	}
}

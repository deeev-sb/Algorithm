import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		boolean[] isCheck = new boolean[n+1];
		Arrays.fill(isCheck, true);
		
		for (int i = 2; i <= n; i++) {
			if (isCheck[i]) {
				for (int j = 2*i; j <= n;) {
					isCheck[j] = false;
					j += i;
				}
			}
		}
		
		if (isCheck[n]) System.out.println("True");
		else System.out.println("False");
		
	}
}

import java.io.*;
import java.util.*;

// 배열 합치기
class G43250 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int lenA = Integer.parseInt(st.nextToken());
		int lenB = Integer.parseInt(st.nextToken());
		int lenTotal = lenA + lenB;
		int[] arr = new int[lenTotal];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < lenA; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for (int i = lenA; i < lenTotal; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);
		
		for (int i = 0; i < lenTotal; i++)
			System.out.printf("%d ", arr[i]);
		
		
	}
}

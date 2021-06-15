import java.io.*;
import java.util.*;

/* 여름의 대삼각형
세 점이 주어졌을 때 삼각형의 넓이를 구하는 공식
A(a,b), B(c,d). C(e,f)일 때
S = {(b - d)(e - c) - (a - c)(f - d)} / 2
*/
class G49087 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		double[][] xy = new double[3][2];
		double answer = 0;
		
		for (int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			xy[i][0] = Integer.parseInt(st.nextToken());
			xy[i][1] = Integer.parseInt(st.nextToken());
		}
		double a = xy[0][0], b = xy[0][1], c = xy[1][0], d = xy[1][1], e = xy[2][0], f = xy[2][1];
		
		answer = (((b - d)*(e - c) - (a - c)*(f - d))) / 2;
		
		System.out.printf("%.2f", Math.abs(answer));
	}
}

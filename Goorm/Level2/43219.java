import java.io.*;

// 문자열 뒤집기
class G43219 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		sb.append(br.readLine());
		System.out.println(sb.reverse());
	}
}
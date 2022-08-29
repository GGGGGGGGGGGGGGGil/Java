package step01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/*
 * 날짜 : 2022/08/29
 * 이름 : 길은섭
 * 내용 : 1단계 11번 : 나머지
 */
public class _11 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		
		sb.append( (A+B)%C );
		sb.append("\n");
		
		sb.append( (A%C + B%C)%C );
		sb.append("\n");
		
		sb.append( (A*B)%C );
		sb.append("\n");
		
		sb.append( (A%C * B%C)%C );
		
		System.out.println(sb);
	}

}

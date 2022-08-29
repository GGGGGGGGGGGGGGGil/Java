package step01;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/29
 * 이름 : 길은섭
 * 내용 : 1단계 12번 : 곱셈
 */
public class _12 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		String B = in.next();
		
		in.close();
		
		System.out.println(A * (B.charAt(2) - '0'));
		System.out.println(A * (B.charAt(1) - '0'));
		System.out.println(A * (B.charAt(0) - '0'));
		System.out.println(A * Integer.parseInt(B));
	}
	
	

}

package step01;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/19
 * 이름 : 길은섭
 * 내용 : 1단계 7번 : 사칙연산
 */
public class _07 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
	}

}

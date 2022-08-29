package step01;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/29
 * 이름 : 길은섭
 * 내용 : 1단계 10번 : 킹, 퀸, 룩, 비숍, 나이트, 폰
 */
public class _10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int comp[] = {1, 1, 2, 2, 2, 8};
		int input[] = new int[6];
		
		for(int i=0; i<input.length; i++) {
			input[i] = sc.nextInt();
			System.out.print(comp[i] - input[i] + " ");
		}
	}

}

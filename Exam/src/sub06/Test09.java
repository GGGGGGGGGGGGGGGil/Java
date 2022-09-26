package sub06;
/*
 * 날짜 : 2022/09/26
 * 이름 : 길은섭
 * 내용 : 자바 총정리 연습문제
 */
public class Test09 {
	
	public static void main(String[] args) {
		
	}
	
	public static void pyramid(int n) {
		
		for(int i = 1; i <= n; i++) {
			
			for(int j = i; j < n; j++)
				System.out.print(" ");
			
			for(int k = 1;  k++)
				System.out.print("*");
					
			System.out.print("\n");
		}
	}
}

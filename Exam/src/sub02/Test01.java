package sub02;

/*
 * 날짜 : 2022/08/26
 * 이름 : 길은섭
 * 내용 : 자바 배열 문자 출력 연습문제
 */
public class Test01 {
	public static void main(String[] args) {
		
		char str[] = {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'Y', 'O', 'U'};
		int row, col;
		
		for (row = 1; row < 10; row++) {
			
			for (col = 0; col <= row ; col++) {
				
				System.out.print(str[col]);
				
			}
			
			System.out.println("\n");
			
		}
		
		char arr[] = {'J', ' ', 'a', 'v', 'a', ' ', 'E', 'c', 'l', 'i', 'p', 's', 'e'};
		int var1, var2;
		
		for(var1 = 1; var1 <= 12; var1++) {
			
			for(var2 = 0; var2 <= var1; var2++) {
				
				System.out.print(arr[var2]);
			}
			
			System.out.println("\n");
		}
		
		
		
		
			
	}
	

}

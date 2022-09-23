package sub05;

/*
 * 날짜 : 2022/09/23
 * 이름 : 길은섭
 * 내용 : 자바 총정리 연습문제
 */
public class Test08 {
	public static void main(String[] args) {
		
		for(int y = 1; y <= 9; y++) {
			
			for(int x = 2; x <= 9; x++) {
				System.out.printf("%d x %d = %2d\t", x, y, x*y); //%2d\t = 출력 자릿수, tab
			}
			System.out.print("\n");
		}
	}

}

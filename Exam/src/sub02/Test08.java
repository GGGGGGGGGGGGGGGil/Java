package sub02;

/*
 * 날짜 : 2022/08/26
 * 이름 : 길은섭
 * 내용 : 자바 팩토리얼 재귀 메서드 연습문제
 */
public class Test08 {
	public static void main(String[] args) {
		
		System.out.println("3! = "+factorial(3));
		System.out.println("4! = "+factorial(4));
		System.out.println("5! = "+factorial(5));
		
		System.out.println("");
		
		System.out.println("10! = "+fact(10));
		System.out.println("15! = "+fact(15));
		System.out.println("20! = "+fact(20));
		System.out.println("19! = "+fact(19));
	}
	
	public static int factorial(int n) { //메서드에서 다시 메서드를 호출하는걸 재귀 메서드
		
		if (n <= 1) {
			return 1;
		}
		
		return n * factorial(n-1);
	}
	
	//코드 리뷰
	public static long fact(long aL) {
		
		if(aL <= 1) {
			return 1;
		}
		
		return aL * fact(aL - 1);
	}
	
}

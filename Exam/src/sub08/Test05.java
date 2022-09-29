package sub08;

/*
 * 날짜 : 2022/09/29
 * 이름 : 길은섭
 * 내용 : 자바 총정리 연습문제
 */
@FunctionalInterface
interface NumericLambda {
	boolean test(int n);
}

public class Test05 {
	
	public static void main(String[] args) {
		
		NumericLambda isEven = n -> (n % 2) == 0; //괄호, 중괄호 생략
		
		if(isEven.test(2)) {
			System.out.println("2는 짝수");
		}
		
		if(!isEven.test(3)) {
			System.out.println("3은 짝수 아님");
		}
		
		NumericLambda isnonNeg = n -> n >= 0;
		
	}

}

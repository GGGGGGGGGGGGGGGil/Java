package sub1;

/*
 * 날짜 : 2022/09/20
 * 이름 : 길은섭
 * 내용 : 람다식 실습하기
 * 
 * 람다식
 *  - 함수형 프로그래밍을 지원하기 위한 구문형식
 *  - 자바에서는 @FunctionalInterface 인터페이스를 이용해서 람다식 정의
 */
public class LambdaTest {
	public static void main(String[] args) {
		
		//람다식 정의(익명 함수)
		Type1 t1 = () -> { System.out.println("Type1 람다식 실행"); }; //(매개변수){함수}
		Type2 t2 = (x) -> {
			System.out.println("Type2 람다식 x : " + x);
		}; //람다식은 변수 생략o
		
		Type3 t3 = (x, y) -> {
			return x + y;
		};
		
		//람다식 호출
		t1.f();
		t2.f(3);
		int result = t3.f(2, 3);
		
		System.out.println("result : " + result);
		
	}
}

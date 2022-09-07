package sub4;

/*
 * 날짜 : 2022/09/07
 * 이름 : 길은섭
 * 내용 : 수학 클래스 실습하기
 */
public class MathTest {
	public static void main(String[] args) {
		
		//수학관련 메서드
		System.out.println("절대값 : " + Math.abs(-5));
		System.out.println("제곱근 : " + Math.sqrt(9)); //어떤수를 제곱해서 9가 나오는 수
		System.out.println("올림값 : " + Math.ceil(1.2)); //올려서 가장 가까운 정수인 2가 됨
		System.out.println("올림값 : " + Math.ceil(1.8));
		System.out.println("내림값 : " + Math.floor(1.2)); //뒤에 실수만 지우면됨
		System.out.println("내림값 : " + Math.floor(1.8));
		System.out.println("반올림 : " + Math.round(1.2));
		System.out.println("반올림 : " + Math.round(1.8));
		
		//random
		double num1 = Math.random(); //Math는 객체 생성없이 바로 메서드로 호출
		System.out.println("num1 : " + num1); //0 ~ 1 사이에 실수가 랜덤으로
		
		double num2 = num1 * 10;
		System.out.println("num2 : " + num2); //1 ~ 10 사이에 실수
		
		double num3 = Math.ceil(num2);
		System.out.println("num3 : " + num3); //1 ~ 10 사이에 정수
		
		//1에서 45사이 정수
		double rNum = (int) Math.ceil(Math.random() * 45);
		System.out.println("rNum : " + rNum);
		
	}

}

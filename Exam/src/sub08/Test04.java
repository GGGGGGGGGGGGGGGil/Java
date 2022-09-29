package sub08;


/*
 * 날짜 : 2022/09/29
 * 이름 : 길은섭
 * 내용 : 자바 총정리 연습문제
 * 
 * - 제네릭 클래스도 있다
 */
public class Test04 {
	public static void main(String[] args) {
		
		int 	i = 5;
		char 	c= 'A';
		float 	f = 3.14f;
		double 	d =31.4;
		boolean b = true;
		String 	s = "Hello";
		
		printArgInfo(i);
		printArgInfo(c);
		printArgInfo(f);
		printArgInfo(d);
		printArgInfo(b);
		printArgInfo(s);
	}
	
	public static <T> void printArgInfo(T arg) { //제네릭(T)로 모두다 참조
		System.out.println("타입 : " + arg.getClass());
		System.out.println("값 : " + arg.toString());
	}
}

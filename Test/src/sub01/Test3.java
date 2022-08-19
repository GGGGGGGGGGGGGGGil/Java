package sub01;

/*
 * 날짜 : 2022/08/19
 * 이름 : 길은섭
 * 내용 : 자바 자료형 연습문제
 */
public class Test3 {
	public static void main(String[] args) {
		
		int num = 1;
		int result = 0;	//0으로 초기화
		
		result = num++;	//num은 정수 곧 int만 가능
		System.out.println("result : "+result);
		
		result = ++num;
		System.out.println("result : "+result);
		
		result = num--;
		System.out.println("result : "+result);
		
		result = --num;
		System.out.println("result : "+result);
	}

}

package sub1;


/*
 * 날짜 : 2022/09/05
 * 이름 : 길은섭 
 * 내용 : 예외처리 실습하기
 * 
 * 예외처리(EXception)
 *  - 예외는 프로그램 실행중에 발생하는 모든 오류(Error)
 *  - 실행중에 발생하는 오류를 대처하고 안정적인 프로그램 개발을 위해 예외처리 수행
 */
public class TryTest {
	public static void main(String[] args) {
		
		//예외상황1 : 어떤수를 0으로 나눌때(프로그램 에러발생)
		int num1 = 1;
		int num2 = 0;
		int r1 = 0, r2 = 0, r3 = 0, r4 = 0;
		
		try { //트라이 안에서만 선언된 지역변수라 결과 안나옴
			r1 = num1 + num2;
			r2 = num1 - num2;
			r3 = num1 * num2;
			r4 = num1 / num2;
		}catch(ArithmeticException e) {
			//예외가 발생했을 때 처리할 코드로직
			e.printStackTrace(); //에러 내용을 그냥 출력
		}
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		System.out.println("r4 : "+r4); 
		//에러가 발생했지만 예외처리로 정상적으로 출력됨
		
		
		//예외상황2 : 배열의 인덱스 범위를 벗어났을 때
		int[] arr = {1, 2, 3, 4, 5};
		
		try {
			for(int i=0; i<=5; i++) { //for안에서 예외처리 가능
				System.out.println("arr[i] : "+arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		//예외상황3 : NULL 포인트 참조에러
		Animal animal = null; //Heap 메모리에 Animal 인스턴스를 생성X, null포인트라함
		
		try {
			animal.move();
			animal.hunt();
			
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		
		//예외상황4 : Casting 에러
		Animal a1 = new Tigar(); //업캐스팅(다형성)
		Animal a2 = new Eagle(); //업캐스팅(다형성)
		
		try {
			Eagle eagle = (Eagle) a1; //다운캐스팅
			eagle.move();
			eagle.hunt();
			
		}catch(ClassCastException e) {
			
			Tigar tigar = (Tigar) a1;
			tigar.move();
			tigar.hunt();
			
		}finally {
			//정리코드
			System.out.println("캐스팅 완료...");
		}
		
		
		System.out.println("프로그램 종료...");
	}

}

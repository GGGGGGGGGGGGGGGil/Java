package sub99;

public class ClassTest {
	
	public static void main(String[] args) {
		
		//객체 생성
		Car sonata = new Car();
		
		//객체 속성 초기화 private 했기 때문에 초기화 지움

		//객체 기능 실행
		sonata.speedUp(100);
		sonata.speedDown(40);
		sonata.show();
		
		//객체 생성
		Car toyota = new Car();
		
		//객체 속성 초기화
		
		//객체 기능 실행
		toyota.speedUp(80);
		toyota.speedDown(40);
		toyota.show();
		
		
	
		
		
	}

}

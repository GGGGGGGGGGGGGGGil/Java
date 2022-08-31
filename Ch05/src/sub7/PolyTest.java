package sub7;

/*
 * 날짜 : 2022/08/31
 * 이름 : 길은섭
 * 내용 : 다형성 실습하기(정말 중요!!!)
 * 
 *  - 다형성이란 참조 변수의 타입 선언을 부모 타입으로 선언하는 것
 * 다형성(Polymorphism)
 *  - 상속관계에서 부모클래스의 기능이 자식클래스에서 여러 기능으로 변하는 특성 
 *  - 객체의 타입선언을 부모클래스 타입으로 선언하는 것
 *  - 다형성을 이용해서 프로그래밍의 중복을 줄이고 유연성 높인다. 
 *  - 결합성의 단점을 보완하고 응집도를 높이는 방법 중에 하나가 다형성이다.
 */ 
public class PolyTest {
	public static void main(String[] args) {
		
		//다형성을 적용한 객체 생성(업캐스팅)
		Animal a1 = new Tigar(); //다형성을 위해 부모 타입으로
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
		
		a1.move();
		a2.move();
		a3.move();
		
		a1.hunt();
		a2.hunt();
		a3.hunt();
		
		//객체 타입 다운캐스팅
		Tigar tigar = (Tigar) a1; //마우스로 캐스팅 연산 표시
		Eagle eagle = (Eagle) a2;
		Shark shark = (Shark) a3;
		
		tigar.move();
		eagle.move();
		shark.move();
		
		//객체 타입 연산 
		if(a1 instanceof Tigar) { //메모리상의 객체를 인스턴스라 함
			System.out.println("a1은 Tigar입니다.");
		}
		
		if(a2 instanceof Eagle) {
			System.out.println("a2은 Eagle입니다.");
		}
		
		if(a3 instanceof Shark) {
			System.out.println("a3은 Shark입니다.");
		}
		
	}

}

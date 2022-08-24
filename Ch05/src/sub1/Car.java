package sub1;

//클래스 정의
public class Car {
	
	//자동차의 속성(변수)
	String name;
	String color;
	int speed;	//전역 변수
	
	//자동차의 기능(메서드)
	public void speedUp(int speed) {
		this.speed += speed;	//지역 변수 그래서 맞지 않믐
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println("차량명 : "+ this.name);	//show에서 참조 하는건 변수라 this 안 붙여도 됨
		System.out.println("차량색 : "+ this.color);
		System.out.println("속도 : "+ this.speed);
	}
	
}

package sub99;

//클래스 정의
public class Car {
	
	//자동차의 속성(변수) private 내부 변수를 보호한다면 객체초기화 값을 지우고 생성자 만들어야함
	private String name;
	private String color;
	private int speed; //전역변수
	
	//생성자(반환타입 x)
	public Car(String name, String color, int speed) {
		this.name = name;   //지역변수
		this.color = color;
		this.speed = speed;
	}
	
	
	//자동차의 기능(메서드)
	public void speedUp(int speed) {  //static은 쓰지 않는다
		this.speed += speed; //지역변수와 맞추기 위해서 앞에 this. 붙인다 
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println("차량명 : "+ this.name);
		System.out.println("차량색 : "+ this.color);
		System.out.println("속도 : "+ this.speed);
		
	}

}

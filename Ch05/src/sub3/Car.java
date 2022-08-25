package sub3;

public class Car {
	
	//속성
	private String name;
	private String color;
	private int speed;
	public static int count; //Class Area에 생성됨
	
	public Car(String name, String color, int speed) { //생성자
		this.name = name;
		this.color = color;
		this.speed = speed;
		count++;
	}
	
	//기능
	public void speedUp(int speed) {
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show(){
		System.out.println("차량명 : "+name);
		System.out.println("차량색 : "+color);
		System.out.println("속도 : "+speed);
		System.out.println("차량번호 : "+count);
	}

}

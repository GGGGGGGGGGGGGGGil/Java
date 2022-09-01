package sub1;

public abstract class Car { //추상 클래스가 되기 때문에 abstract 붙임
	
	protected String name;
	protected String color;
	protected int speed;
	
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}
	
	//기능(추상메서드)
	public abstract void speedUp(int speed); //메서드만 선언 추상 메서드라 함
	public abstract void speedDown(int speed);
	
	public void show() {
		System.out.println("차량명 : "+name);
		System.out.println("차량색 : "+color);
		System.out.println("차량속도 : "+speed);
	}
}

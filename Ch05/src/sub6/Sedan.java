package sub6;

public class Sedan extends Car {
	
	private int cc; //카에서 네임, 컬러, 스피드 상속받음
	
	public Sedan(String name, String color, int speed, int cc) {
		super(name, color, speed);
		this.cc = cc;
	}
	
	@Override
	public void speedUp(int speed) {
		this.speed += speed + 20;
	}
	
	public void speedTurbo() {
		this.speed += 30;
	}
	
	public void show() {
		System.out.println("차량명 : "+name);
		System.out.println("차량색 : "+color);
		System.out.println("속도 : "+speed);
		System.out.println("배기량 : "+cc);
	}
}

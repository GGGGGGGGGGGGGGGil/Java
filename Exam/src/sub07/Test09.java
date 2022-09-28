package sub07;

/*
 * 날짜 2022/09/28
 * 이름 : 길은섭
 * 내용 : 자바 총정리 연습문제
 */
interface Tv { //람다식으로 이어지기도 함
	public void turnOn();
	public void turnOff();
}

public class Test09 {
	public static void main(String[] args) {
		
		Tv tv = new Tv() { //인터페이스를 바로 구현
			@Override
			public void turnOn() {
				System.out.println("Tv를 켭니다.");
			}
		};
			
	}

}

package sub4;

/*
 * 날짜 : 2022/08/25
 * 이름 : 길은섭
 * 내용 : 싱글톤 객체와 인스턴스 객체 실습
 */
class Adder { //하나의 클래스 파일 안에 클래스를 또 만들 수 있음
	public static int x;
	
	public void add(int _x) {
		x = _x;
	}
	
	public void add(int[] arr) {
		arr[0]++;
	}
	
	public static void add(Adder a1) {	//에더라 참조 변수
		a1.x += 20;
	}
	
	public static Adder add(Adder a2, int value) {
		return new Adder();
	}
}


public class AdderTest {
	
	public static void main(String[] args) {
		
		int[] arr = new int[3]; //3개 짜리 배열 생성
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		Adder adder = new Adder();
		
		adder.add(1);
		System.out.println("1) x : " + Adder.x);
		
		adder.add(arr);
		System.out.println("2) x : " + Adder.x);
		
		Adder.add(adder);
		System.out.println("3: x : " + Adder.x);
		
		Adder a2 = Adder.add(adder, 0);	//리턴값 있어서 대입연산자
		System.out.println("4) x : " + Adder.x);
	}

}

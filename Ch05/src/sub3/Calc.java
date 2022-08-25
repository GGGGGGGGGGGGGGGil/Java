package sub3;

public class Calc {	//특별하지 않아서(범용성) 별로 필요없는 객체를 싱글통으로 처리
					//외부에서 프라이빗으로 참조 못하게 막음
	private static Calc instance = new Calc();
	
	public static Calc getInstance() {
		return instance;
	}
	
	private Calc() {}
	
	public int plus(int x, int y) {
		return x + y;
	}
	
	public int minus(int x, int y) {
		return x - y;
	}
	
	public int multi(int x, int y) {
		return x * y;
	}
	
	public int div(int x, int y) {
		return x / y;
	}
	
	
}

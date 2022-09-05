package sub2;

/*
 * 날짜 : 2022/09/05
 * 이름 : 길은섭
 * 내용 : 예외던지기 실습하기
 */
public class ThrowTest {
	public static void main(String[] args) {
		
		Calc cal = Calc.getInstance();
		
		int r1 = cal.plus(1, 2);
		int r2 = cal.minus(1, 2);
		
		int r3 = 0;
		int r4 = 0;
		
		try {
			r3 = cal.multi(2, 0); //0이하 일때 예외처리 발동됨
			r4 = cal.div(4, 0); 
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		System.out.println("r1 :"+r1);
		System.out.println("r2 :"+r2);
		System.out.println("r3 :"+r3);
		System.out.println("r4 :"+r4);
		
	}

}

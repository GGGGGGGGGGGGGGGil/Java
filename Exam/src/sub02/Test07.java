package sub02;

/*
 * 날짜 : 2022/08/26
 * 이름 : 길은섭
 * 내용 : 자바 최대공약수 메서드 연습문제
 */
public class Test07 {
	public static void main(String[] args) {
		
		System.out.println("   1과   5의 최대공약수 : "+gcd(1, 5));
		System.out.println("   3과   6의 최대공약수 : "+gcd(3, 6));
		System.out.println("  12과  18의 최대공약수 : "+gcd(12, 18));
		System.out.println("  60과  24의 최대공약수 : "+gcd(60, 24));
		System.out.println(" 192과 162의 최대공약수 : "+gcd(192, 162));
		
		System.out.println("");
	
		System.out.println("  46과  90의 최대공약수 : "+num(46, 90));
		System.out.println("  10과 100의 최대공약수 : "+num(10, 100));
		System.out.println("  30과  90의 최대공약수 : "+num(30, 90));
		System.out.println("  66과   5의 최대공약수 : "+num(66, 5));
		System.out.println(" 7890과 40의 최대공약수 : "+num(7890, 40));
	}
	
	//최대공약수 메서드 정의
	public static int gcd(int a, int b) {
		
		int temp = 0;
		
		if (a < b) {
			temp = a;
		}else {
			temp = b;
		}
		
		while (true) {
			
			if (a % temp == 0 && b % temp == 0) {
				break;
			}
			temp--;
		}
		return temp;
	}
	

	//코드 리뷰
	public static int num(int c, int d) {
		
		int temp = 0;
		
		if(c < d) {
			temp = c;
		}else {
			temp = d;
		}
		
		while(true) {
			
			if(c % temp == 0 && d % temp == 0) {
				break;
			}
			temp--;
		}
		return temp;
	}
	
	
	

}

package sub88;


public class Test3 {
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			
			for(int k=0; k<5-i; k++) {
				System.out.print("☆");
			}
			
			for(int j=0; j<i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0; i<4; i++) {
			
			for(int k=3; k>i; k--) {
				System.out.print("☆");
			}
			
			for(int j=0; j<i*2+1; j++) {
				System.out.print("★");
			}
			for(int k=3; k>i; k--) {
				System.out.print("☆");
			}
			System.out.println();
		}
	}

}
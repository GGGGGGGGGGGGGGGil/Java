package sub99;

public class Pratice {
	public static void main(String[] args) {
		
		//배열
		int    arr1[] = {1, 2, 3};
		char   arr2[] = {'A', 'B', 'C'};
		String arr3[] = {"서울", "대전", "대구", "부산", "광주"};
		
		//배열 원소 출력
		System.out.println("arr3[0] : "+arr3[0]);
		System.out.println("arr3[4] : "+arr3[4]);
		System.out.println("arr3[2] : "+arr3[2]);
		
		System.out.println("arr1의 배열 길이 :"+arr1.length);
		System.out.println("arr2의 배열 길이 :"+arr2.length);
		System.out.println("arr3의 배열 길이 :"+arr3.length);
		
		//배열 반복문
		for(int a=0; a<arr1.length; a++) {
			System.out.println("arr1["+a+"] : "+arr1[a]);
		}
		
		for(char ch : arr2) {
			System.out.print(ch+" ");
		}
		
		for(String city : arr3) {
			System.out.printf("%s ", city);
		}
		System.out.println();
		
		//1차원 배열(리니어 선형 구조)
		int scores[] = {80, 60, 78, 62, 92};
		int total = 0;
		
		for(int score : scores) {
			total += score;
		}
		
		System.out.println("scores의 합 : "+total);
		
		
		
	}

}

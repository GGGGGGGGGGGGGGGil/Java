package sub02;

/*
 * 날짜 : 2022/08/26
 * 이름 : 길은섭
 * 내용 : 자바 배열 최대값 찾기 연습문제
 */
public class Test02 {
	public static void main(String[] args) {
	
	int arr[] = { 17, 92, 18, 33, 58, 7, 26, 42 };
	
	int maxNum = arr[0];
	
	for ( int i = 0; i < 8; i++) {
		
		if ( maxNum < arr[i]) {
			maxNum = arr[i];
		}
	}
	
	System.out.println("배열 arr에서 가장 큰 수 : "+maxNum);
	
	int str[] = { 17, 92, 18, 33, 58, 7, 26, 42 };
	
	int minNum = str[0];
	
	for(int a = 0; a <= 7; a++) {
		
		if(minNum > str[a]) {
			minNum = str[a];
		}
	}
	System.out.println("배열 str에서 가장 작은 수 : "+minNum);
	}
}

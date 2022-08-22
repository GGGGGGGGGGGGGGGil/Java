package sub2;

/*
 * 날짜 : 2022/08/22
 * 이름 : 길은섭
 * 내용 : Java 다차원 배열 실습하기
 */
public class MultiArrayTest {
	public static void main(String[] args) {
		
		//1차원 배열(Linear선형)
		int []scores = {80, 60, 78, 62, 92};
		int total = 0;
		
		for(int score : scores) {
			total += score;
		}
		
		System.out.println("scores의 합 : "+total);
		
		//2차원 배열(면에 표로 저장함)
		int arr2d[][] = {{1,  2,  3,  4},
						 {5,  6,  7,  8},
						 {9, 10, 11, 12}};
		
		System.out.println("arr2d[0][0] : "+arr2d[0][0]);
		System.out.println("arr2d[0][1] : "+arr2d[0][1]);
		System.out.println("arr2d[0][2] : "+arr2d[0][2]);
		System.out.println("arr2d[0][3] : "+arr2d[0][3]);
		
		System.out.println("arr2d[1][0] : "+arr2d[1][0]);
		System.out.println("arr2d[1][1] : "+arr2d[1][1]);
		System.out.println("arr2d[1][2] : "+arr2d[1][2]);
		System.out.println("arr2d[1][3] : "+arr2d[1][3]);
		
		System.out.println("arr2d[2][0] : "+arr2d[2][0]);
		System.out.println("arr2d[2][1] : "+arr2d[2][1]);
		System.out.println("arr2d[2][2] : "+arr2d[2][2]);
		System.out.println("arr2d[2][3] : "+arr2d[2][3]);
		
		for(int a=0; a<3; a++) {
			for(int b=0; b<4; b++) {
				System.out.println("arr2d["+a+"]["+b+"] : "+arr2d[a][b]);
			}
		}
		
		//3차원 배열(2차원 배열 3개로 볼 수 있다)
		int[][][] arr3d = {{{1,  2,  3},
            				{4,  5,  6},
            				{7,  8,  9}}, 
						   {{10, 11, 12},
            				{13, 14, 15},
            				{16, 17, 18}}, 
						   {{19, 20, 21},
            				{22, 23, 24},
            				{25, 26, 27}}};


		for(int a=0; a<3; a++) {
				for(int b=0; b<3; b++) {
						for(int c=0; c<3; c++) {
							System.out.printf("arr3d[%d][%d][%d] : %d\n", a, b, c, arr3d[a][b][c]);	
				}
			}
		}

	}
}
package sub08;

import java.util.StringTokenizer;

/*
 * 날짜 : 2022/09/29
 * 이름 : 길은섭
 * 내용 : 자바 총정리 연습문제
 */
public class Test01 {
	public static void main(String[] args) {
		
		String[] arr1 = { "Apple", "Banana", "Grape", "Orange" };
		String result1 = String.join("-", arr1);
		System.out.println("result1 : " + result1);
		
		String[] arr2 = result1.split("-");
		String result2 = String.join("", arr2);
		System.out.println("result2 : " + result2);
		
		String[] arr3 = result2.split("(?=[A-Z])"); //대문자이면 쪼갠다(정규 표현식)
		String result3 = String.join("^", arr3);
		System.out.println("result3 : " + result3);
		
		StringTokenizer st = new StringTokenizer(result3, "^");
		StringBuilder sb = new StringBuilder();
		
		while(st.hasMoreElements()) {
			sb.append(st.nextToken()); //문자열 연결
		}
			
		String result4 = sb.toString();
		System.out.println("result4 : " + result4);
			
	}
}

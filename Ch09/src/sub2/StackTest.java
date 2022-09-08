package sub2;

import java.util.Stack;

/*
 * 날짜 : 2022/09/08
 * 이름 : 길은섭
 * 내용 : 자료구조 스택 실습하기
 */
public class StackTest {
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>(); //기본변수(원시변수) 적용x 래퍼 변수로 사용
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		while(stack.empty()) {
			System.out.println(stack.pop());
		}
	}

}

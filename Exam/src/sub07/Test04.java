package sub07;

/*
 * 날짜 2022/09/28
 * 이름 : 길은섭
 * 내용 : 자바 총정리 연습문제
 */
class Person {
	private String name;
	private int age;
	
	
	
	
	protected void Hello() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}

class Student extends Person {
	private int studentId;
	
	
	
	
	
	
	public void Hello() {
		
		System.out.println("학번 : " + studentId);
	}
}

class Worker extends Person {
	private int workerId;
	
	
	
	
	
	
	public void Hello() {
		
		System.out.println("사번 : " + workerId);
	}
}

public class Test04 {
	public static void main(String[] args) {
		Student kim = new Student("김유신", 21, 20201234);
		Worker lee = new Worker("이순신", 35, 20211201);
		
		kim.Hello();
		lee.Hello();
	}
}

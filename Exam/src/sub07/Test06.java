package sub07;

/*
 * 날짜 2022/09/28
 * 이름 : 길은섭
 * 내용 : 자바 총정리 연습문제
 */
class _Person {
	private String name;
	private int age;
	
	
	
	
	
	
	public void Hello() {
		System.out.println("-----------");
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
	}
}

class _Student extends _Person {
	private String school;
	private String major;
	
	
	
	
	
	
	@Override
	public void Hello() {
		???
		System.out.println("학교 : " + school);
		System.out.println("전공 : " + marjor);
	}
}

class _SalaryStudent extends _Student {
	private String company;
	
	
	
	
	
	
	@Override
	public void Hello() {
		
		System.out.println("회사 : " + company);
	};
}

public class Test06 {
	public static void main(String[] args) {
		_Person kim = new _Person("김유신", 24);
		_Student jang = new _Student("장보고", 26, "부경대", "영문학과");
		_SalaryStudent lee = new _SalaryStudent("이순신", 27, "부산대", "경제학과"
																	 "삼성전자");
		
		kim.Hello();
		jang.Hello();
		lee.Hello();
	}

}

package ch02;

public class P60 {
	public static void main(String[] args) {
		var i = 10;        //int i = 10d으로 컴파일됨
		var j = 10.0;      //double = 10.0으로 컴파일됨
		var str = "hello"; //String str = "hello"로 컴파일됨
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test";
		//str = 3;
	}

}

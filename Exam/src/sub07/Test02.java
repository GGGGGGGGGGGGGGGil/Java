package sub07;

/*
 * 날짜 2022/09/28
 * 이름 : 길은섭
 * 내용 : 자바 총정리 연습문제
 */
class Artists
{
	public String name;
	public String country;
	public int birth;
	
	public Artists(String name, String country, int birth) {
		this.name 	 = name;
		this.country = country;
		this.birth   = birth;
	}
	
	public String show() {
		return String.format("%s", "%s", "%d", name , country, birth);
	}
}

public class Test02 {
	public static void main(String[] args) {
		
		Artists[] famousArts = {
				new Artists("레오나르도")
		};
		
		for(Artists art : famousArts) {
			System.out.println(art.show());
		}
	}

}

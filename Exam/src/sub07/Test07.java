package sub07;

/*
 * 날짜 2022/09/28
 * 이름 : 길은섭
 * 내용 : 자바 총정리 연습문제
 */
???
???
???
		
class BaseBallPlayer implements Player {
	@Override
	public void play() {
		System.out.println("야구를 합니다.");
	}
}

class FootBallPlayer implements Player {
	@Override
	public void play() {
		System.out.println("축구를 합니다.");
	}
}

public class Test07 {
	public static void main(String[] args) {
		
		??? p1 = new BaseBallPlayer();
		??? p2 = new BaseBallPlayer();
		
		playGame(p1);
		playGame(p2);
	}
	
	public static void playGame() {
		p.play();
	}
}

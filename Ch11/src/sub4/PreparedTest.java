package sub4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

/*
 * 날짜 : 2022/09/14
 * 이름 : 길은섭
 * 내용 : JDBC PreparedStatement 실습하기
 *  - 스테이먼트보다 더 많이 쓰임!!!
 */
public class PreparedTest {
	public static void main(String[] args) {
		
		//DB정보
		String host = "jdbc:mysql://127.0.0.1:3306/java1db";
		String user = "root";
		String pass = "1234";
		
		try {
			
		//1단계 - JDBC 드라이버 로드
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2단계 - 데이터베이스 접속
		Connection conn = DriverManager.getConnection(host, user, pass);
		
		//3단계 - SQL 실행객체 생성
		String sql = "INSERT INTO `User1` VALUES (?,?,?,?);"; //? 매핑
		PreparedStatement psmt = conn.prepareStatement(sql);
		psmt.setString(1, "a210");	//쿼리문의 데이터를 매핑(사상) 시켜주는것
		psmt.setString(2, "홍길동");
		psmt.setString(3, "010-1110-2221");
		psmt.setInt(4, 27);
		
		//4단계 - SQL 실행
		psmt.executeUpdate();
		
		//5단계 - 결과 처리
		//6단계 - 자원 해체
		psmt.close();
		conn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Insert 완료...");
		
	}
}

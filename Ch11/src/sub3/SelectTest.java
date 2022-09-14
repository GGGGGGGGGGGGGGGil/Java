package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * 날짜 : 2022/09/14
 * 이름 : 길은섭
 * 내용 : !!!JDBC SQL Select 실습하기!!!
 */
public class SelectTest {
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
			Statement stmt = conn.createStatement();
			
			//4단계 - SQL 실행
			String sql = "SELECT * FROM `User1`;";
			ResultSet rs = stmt.executeQuery(sql); //SELECT는 무조건 !!!Query!!!
			
			//5단계 - 결과 처리(SELECT 만)
			while(rs.next()) { //커서를 한칸 내림(next)
				
				System.out.printf("%s,%s,%s,%d\n", rs.getString(1), //아이디,이름,전화번호,나이 순으로
												   rs.getString(2),
												   rs.getString(3),
												   rs.getInt(4));
			}
			
			//6단계 - 자원 해체
			rs.close();
			stmt.close();
			conn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Select 완료...");
	}

}

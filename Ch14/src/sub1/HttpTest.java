package sub1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/*
 * 날짜 : 2022/09/21
 * 이름 : 길은섭
 * 내용 : HTTP 통신 실습하기
 * 
 * HTTP 통신
 *  - TCP/IP 프로토콜을 이용한 단방향 통신(Stateless)
 *  - 일반적인 웹 프로그래밍은 HTTP 통신을 이용
 */
public class HttpTest {
	public static void main(String[] args) {
		
		try {
			URL url = new URL("https://google.com"); //주소가 잘못될수 있어서 오류나타남(예외처리O)
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			
			String line = null;
			
			while((line = br.readLine()) !=null) {
				System.out.println(line);
			}
			
			br.close();
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

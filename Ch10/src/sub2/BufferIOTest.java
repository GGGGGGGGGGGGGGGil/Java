package sub2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 날짜 : 2022/09/13
 * 이름 : 길은섭
 * 내용 : 보조 스트림 실습하기
 * 
 * 버퍼 스트림
 *  - 기본 입출력에 Buffer를 추가해서 빠른 입출력을 지원하는 스트림
 *  - 기본 입출력에 무조건 장착해야 실행 성능 향상
 */
public class BufferIOTest {
	public static void main(String[] args) {
		
		String path = "C:\\Users\\java1\\Desktop\\Java.pdf"; 	//스트림 연결할 파일 경로
		String target = "C:\\Users\\java1\\Desktop\\Java2.pdf"; //파일 자체가 데이터
		
		try {
			FileInputStream fis = new FileInputStream(path);
			FileOutputStream fos = new FileOutputStream(target);

			//보조 스트림(Buffer) 생성 연결
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			while (true) {
				
				int value = bis.read();
				
				if(value == -1) {
					//파일을 모두 읽었으면 종료
					break;
				}
				
				char c = (char) value; //int char 서로 캐스팅O
				//System.out.print(c);
				
				//파일 쓰기
				bos.write(value);
			}
			//스트림 해제
			bis.close();
			bos.close();
			fis.close();
			fos.close();
			
			System.out.println("쓰기 완료!");
			
		} catch (Exception e) { //다형성위해 Exception만
			e.printStackTrace();
		}
		
		
	}

}

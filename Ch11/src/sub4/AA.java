package sub4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class AA {
	public static void main(String[] args) {
		
		//프로퍼티 생성
		Properties prop = new Properties();
		prop.setProperty("A", "Apple");
		prop.setProperty("B", "Banana");
		prop.setProperty("C", "Cherry");
		
		System.out.println(prop);
		
		String path = "C:\\Users\\java1\\Desktop\\Fruit.properties";
		
		//프로퍼티 파일 생성
		try {
			FileOutputStream fos = new FileOutputStream(path);
			prop.store(fos, null);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로퍼티 파일 생성완료...");
		
		//프로퍼티 객체 생성(파일로 부터)
		String target = "C:\\Users\\java1\\Desktop\\Cities.properties";
		Properties propCities = new Properties();
		
		try {
			FileInputStream fis = new FileInputStream(target);
			propCities.load(fis);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(propCities);
		System.out.println(propCities.getProperty("kor"));
		System.out.println(propCities.getProperty("jpn"));
		System.out.println(propCities.getProperty("usa"));
		
		System.out.println("프로퍼티 객체 생성완료...");
	}

}

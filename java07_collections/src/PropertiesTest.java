import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest {

	public PropertiesTest() {
		// Properties컬렉션 : Key, value가 모두 String인 컬렉션.
		Properties prop = new Properties();
		
		//객체 추가
		prop.setProperty("네이버", "https://www.naver.com");
		prop.setProperty("네이트", "https://www.nate.com" );
		prop.setProperty("다음" , " https://www.daum.net");
		prop.setProperty("구글" , " https://www.daum.net");
		
		//getProperty() : 키를 이용하여 객체 얻어오기
		System.out.println(prop.getProperty("다음"));
		
		//키 목록 전체 구하기
		Enumeration e = prop.propertyNames();
		while(e.hasMoreElements()) {//객체가 남아 있을 경우 true, 없으면 false
			//Object obj = e.nextElement();
			String str = (String)e.nextElement();
			System.out.println("key="+str+",value="+prop.getProperty(str));
		}
	}

	public static void main(String[] args) {
		

	}

}

import java.util.Calendar;
import java.util.Vector;

public class VectorTest {
	
	public VectorTest(){
		
	}

	public Vector start() {
		//Vector 컬렉션
		Vector v = new Vector();
		
		String username = "홀길동";
		Integer num = 25010;
		Calendar cal = Calendar.getInstance();
		MemberVO vo = new MemberVO("세종대왕","기획부","2021-06-10",1000);
		
		//Vector 갹체에 다른 객체 추가하기
		v.add(username);
		v.add(num);
		v.add(1,cal);
		v.addElement(vo);
		
		//v.remove(1);
		//v.remove(cal);
		
		return v;
	}
	//public static void main(String[] args) {

	//}

}
/*
 * List(interface) : index가 존재한다.
 * 저장순서를 유지한다.
 */ 

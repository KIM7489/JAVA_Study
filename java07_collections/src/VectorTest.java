import java.util.Calendar;
import java.util.Vector;

public class VectorTest {
	
	public VectorTest(){
		
	}

	public Vector start() {
		//Vector �÷���
		Vector v = new Vector();
		
		String username = "Ȧ�浿";
		Integer num = 25010;
		Calendar cal = Calendar.getInstance();
		MemberVO vo = new MemberVO("�������","��ȹ��","2021-06-10",1000);
		
		//Vector ��ü�� �ٸ� ��ü �߰��ϱ�
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
 * List(interface) : index�� �����Ѵ�.
 * ��������� �����Ѵ�.
 */ 
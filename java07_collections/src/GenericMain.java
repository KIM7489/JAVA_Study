import java.util.Calendar;

public class GenericMain {

	public GenericMain() {
		String data = "����� ������ �����";
		GenericTest gt = new GenericTest();
		gt.setUsername(data);
		
		GenericTest gt2 = new GenericTest(data);
		
		Calendar now = Calendar.getInstance();
		
		GenericTest<MemberVO> gt3 = new GenericTest<MemberVO>();
		gt3.setUsername(new MemberVO("ȫ","��ȹ��","2021-03-30",8000));
		
		GenericTest<Calendar> gt4 = new GenericTest<Calendar>(now);
		
		
	}

	public static void main(String[] args) {
		
	}

}

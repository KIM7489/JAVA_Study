

import java.util.Calendar;

public class StaticTestMain {

 public static void main(String[] args) {
	 StaticTest ss = new StaticTest();
	 StaticTest ss2 = new StaticTest();
	 
	 ss.setAddr("��������");
	 
	 String address = ss2.getAddr();
	 System.out.println("address=" + address);
	 //static ��������� ��ü�������� �ʰ� ����Ҽ� �ִ�.
	 System.out.println("name="+ StaticTest.addr);
	 
	 Calendar now = Calendar.getInstance();
	 System.out.println(now.get(Calendar.YEAR));
 }
}
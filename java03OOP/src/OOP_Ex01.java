
import java.util.Scanner;
public class OOP_Ex01 {

	//������ �޼ҵ�
	public OOP_Ex01() {
		//int dan = daninput();
		//String result = gugudan(dan);
		//System.out.println(result);
		//System.out.println(gugudan(daninput()));
	}
	
	//���Է¹ޱ�
	int daninput(){
		Scanner scan = new Scanner(System.in);
		System.out.print("���Է�=");
		return scan.nextInt();
	}
	
	//������ ����ϱ�
	String gugudan(int dan) {
		String gugu = "";
		for(int i = 2; i<=9; i++) {
			gugu += dan+"*"+i+"="+dan*i+"\n";
		} 
	return gugu;
	}
	
	void start() {
		int dan = daninput();
		String result = gugudan(dan);
		System.out.println(gugudan(dan));
	}
	
	public static void main(String[] args) {
		OOP_Ex01 oop = new OOP_Ex01();
		
		//System.out.println(oop.gugudan(oop.daninput()));
		//oop.gugudan(oop.daninput());
		oop.start();
		
	}

}
// �ֿܼ��� ���� �Է¹ٴ�
// 		  �Է¹��� �������� ����.

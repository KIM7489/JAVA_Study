
import java.util.Scanner;
public class OOP_Ex02 {
	
	int dan; 		//�Է¹��� ���� �����Һ��� = 0
	String gugu = ""; 	//�������� ������ ����
	
	public OOP_Ex02() {
	}
	//���Է¹ޱ�
	int daninput(){
		Scanner scan = new Scanner(System.in);
		System.out.print("���Է�=");
		return scan.nextInt();
	}

	//������ ����ϱ�
	void gugudan(int dan) {
		for(int i = 2; i<=9; i++) {
			gugu += dan+"*"+i+"="+dan*i+"\n";
		}
	}
	void start() {
		dan = daninput();
		gugudan(dan);
		System.out.println(gugu);
	}
}
// �ֿܼ��� ���� �Է¹ٴ�
// 		  �Է¹��� �������� ����.

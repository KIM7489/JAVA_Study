import java.util.List;
import java.util.Scanner;

public class ArrayListTest {

	public ArrayListTest() {
	//CollectionData = al 
	Scanner scan = new Scanner(System.in);
	CollectionData data = new CollectionData(); // al = data 
	List<MemberVO> lst = data.getMember(); // 
	MemberVO vo2 = new MemberVO("ZZZ","��ȹ������","2020=05-12",12000);
	lst.remove(2);  //index�� ����
	lst.remove(vo2); // ��ü������ ���� 
	lst.add(2, vo2); 
	lst.add(vo2);
	for(int i=0; i<lst.size(); i++) {
		MemberVO vo = lst.get(i);
		vo.memverPrint();
	}
	}

	public static void main(String[] args) {
		new ArrayListTest();
		
	}

}

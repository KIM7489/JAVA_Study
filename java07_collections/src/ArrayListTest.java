import java.util.List;
import java.util.Scanner;

public class ArrayListTest {

	public ArrayListTest() {
	//CollectionData = al 
	Scanner scan = new Scanner(System.in);
	CollectionData data = new CollectionData(); // al = data 
	List<MemberVO> lst = data.getMember(); // 
	MemberVO vo2 = new MemberVO("ZZZ","기획종관부","2020=05-12",12000);
	lst.remove(2);  //index로 삭제
	lst.remove(vo2); // 객체명으로 삭제 
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

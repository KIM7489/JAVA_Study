import java.util.ArrayList;
import java.util.List;

public class CollectionData {

	public CollectionData() {
		// TODO Auto-generated constructor stub
	}
	public List<MemberVO>getMember() {
		//ArrayList���� ��������� ��Ƽ� �����Ѵ�.
		ArrayList<MemberVO> al = new ArrayList<MemberVO>();
		//List<MemberVO> al1 = new ArrayList<MemberVO>();
		al.add(new MemberVO("AAA","��ȹ��","2021-05-10",5000));
		al.add(new MemberVO("BBB","�ѹ���","2021=04=10", 600));
		al.add(new MemberVO("CCC","A����","2021=04=10", 600));
		al.add(new MemberVO("DDD","D����","2021=04=10", 600));
	
		return al;
	}
}

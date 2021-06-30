import java.util.ArrayList;
import java.util.List;

public class CollectionData {

	public CollectionData() {
		// TODO Auto-generated constructor stub
	}
	public List<MemberVO>getMember() {
		//ArrayList에서 사원정보를 담아서 리턴한다.
		ArrayList<MemberVO> al = new ArrayList<MemberVO>();
		//List<MemberVO> al1 = new ArrayList<MemberVO>();
		al.add(new MemberVO("AAA","기획부","2021-05-10",5000));
		al.add(new MemberVO("BBB","총무부","2021=04=10", 600));
		al.add(new MemberVO("CCC","A무부","2021=04=10", 600));
		al.add(new MemberVO("DDD","D무부","2021=04=10", 600));
	
		return al;
	}
}

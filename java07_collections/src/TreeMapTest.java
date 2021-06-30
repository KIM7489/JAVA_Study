import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {

	public TreeMapTest() {
		//TreeMap은 Key, value를 가진다
		//Key를 기준으로 정렬한다.
		TreeMap<String, MemberVO> tm = new TreeMap<String, MemberVO>();
		tm.put("홍길동", new MemberVO("홍길동", "기획부", "2020-10-10",5000));
		tm.put("이순신", new MemberVO("이순신", "기획부", "2020-10-10",5000));
		tm.put("세종대왕", new MemberVO("장영실", "기획부", "2020-10-10",5000));
		tm.put("유승룡", new MemberVO("장영실", "기획부", "2020-10-10",5000));
		tm.put("김삿갓", new MemberVO("장영실", "기획부", "2020-10-10",5000));
		tm.put("강사노ㄷ", new MemberVO("장영실", "기획부", "2020-10-10",5000));
		
		System.out.println("===key를 이용한 객체 얻어오기====");
		Set<String> keyList= tm.keySet();
		Iterator<String> ii = keyList.iterator();
		while(ii.hasNext()) {
			MemberVO vo = tm.get(ii.next());
			System.out.println(vo.toString());
		}
		System.out.println("=====value를 이용한 객체 얻어오기 =====");
		Collection<MemberVO> value = tm.values();
		Iterator<MemberVO> iii = value.iterator();
		while(iii.hasNext()){
			MemberVO vo = iii.next();
			System.out.println(vo.toString());
		}
	}

	public static void main(String[] args) {
		new TreeMapTest();

	}

}

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest {

	public HashMapTest() {
	
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1,"홍길동"); // 객체추가
		hm.put(100,"세종대왕");
		hm.put(50, "이순신");
		hm.put(25, "장영실");
		hm.put(33, "유승룡");
					 // Key
		String name = hm.get(100); // ->int x  Integer o 
		System.out.println("100->"+name);  /// 세종대왕 
		// HashMap에서 Key 목록을 구하여 Set에 담아준다.
		Set<Integer> KeyList = hm.keySet(); // 
		
		Iterator<Integer> ii = KeyList.iterator();
		while(ii.hasNext()) {//객체가 있으면 true, 없으면 false
			int k = ii.next();
			System.out.println("Key=" + k + ", value="+ hm.get(k));
			
		}
		
		HashMap<String, MemberVO> hm2 = new HashMap<String, MemberVO>();
		hm2.put("홍길동", new MemberVO("홍길동", "기획부", "2020-10-10",5000));
		hm2.put("이순신", new MemberVO("이순신", "기획부", "2020-10-10",5000));
		hm2.put("세종대왕", new MemberVO("장영실", "기획부", "2020-10-10",5000));
		hm2.put("유승룡", new MemberVO("장영실", "기획부", "2020-10-10",5000));
		
		
		//============== key를 이용 정보 얻어오기
		// key목록
		Set<String> memberkey= hm2.keySet();
		// Iterator
		Iterator<String> iii = memberkey.iterator();
		while(iii.hasNext()) {
			String key = iii.next();
			MemberVO value = hm2.get(key);
			
		System.out.print(value.toString());
		System.out.print(","+value.getDepart()); // Depart();
		System.out.print(","+value.getHeire()); // Sal();
		System.out.println(","+value.getSal()); // hire
		}
		System.out.println("============= value를 이용하여 정보 얻어오기");
		
		Collection<MemberVO> valuse = hm2.values();
		Iterator<MemberVO> iiii = valuse.iterator();
	}

	public static void main(String[] args) {
		new HashMapTest();

	}

}

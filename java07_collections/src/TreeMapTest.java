import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {

	public TreeMapTest() {
		//TreeMap�� Key, value�� ������
		//Key�� �������� �����Ѵ�.
		TreeMap<String, MemberVO> tm = new TreeMap<String, MemberVO>();
		tm.put("ȫ�浿", new MemberVO("ȫ�浿", "��ȹ��", "2020-10-10",5000));
		tm.put("�̼���", new MemberVO("�̼���", "��ȹ��", "2020-10-10",5000));
		tm.put("�������", new MemberVO("�念��", "��ȹ��", "2020-10-10",5000));
		tm.put("���·�", new MemberVO("�念��", "��ȹ��", "2020-10-10",5000));
		tm.put("���", new MemberVO("�念��", "��ȹ��", "2020-10-10",5000));
		tm.put("����뤧", new MemberVO("�念��", "��ȹ��", "2020-10-10",5000));
		
		System.out.println("===key�� �̿��� ��ü ������====");
		Set<String> keyList= tm.keySet();
		Iterator<String> ii = keyList.iterator();
		while(ii.hasNext()) {
			MemberVO vo = tm.get(ii.next());
			System.out.println(vo.toString());
		}
		System.out.println("=====value�� �̿��� ��ü ������ =====");
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

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest {

	public HashMapTest() {
	
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1,"ȫ�浿"); // ��ü�߰�
		hm.put(100,"�������");
		hm.put(50, "�̼���");
		hm.put(25, "�念��");
		hm.put(33, "���·�");
					 // Key
		String name = hm.get(100); // ->int x  Integer o 
		System.out.println("100->"+name);  /// ������� 
		// HashMap���� Key ����� ���Ͽ� Set�� ����ش�.
		Set<Integer> KeyList = hm.keySet(); // 
		
		Iterator<Integer> ii = KeyList.iterator();
		while(ii.hasNext()) {//��ü�� ������ true, ������ false
			int k = ii.next();
			System.out.println("Key=" + k + ", value="+ hm.get(k));
			
		}
		
		HashMap<String, MemberVO> hm2 = new HashMap<String, MemberVO>();
		hm2.put("ȫ�浿", new MemberVO("ȫ�浿", "��ȹ��", "2020-10-10",5000));
		hm2.put("�̼���", new MemberVO("�̼���", "��ȹ��", "2020-10-10",5000));
		hm2.put("�������", new MemberVO("�念��", "��ȹ��", "2020-10-10",5000));
		hm2.put("���·�", new MemberVO("�念��", "��ȹ��", "2020-10-10",5000));
		
		
		//============== key�� �̿� ���� ������
		// key���
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
		System.out.println("============= value�� �̿��Ͽ� ���� ������");
		
		Collection<MemberVO> valuse = hm2.values();
		Iterator<MemberVO> iiii = valuse.iterator();
	}

	public static void main(String[] args) {
		new HashMapTest();

	}

}

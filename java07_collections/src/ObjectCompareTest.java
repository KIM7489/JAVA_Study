import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ObjectCompareTest {

	public ObjectCompareTest() {
		
		List<MemberVO> mem = new ArrayList<MemberVO>();
		mem.add(new MemberVO("ȫ�浿", "��ȹ��", "2020-10-10", 5000));
		mem.add(new MemberVO("�̼���", "�Ѱ���", "2020-01-01", 6000));
		mem.add(new MemberVO("�念��", "�ѹ���", "2020-07-08", 3000));
		mem.add(new MemberVO("�������", "�λ��" ,"2020-02-01", 7000));
		mem.add(new MemberVO("���·�", "��ȹ��", "2020-03-05", 6000));
		mem.add(new MemberVO("���","������", "2021-02-10", 5000));
	
		System.out.println("====================���� ��====================");
		//      ���ʸ���ü : �÷��� ��ü
		for(MemberVO vo : mem) {
			System.out.println(vo.toString());
		}
		
		System.out.println("===============�޿��� ������������ ����===============");
		//             ��ü ��ü�� �ִ� �÷���, ������ ������ �ִ� Comparator��ü
		Collections.sort(mem, new CompareAscSal());
		
		for(MemberVO vo : mem) {
			System.out.println(vo.toString());
		}
		System.out.println("=============�޿��� ������������ ����================");
		Collections.sort(mem, new CompareDescSal());
		for(MemberVO vo : mem) {
			System.out.println(vo.toString());
		
		}
		System.out.println("===============�̸��� �������� ��������===============");
		Collections.sort(mem, new CompareAscName());
		for(MemberVO vo : mem) {
			System.out.println(vo.toString());
		}	
		System.out.println("===============�̸��� �������� ��������===============");
		Collections.sort(mem, new CompareDescName());
		for(MemberVO vo:mem) {
			System.out.println(vo.toString());
		}
		System.out.println("==================�Ի��� �������� ��������==============");
		Collections.sort(mem, new CompareAscHire());
		for(MemberVO vo : mem) {
			System.out.println(vo.toString());
		}
		System.out.println("==================�Ի��� �������� ��������===============");
		Collections.sort(mem, new CompareDescHire());
		for(MemberVO vo : mem ) {
			System.out.println(vo.toString());
		}
		
}
	//�����ϴ� Ŭ������ Comparator Interface�� ��ӹ޾� �����.
	//���ڸ� �̿��� �������� �����ϴ� Ŭ����
	class CompareAscSal implements Comparator<MemberVO>{
		public int compare(MemberVO v1, MemberVO v2) {
			//    ���� ��ü�� ���� ������ -, ũ�� +, ������  0�� ����
			return (v1.getSal() < v2.getSal())? -1 : (v1.getSal() > v2.getSal()? 1 : 0);
			
		}		
	}
	//���ڸ� �̿��� �������� �����ϴ� Ŭ����
	class CompareDescSal implements Comparator<MemberVO>{
		public int compare(MemberVO v1, MemberVO v2) {
			return (v1.getSal() < v2.getSal())? 1 : (v1.getSal() > v2.getSal()? -1 :0);
		}
	}
	//�̸��� ������������ �����ϴ� Ŭ����
	class CompareAscName implements Comparator<MemberVO>{
		public int compare(MemberVO v1, MemberVO v2) {
			//������ ������ ����, ������ ũ�� ���, ������ 0
			//System.out.println(v1.getName()+"->"+v1.getName().compareToIgnoreCase(v2.getName()));
			return v1.getName().compareToIgnoreCase(v2.getName());
			//          "A"                              "a" ->"A"-"a" ->65-97=-32
		}
	}
	//�̸��� ������������ �����ϴ� Ŭ����
	class CompareDescName implements Comparator<MemberVO>{
		public int compare(MemberVO v1, MemberVO v2) {
			//"A"                              "a" ->"A" - "a" -> 65-97=-32 -�� ��ȯ
			//"a"                              "A" ->"a" - "A" -> 97-65 =32
			return v2.getName().compareTo(v1.getName());
		}
	
	}
	//�Ի����� ������������ �����ϴ� Ŭ����
	class CompareAscHire implements Comparator<MemberVO>{
		public int compare(MemberVO obj1, MemberVO obj2) {
			return obj1.getHeire().compareTo(obj2.getHeire());
		}
	
	}
	//�Ի����� ������������ �����ϴ� Ŭ����
	class CompareDescHire implements Comparator<MemberVO>{
		public int compare(MemberVO obj1, MemberVO obj2) {
			return obj2.getHeire().compareTo(obj1.getHeire());
		}
		
	}
	public static void main(String[] args) {
		new ObjectCompareTest();

	}
}
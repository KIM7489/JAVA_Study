

public class MethodTest {
	//�������
	int num = 12;
	String name = "ȫ�浿";
	String tel;
	
	// ������ �޼ҵ� : ������ �ڵ� �߰� (jvm)
	// 			   ��� ���谡 �ƴҶ� �� �߰� ���ش�. 
	// �Ű������� ���������� �ٸ��ų� ������ ������ �޶�� �Ѵ�.
	MethodTest(){};
	
	MethodTest(String tel){
		System.out.println("����ó:"+tel);
	};
	//MethodTest(String name){}
	MethodTest(int number){}
	//MetgodTest(int num, int number){}
	MethodTest(int num, String name){
		// this : ���簴ü(���� Ŭ����) �����ʺ��� ����
		// ���������� �������� �ʾ����� �׳� ������ ��
		this.num = num;  
		this.name = name; 
		String tel = "1234567";
		this.tel = "02-1234-1234";
		
	}
	
	MethodTest(String name, int num){
		//������ �޼ҵ忡�� �ٸ� ������ �޼ҵ� ȣ���ϱ�
		//������ �޼ҵ忡�� �ٸ� �����ڸ� ȣ���ҋ��� �޼ҵ���� ���� ǥ���Ҽ� ����. 
		//this��� Ű���带 ����Ѵ� this()
		//MethodTest(num ,name)xxx
		//this()�� �̿��Ͽ� �ٸ� ������ �޼ҵ带 ȣ���ҋ��� �ݵ�� ù���� ���ڹ��̿����Ѵ�.
		
		
		//System.out.println("-------------");x   ù���� ���๮�� �ƴϴ�.
		//this(num, name);x
		this(num, name);	
	}
	
}

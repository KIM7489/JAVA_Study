

public class MathodMain {

	public static void main(String[] args) {		
// 	  		��ü��=instance=regerence����\
// 			������ �޼ҵ�
		MethodTest mt = new MethodTest();
		MethodTest mt2 = new MethodTest("010 4519 5201");
		MethodTest mt3 = new MethodTest(100, "�������");
		MethodTest mt4 = new MethodTest("�念��", 200);
		
		
//��ü���� ��������� ������ �ٸ� �����ͷ� �����ϱ�
	mt.name = "�̼���";
	System.out.println("mt.namer="+ mt.name);
	System.out.println("mt.namer="+ mt2.name);
	
	System.out.println("mt3.num="+mt3.num);//100
	System.out.println("mt3.name="+mt3.name);//�������
	System.out.println("mt3.thel="+mt3.tel);// 02 121 2312 3123 123
	System.out.println("mt4,num="+ mt4.num);// 200
	System.out.println("mt4,name="+ mt4.name);// �念��
	System.out.println("mt4,tel="+ mt4.tel);// 02-1234-1234
	}

}

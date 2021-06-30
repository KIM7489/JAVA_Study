import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
	Scanner scan = new Scanner(System.in);
	public ExceptionTest() {
		
	}
	public void start() {
		do {
		try {
		//�μ��� �Է¹޾� ��Ģ�����Ͽ� ����϶�.
		System.out.println("ù��° ��");
		int n1 = Integer.parseInt(scan.nextLine()); //--------------
		System.out.println("�ι��� ��");
		int n2 = Integer.parseInt(scan.nextLine()); // ----------------
		
		int add = n1+n2;
		int minus = n1-n2;
		int mul = n1*n2;
		int devide = n1/n2;
		
		System.out.println(n1+"+"+n2+"=" +add);
		System.out.println(n1+"-"+n2+"=" +minus);
		System.out.println(n1+"*"+n2+"=" +mul);
		System.out.println(n1+"/"+n2+"=" +devide); // ----------------
		
		String names[] = {"Ȧ�浿","��浿"};
		for(int i=0; i<names.length; i++) {
			System.out.println("names{"+i+"}"+names[i]);
		}
	} catch(InputMismatchException imie) {
		System.out.println("������ �Է��Ͽ��� �մϴ�.");
		//imie.printStackTrace();  //��
		System.out.println(imie.getMessage());  // ����
	} catch(ArithmeticException imie1) {
		System.out.println("0���� ������ �����ϴ�.");
		//imie1.printStackTrace(); //�̼�
		System.out.println(imie1.getMessage()); //����
	}
		finally {
		//���ܹ߻��� ������� ������ �����
		System.out.println("finally�����.");
	}
		}while(true);
		//System.out.println("�ý�������");
	}
	public static void main(String[] args) {
		ExceptionTest et = new ExceptionTest();
		et.start();
		

	}

}
/*
 * 	����: �ϵ���� ���� ó�� ���α׷����� �����Ҽ� ���� ������ ���Ѵ�.
 	����ó�� : ���α׷����� ����Ҽ��ִ� ������ Exception �̶���Ѵ�.
 	
 	 //1. ���
 	   try{
 	   		���๮;
 	   		���ܹ߻��� ������ �ִ� ��ɾ� �Ǵ� ���ܰ��߻��� ���ɼ��� ���� ��ɾ� ��� ǥ�� �����ϴ�.
 	   }catch(��������){
 	  		���ܰ� �߻��ϸ� ������ ���๮
 	   }catch(��������){
 	  		���ܰ� �߻��ϸ� ������ ���๮
 	  }
 	  :
 	  :
 	  
 	  finally{	
 	  	   ���ܰ� �߻��ϵ� ���ϵ� ������ ����Ǵ� ���๮;
 	  		���������ϴ�.
 	  }
 */

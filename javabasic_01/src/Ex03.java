import java.util.Scanner;
class Ex03 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		for(;;){
			System.out.print("�޴�����[1. �簢���� ����, 2. �簢���� �ѷ�, 3. ����]?");
			int menu = sc.nextInt();

			if(menu==3){
				//���α׷� ����
				System.exit(0);
			}else{
				System.out.print("����(�غ�)=");
				int width = sc.nextInt();
				System.out.print("����(����)=");
				int height = sc.nextInt();

				int result = (menu==1)?  width*height : (width+height)*2 ;

				String msg = (menu==1)? "����":"�ѷ�";

				System.out.println("�簢���� "+msg+"="+ result);
				System.out.println("�簢����   dsfdsffdsfds "+msg+"="+ result);
			}
		}
	}
}

/*
�簢���� ���� = �غ� * ����
�簢���� �ѷ� = (���� + ����) * 2

����
�޴�����(1.�簢���� ����, 2.�簢���� �ѷ�)? 1
����(�غ�)= __
����(����)= __
�簢���� ���� = ___


�޴�����(1.�簢���� ����, 2.�簢���� �ѷ�)? 2
����(�غ�)= __
����(����)= __
�簢���� �ѷ� = ___

*/

import java.util.Scanner;
class ForDiamond2{
	public static void main(String[] args) 	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Ȧ��(1~49)�Է�=");
		int max = scan.nextInt();//13
		
		//¦���ϰ�� Ȧ���� ����
		if(max%2==0){
			max++;
		}

		//����� ���� �ʱⰪ
		char txt = 'A';
		int step = 2;
		for(int row=1; row>0; row+=step){//��  1,3,5,7,9, 11,.....max=13, 11, 9, 7, 5, 3, 1, -1
			for(int s=1; s<= (max-row)/2; s++){//����ó��
				System.out.print(" ");
			}			
			for(int cnt=1; cnt<=row; cnt++){//  1~1//1�ٹ��� ���
				System.out.print(txt++);
				if(txt>'Z'){// 'Z'�� ����ϰ� ���� 'A'�� �ǵ�����
					txt = 'A';
				}
			}
			System.out.println();
			if(row>=max){
				step=-2;
			}
		}

	}
}

import java.util.Scanner;
class DoWhileEx2 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		int yesNo=1;
			
		do
		{
			int m5=0, m1=0, c5=0, c1=0, b5=0, b1=0, w5=0, w1=0, w=0 ;
			//�ݾ�
			
			System.out.print("�ݾ��� �Է��ϼ���.?");
			int money = scan.nextInt();			

			int won=50000, divide=5;
			
			while (money>0){
				int cnt = money/won;
				if(cnt>0){
					System.out.print(won+"��="+cnt);
					if (won>=1000){
						System.out.println("��");
					}else{
						System.out.println("��");
					}
					money = money - cnt*won;
				}
				won = won / divide;//���� ȭ�����
				//����ȭ����� ������ �������� �ٲ����� �Ѵ�.
				if(divide == 5)	divide = 2;
				else divide=5;
			}
					


			System.out.print("�ٽ��Ͻðڽ��ϱ�?(1.�� 2.�ƴϿ�)?");
			yesNo = scan.nextInt();
			if(yesNo==2)
				break;
		}
		while (true);



	}

}

/*

50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1
����
�ݾ��� �Է��ϼ���.? 123300
50000��=2��
10000��=2��
1000��=3��
100��=3��
�ٽ��Ͻðڽ��ϱ�(1.�� 2.�ƴϿ�)?

�ݾ��� �Է��ϼ���.? 5435
5000��=1��
100��=4��
10��=3��
1��=5��
�ٽ��Ͻðڽ��ϱ�(1.�� 2.�ƴϿ�)?2

*/

public class ArrayTest02 {

	public static void main(String[] args) {
		//2���� : ��� ���� ������.
		
		//�迭�� ����
		//		�� �� 
		int data[][] = new int[5][5];	//int 25���� ������ ������ ������
		
		data[0][3] =100;
		data[1][2]= 85;
		data[1][4]= 84;
		data[3][3]= 77;
		
		//2���� �迭���		length:1���� �迭�϶� ������ ����. 2�����迭 ���Ǽ�
		for(int r=0; r<data.length; r++) {	//���� �� ��ŭ
			for(int c=0; c<data[r].length; c++) {	//data[r].length -> r���� ĭ��
				System.out.print(data[r][c]+"\t");
			}
			System.out.println();
		}
		
		//2���� �迭�� �ʱⰪ ����
		String[][] jusorok = {
								{"ȫ�浿","010-4568-9999","abcd@nate.com"},
								{"�̼���","010-1111-1111","bbbb@nate.com"},
								{"�������","010-2222-9999","cccc@nate.com"}
							};
		for(int r=0; r<jusorok.length; r++) {
			for(int c=0; c<jusorok.length; c++) {
				System.out.print(jusorok[r][c]+"\t");
			}
			System.out.println();
		}
	}

}
import java.util.Scanner;
class IfTest 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		// ����� �Է¹޾� ¦���϶��� ����ϰ�  ¦���� �ƴϸ� ������� �ʴ´�.
		System.out.print("0���� ū ������ �Է��ϼ���...");
		int num = scan.nextInt();
		
		if(num%3!=0){
		//if(num/3 != num/3.0){
			System.out.printf("%d�� ¦���Դϴ�.\n", num);
		}
		System.out.println("End......");
	}
}

/*

	if��
	���ǹ��� �ݵ�� ���� ������� �Ѵ�.

	if(���ǹ� or ���� or ���� or ���){
		���϶� ������ ���๮;
		���๮;
		���๮;
		:
	}

*/

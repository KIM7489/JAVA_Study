import java.util.Scanner;
class Ex02 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 ->");
		int n1 = scan.nextInt();

		int result = (100 < n1 && n1 < 200  ) ? n1 : 0;
		System.out.println("result= " +result);


	}
}

/*
	임의의 수를 입력받아 입력받은 수가 100~200사이이면 입력받은 값을 출력하고
								아니면 0을 출력하라
*/
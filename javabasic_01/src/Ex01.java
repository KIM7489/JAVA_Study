import java.util.Scanner;
class Ex01 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		//데이터 얻어오기
		System.out.print("정수=");
		int n1 = input.nextInt();
		System.out.print("정수=");
		int n2 = input.nextInt();
		
		// 계산
		int result = (n1>n2)? n1 : n2;
		
		// 출력
		System.out.println(n1+"과 "+n2+"중에 큰값은 "+result+"입니다.");
	}
}
/*
	두수를 입력받아 큰값을 출력하라.
*/
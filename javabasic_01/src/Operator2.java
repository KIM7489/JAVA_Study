class Operator2 
{
	public static void main(String[] args) 
	{
		// 비트 연산자 : &, |, ^(XOR), ~  -> 2진수 데이터를 이용한 연산자
		int a = 12;
		int b = 4;

		int result = a & b;  //   1:true, 0:false
		System.out.println("result="+ result);

		int result2=  a | b;
		System.out.println("result2="+ result2);

		// XOR : 두값이 다를 때 참
		int result3 = a ^ b;
		System.out.println("result3="+ result3);

		// ~ (부정)
		// 음수인 데이터를 환산하는 방법 : 2보수 -> 1의 보수 + 1
		// 1의 보수는 0은 1로 1은 0으로 바꾸는 것이다.

		int result4 = ~a;  // -13
		System.out.println("result4="+ result4);

		// 쉬프트 연산자 : 비트의 이동
		//  << : 비트가 왼쪽으로 이동한다.  *기능
		//  >>(부호로 채워짐), >>>(0으로 채워짐)  : 비트가 오른쪽으로 이동  /기능

		int result5 = a << 2;  // 왼쪽으로 2bit이동 오른쪽 0으로 채움   48   12*4
		System.out.println("result5="+ result5);

		int result6 = a >> 2;  // 오른쪽으로 2bit이동 왼쪽 남는 자리는 부호로 채워진다.  3   12/4
		int result7 = result4 >> 2;  // -4
		System.out.println("result6="+ result6);
		System.out.println("result7="+ result7);
	
		int result8 = result4 >>> 2;
		System.out.println("result8="+ result8);


	}
}

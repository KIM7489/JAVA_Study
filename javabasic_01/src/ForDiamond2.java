import java.util.Scanner;
class ForDiamond2{
	public static void main(String[] args) 	{
		Scanner scan = new Scanner(System.in);
		System.out.print("홀수(1~49)입력=");
		int max = scan.nextInt();//13
		
		//짝수일경우 홀수로 변경
		if(max%2==0){
			max++;
		}

		//출력할 문자 초기값
		char txt = 'A';
		int step = 2;
		for(int row=1; row>0; row+=step){//줄  1,3,5,7,9, 11,.....max=13, 11, 9, 7, 5, 3, 1, -1
			for(int s=1; s<= (max-row)/2; s++){//공백처리
				System.out.print(" ");
			}			
			for(int cnt=1; cnt<=row; cnt++){//  1~1//1줄문자 출력
				System.out.print(txt++);
				if(txt>'Z'){// 'Z'를 출력하고 나면 'A'로 되돌리기
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

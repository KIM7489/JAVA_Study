import java.util.Scanner;
class ForDiamondTest22 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		//입력
		System.out.print("임의의 홀수입력(1~49)=");
		int max = scan.nextInt();
		
		char txt = 'A';
		//홀수확인 짝수라면 +1
		if(max%2==0){
			max+=1;
		}

		for(int row=1; row<=max; row+=2){// 1,3,5,7,9, 11,..... max
			
			for(int s=1; s<=(max-row)/2; s++){//공백처리
				System.out.print(" ");
			}
			for(int cnt=1; cnt<=row; cnt++){//1줄문자 출력
				System.out.print(txt++);
				if(txt > 'Z'){//	'Z'를 출력하고 나면 'A'를 출력한다.
					txt = 'A';
				}
			}
			System.out.println();
		}
	//=========================================
		for(int row=max-2; row>=1;row-=2){// 11, 9 ,7, 5, 3, 1
			
			for(int s=1; s<=(max-row)/2; s++){//공백
				System.out.print(" ");
			}
			for(int cnt=1; cnt<=row; cnt++){//1줄문자
				System.out.print(txt++);
				if(txt>'Z'){
					txt='A';
				}
			}
			System.out.println();
		}
	}
}

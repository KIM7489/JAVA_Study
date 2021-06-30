import java.util.Scanner;
class DoWhileEx 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		do{
			//금액
			System.out.print("금액을 입력하세요?");
			int money = scan.nextInt();///4520

			//화페
			int cnt = money/50000; //5만원
			if(cnt>0){
				System.out.println("50000원="+ cnt+"장");
				money = money - cnt*50000;
			}
			cnt = money/10000;//1만원
			if(cnt>0){
				System.out.println("10000원="+ cnt+"장");
				money = money - cnt*10000;
			}
			cnt = money/5000;//오천원
			if(cnt>0){
				System.out.println("5000원="+ cnt+"장");
				money = money - cnt*5000;
			}
			
			cnt = money/1000;//1000원
			if(cnt>0){
				System.out.println("1000원="+ cnt+"장");
				money = money - cnt*1000;
			}
			//
			//
			//
			//질문
			System.out.print("계속하시겠습니까(1.예, 2.아니오)?");
			int status = scan.nextInt();
			if(status==2)
				break;	
		}while(true);
	}
}

/*

50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1

실행
금액을 입력하세요.?123300
50000원=2장
10000원=2장
1000원=3장
100원=3개
다시하시겠습니까(1.예, 2.아니오)?1

금액을 입력하세요.?5435
5000원=1장
100원=4개
10원=3개
1원=5개
다시하시겠습니까(1.예, 2.아니오)?2

*/

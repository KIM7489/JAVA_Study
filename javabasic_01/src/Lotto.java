import java.util.Scanner;
public class Lotto {
	public static void main(String[] args) {
		//로또 번호 생성기
		Scanner scan = new Scanner(System.in);
		
		do {
			//게임수입력
			System.out.print("게임수=");
			int cnt = scan.nextInt();
			
			//입력받은 게임수 만큼 게임만들기
			for(int game=1; game<=cnt; game++) {
				//게임1개 만들기
				int lotto[] = new int[7]; //로또번호+보너스를 난수로 생성하여 저장할 배열
				for(int i=0; i<lotto.length; i++) {// i=0
					lotto[i] = (int)(Math.random()*45) + 1;					
					//중복검사
					for(int c=0; c<i; c++) {// 
						if(lotto[i]==lotto[c]) {
							i--;
						}
					}
				}
				
				//정렬
				for(int i=0; i<lotto.length-2; i++) {// 0,1,2,3,4
					for(int j=0; j<lotto.length-2-i; j++) {
						if(lotto[j]>lotto[j+1]) {
							int temp = lotto[j];
							lotto[j] = lotto[j+1];
							lotto[j+1] = temp;
						}
					}
				}
				
				//출력
				System.out.print(game+"게임=");
				for(int i=0; i<lotto.length-1; i++) {
					System.out.print(lotto[i]+", ");
				}
				System.out.println("bonus="+ lotto[6]);
			}
			//===================================================================
			System.out.print("계속하시겠습니까[1:예, 2:아니오]?");
			int check = scan.nextInt();
			if(check==2) break;  //반복문중단
		}while(true);
		
	}
}
/*
 로또 번호 : 1~45까지 번호 6개
           보너스 1개
 
 실행
 게임수 = 3
 1게임 = 5,13,26,32,33,45, 보너스 11
 2게임 = 11,23,26,32,35,41, 보너스 9
 3게임 = 15,13,26,37,38,42, 보너스 23
 계속하시겠습니까(1:예, 2:아니오)?1
 
 게임수 = 5
 1게임 = 5,13,26,32,33,45, 보너스 11
 2게임 = 11,23,26,32,35,41, 보너스 9
 3게임 = 15,13,26,37,38,42, 보너스 23
 4게임 = 1,23,26,32,35,41, 보너스 27
 5게임 = 9,13,26,37,38,42, 보너스 45
 계속하시겠습니까(1:예, 2:아니오)?2
 */
 

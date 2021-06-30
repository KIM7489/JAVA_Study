import java.util.Scanner;
import java.util.Arrays;
public class Student {
	
	Student() {

	 }
	void start() {
		while(true) {
			Scanner scan = new Scanner(System.in);
		    System.out.print("학생수=");
			int cnt = Integer.parseInt(scan.nextLine());
			
			//데이터 저장할 공간 확보
			String name[] = new String[cnt];// 학생이름 저장할 배열
			int jumsu[][] = new int[cnt+2][6];// 학생 점수를 저장할 배열
			
			// 이름과 점수를 입력받아 배열에 저장
			String title[] = {"국어", "영어", "수학"};
		    
			for(int i = 0; i < cnt; i++) {//0,1,2,3
		        System.out.print("이름=");
		         name[i] = scan.nextLine();
		         for(int j = 0; j <title.length; j++) {
		        	try { System.out.print(title[j]+"=");
		        	 jumsu[i][j] = Integer.parseInt(scan.nextLine());
		        	 if(jumsu[i][j]<0 || jumsu[i][j]>100) {
		        		 throw new MyException(title[j]+"점수는 0~100사이의 값이여야 합니다.");
		        	 }
		         }catch(MyException me){
		        	 System.out.println(me.getMessage);
		        	 j--;
		         }catch(NumberFormatException nfee) {
		        	 System.out.println("점수는 0~100사이의 값이여야 합니다.");
		         }
		    }
			// 개인별 총점, 평균 
			// 과목별 총점
			for(int i = 0; i < cnt; i++) {// 0,1,2
				for(int j=0; j<3; j++) {// 0,1,2
				     jumsu[i][3] += jumsu[i][j]; //개인별 총점
				     jumsu[cnt][j]+= jumsu[i][j];//과목별총점
				}
				//개인별 평균
				jumsu[i][4] = jumsu[i][3]/3;
			}
			    //과목별 평균
			for(int i =0; i<3; i++) {
				jumsu[cnt+1][i] = jumsu[cnt][i]/cnt;
			}
			    //석차 구하기
			for(int i = 0; i<cnt; i++) {//0,1,2,3
				//i가 본인점수 위치
				for(int j =0; j<cnt; j++) {
					//내점수           //상대방 점수
					if(jumsu[i][3] < jumsu[j][3]) {
					   jumsu[i][5]++;
					}
				}
				jumsu[i][5]++;
			}
			for(int i=0; i<cnt-1; i++) {//3 명 -> 0,1
				// 3-1-0
				for(int j=0; j<cnt-1-i; j++) {// 0,1,
					if(jumsu[j][5] > jumsu[j+1][5]) {
						//교환
						//이름바꾸기
						String nameTemp = name[j];
						name[j] = name[j];
						name[j+1] = nameTemp;
						
						for(int k=0; k<jumsu[j].length; k++) {
							int temp = jumsu[j][k];
							jumsu[j][k] = jumsu[j+1][k];
							jumsu[j+1][k] = temp;
						}
					}
				}
			}
			
			//=======출력============================
				System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t석차");
			for(int i = 0; i< cnt; i++) {//i =0
				//이름
				System.out.print(name[i]+"\t");
		        //점수출력 국어, 영어, 수학. 총점, 평균
				for(int j=0; j<jumsu[i].length; j++) {
					System.out.print(jumsu[i][j]+"\t");
				}
				System.out.println();
			}
			//과목별 총점
			System.out.print("총점\t");
			for(int i=0; i<3; i++) {//012
				System.out.print(jumsu[cnt][i]+"\t");
			}
			System.out.println();
			//과목별 총점
				System.out.print("평균\t");
			for(int i =0; i<3; i++) {
				System.out.print(jumsu[cnt+1][i]+"\t");
			}
			System.out.println();
			System.out.println("계속 실행하시겠습니까? Y/N");
			String cc = scan.nextLine();
		}
	}

	public static void main(String[] args)  {
		Student cc = new Student();
		cc.start();
	}
}
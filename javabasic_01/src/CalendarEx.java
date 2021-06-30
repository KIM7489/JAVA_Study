import java.util.Scanner;
import java.util.Calendar;
class CalendarEx 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("년도=");
		int year = scan.nextInt();

		System.out.print("월=");
		int month = scan.nextInt();

		//제목출력
		System.out.printf("\t\t%d년 %d월\n", year, month);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		//현재 날짜 시간 객체 구하기 (추상 클래스)
		Calendar date = Calendar.getInstance();
		date.set(year, month-1, 1);//날짜 변경   1월->0, 2월->1,.... 5월->4, 6월->5
		
		int week = date.get(Calendar.DAY_OF_WEEK);//요일구하기

		//달의 마지막날
		// 1, 3, 5, 7, 8, 10, 12 -> 31일
		// 4, 6, 9, 11 ->30일
		// 2 -> 28일, 29일
		/*
		int lastDay = 31;
		switch(month){
			case 4: 
			case 6: 
			case 9: 
			case 11:
				lastDay=30;break;
			case 2:
				// 년도가 4로 나누어지고 100으로 나누어지지 않으면 윤년
			    // 400으로 나누어지면 윤년
				if(year%4==0 && year%100!=0 || year%400==0){
					lastDay = 29;
				}else{
					lastDay = 28;
				}
		}
		*/
		int lastDay = date.getActualMaximum(Calendar.DAY_OF_MONTH);
		//마지막날 

		//공백출력
		for(int s=1; s<week; s++){
			System.out.print("\t");
		}
		//날짜 출력
		for(int d=1; d<=lastDay; d++){
			System.out.print(d+"\t");
			if((d+week-1)%7==0){//출력한 문자가 7의 배수개이면 줄바꾸기
				System.out.println();
			}
		}
		System.out.println();
	}
}

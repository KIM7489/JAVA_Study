import java.util.Calendar;
import java.util.Scanner;

public class CalendarEx01 {
	Scanner scan = new Scanner(System.in);
	Calendar date = Calendar.getInstance();
	
	static int year, month, week, lastDay;
	
	public CalendarEx01() {}
	

	void dataEx() {
	System.out.print("년도=");
	year = scan.nextInt();
	System.out.print("월=");
	month = scan.nextInt();
	}
	
	void nowtime() {
	date.set(year, month-1, 1);
	week = date.get(Calendar.DAY_OF_WEEK);
	lastDay = date.getActualMaximum(Calendar.DAY_OF_MONTH);
	}
	
	 void outputCalendar() {
		System.out.printf("\t\t%d년 %d월\n", year, month);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for(int s=1; s<week; s++){
			System.out.print("\t");
		}
		for(int d=1; d<=lastDay; d++){
			System.out.print(d+"\t");
			if((d+week-1)%7==0){//출력한 문자가 7의 배수개이면 줄바꾸기
				System.out.println();
			}
		}
		System.out.println();
	}

 public static void main(String[] a) {

	 CalendarEx01 calenda = new CalendarEx01();
	 calenda.dataEx();
	 calenda.nowtime();
	 calenda.outputCalendar();

}

}

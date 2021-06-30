import java.util.Calendar;
import java.util.Scanner;

public class CalendarEx01 {
	Scanner scan = new Scanner(System.in);
	Calendar date = Calendar.getInstance();
	
	static int year, month, week, lastDay;
	
	public CalendarEx01() {}
	

	void dataEx() {
	System.out.print("�⵵=");
	year = scan.nextInt();
	System.out.print("��=");
	month = scan.nextInt();
	}
	
	void nowtime() {
	date.set(year, month-1, 1);
	week = date.get(Calendar.DAY_OF_WEEK);
	lastDay = date.getActualMaximum(Calendar.DAY_OF_MONTH);
	}
	
	 void outputCalendar() {
		System.out.printf("\t\t%d�� %d��\n", year, month);
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		for(int s=1; s<week; s++){
			System.out.print("\t");
		}
		for(int d=1; d<=lastDay; d++){
			System.out.print(d+"\t");
			if((d+week-1)%7==0){//����� ���ڰ� 7�� ������̸� �ٹٲٱ�
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

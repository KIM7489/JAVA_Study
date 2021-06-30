import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
	Scanner scan = new Scanner(System.in);
	public ExceptionTest() {
		
	}
	public void start() {
		do {
		try {
		//두수를 입력받아 사칙연산하여 출력하라.
		System.out.println("첫번째 수");
		int n1 = Integer.parseInt(scan.nextLine()); //--------------
		System.out.println("두번쨰 수");
		int n2 = Integer.parseInt(scan.nextLine()); // ----------------
		
		int add = n1+n2;
		int minus = n1-n2;
		int mul = n1*n2;
		int devide = n1/n2;
		
		System.out.println(n1+"+"+n2+"=" +add);
		System.out.println(n1+"-"+n2+"=" +minus);
		System.out.println(n1+"*"+n2+"=" +mul);
		System.out.println(n1+"/"+n2+"=" +devide); // ----------------
		
		String names[] = {"홀길동","김길동"};
		for(int i=0; i<names.length; i++) {
			System.out.println("names{"+i+"}"+names[i]);
		}
	} catch(InputMismatchException imie) {
		System.out.println("정수를 입력하여야 합니다.");
		//imie.printStackTrace();  //상세
		System.out.println(imie.getMessage());  // 간략
	} catch(ArithmeticException imie1) {
		System.out.println("0으로 나눌수 없습니다.");
		//imie1.printStackTrace(); //싱세
		System.out.println(imie1.getMessage()); //간략
	}
		finally {
		//예외발생과 상관없이 무조건 실행됨
		System.out.println("finally실행됨.");
	}
		}while(true);
		//System.out.println("시스템종류");
	}
	public static void main(String[] args) {
		ExceptionTest et = new ExceptionTest();
		et.start();
		

	}

}
/*
 * 	에러: 하드웨어 에러 처럼 프로그램에서 제어할수 없는 에러를 말한다.
 	에외처리 : 프로그램에서 재어할수있는 에러를 Exception 이라고한다.
 	
 	 //1. 방법
 	   try{
 	   		실행문;
 	   		예외발생할 가능이 있는 명령어 또는 예외가발생할 가능성이 없는 명령어 모두 표기 가능하다.
 	   }catch(에외종류){
 	  		예외가 발생하면 실행할 실행문
 	   }catch(예외종류){
 	  		예외가 발생하면 실행할 실행문
 	  }
 	  :
 	  :
 	  
 	  finally{	
 	  	   예외가 발생하든 안하든 무조건 실행되는 실행문;
 	  		생략가능하다.
 	  }
 */

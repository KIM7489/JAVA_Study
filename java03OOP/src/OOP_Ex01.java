
import java.util.Scanner;
public class OOP_Ex01 {

	//생성자 메소드
	public OOP_Ex01() {
		//int dan = daninput();
		//String result = gugudan(dan);
		//System.out.println(result);
		//System.out.println(gugudan(daninput()));
	}
	
	//단입력받기
	int daninput(){
		Scanner scan = new Scanner(System.in);
		System.out.print("단입력=");
		return scan.nextInt();
	}
	
	//구구단 출력하기
	String gugudan(int dan) {
		String gugu = "";
		for(int i = 2; i<=9; i++) {
			gugu += dan+"*"+i+"="+dan*i+"\n";
		} 
	return gugu;
	}
	
	void start() {
		int dan = daninput();
		String result = gugudan(dan);
		System.out.println(gugudan(dan));
	}
	
	public static void main(String[] args) {
		OOP_Ex01 oop = new OOP_Ex01();
		
		//System.out.println(oop.gugudan(oop.daninput()));
		//oop.gugudan(oop.daninput());
		oop.start();
		
	}

}
// 콘솔에서 단을 입력바다
// 		  입력받은 구구단을 찍어라.

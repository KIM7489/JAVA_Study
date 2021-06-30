
import java.util.Scanner;
public class OOP_Ex02 {
	
	int dan; 		//입력받은 단을 저장할변수 = 0
	String gugu = ""; 	//구구단을 버장할 변수
	
	public OOP_Ex02() {
	}
	//단입력받기
	int daninput(){
		Scanner scan = new Scanner(System.in);
		System.out.print("단입력=");
		return scan.nextInt();
	}

	//구구단 출력하기
	void gugudan(int dan) {
		for(int i = 2; i<=9; i++) {
			gugu += dan+"*"+i+"="+dan*i+"\n";
		}
	}
	void start() {
		dan = daninput();
		gugudan(dan);
		System.out.println(gugu);
	}
}
// 콘솔에서 단을 입력바다
// 		  입력받은 구구단을 찍어라.

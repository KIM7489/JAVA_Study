package javareview;
import java.util.Scanner;

public class OOP_Gugudan {
	Scanner scan = new Scanner(System.in);
	int math = 0;
	String gugu = "";
	char a ='N';
	
	public OOP_Gugudan() {
	}
	int inputGugudan() {
		System.out.print("단=");
		return scan.nextInt();
	}
	
	void gugudan() {
	int i = inputGugudan();
	for(int j = 2; j <= 9; j++) {
		gugu += i+"*"+j+"="+i*j+"\n";
	}			
	}
	void Start() {
	while(a=='N' ||a=='n') {
		gugudan();
		System.out.println(gugu);
		System.out.println("종료 하시겠습니까? Y/N");
		a = scan.next().charAt(0);
	}
	}
	public static void main(String[] args) {
		OOP_Gugudan mm = new OOP_Gugudan();
		mm.Start();

	}

}

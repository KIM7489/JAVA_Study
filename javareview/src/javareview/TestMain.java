package javareview;
class Test{
	public static void go(long n) {
		System.out.println("Long");
	}
	public static void go(short n) {
		System.out.println("short");
	}
	public static void go(int n) {
		System.out.println("int");
	}
}


public class TestMain {

	public static void main(String[] args) {
		
		
		short y =6;
		long n = 7;
		Test.go(y);
		Test.go(n);
	}

}


public class ThreadTest1 extends Thread {
	String msg;
	public ThreadTest1() {}
	public ThreadTest1(String msg) {
		this.msg = msg;
	}
	//스레드 구현코드를 run()에 오버라이딩 한다.
	public void run()
	{
		for(int i =1;; i++){
			System.out.println(msg+"="+i);
		}
	}
	public static void main(String[] args) {
		ThreadTest1 tt1 = new ThreadTest1("첫번째 스레드");
		// 스레드를 시작하기 위해서는  stare()메스드호출
		tt1.start();
		ThreadTest1 tt2 = new ThreadTest1("두번째 스레드");
		tt2.start();
		ThreadTest1 tt3 = new ThreadTest1("두번째 스레드");
		tt3.start();
	}

}

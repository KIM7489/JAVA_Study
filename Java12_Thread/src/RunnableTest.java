
public class RunnableTest implements Runnable{
	String msg;
	public RunnableTest() {}
	public RunnableTest(String msg) {
		this.msg = msg;
	}
	public void run()
	{
		int i=1;
		while(true) {
			System.out.println(msg+"===>"+i++);
		}
	}
	public static void main(String[] args) {
		RunnableTest rt1 = new RunnableTest("첫번째스레드"); 
		RunnableTest rt2 = new RunnableTest("두번째스레드"); 
		
		Thread t1 = new Thread(rt1);
		Thread t2 = new Thread(rt2);
		
		t1.start();
		t2.start();
		
	}

}
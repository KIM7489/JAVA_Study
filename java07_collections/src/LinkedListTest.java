import java.util.LinkedList;
public class LinkedListTest {
	
	public LinkedListTest() {
		start();
	}
	public void start() {
		// List Deque queue
		//queue일때 입력순서를 유지 출력은 먼저 입력된 객체가 출력된다. 입력순서를 유지하지만
		// 출력된 객체는 컬랙션에 지워진다.
		//Deque일때 양쪽에서 객체를 입력또는 출력할수 있다.
		LinkedList<String> ll = new LinkedList<String>();
		
		//객체추가
		ll.offer("홍길동");
		ll.offer(new String("세종대왕"));
		ll.offer(String.valueOf(1234));
		ll.offer(5678+"");
		System.out.println("size->"+ll.size());
		//객체 얻어오기
		//String data = ll.pop(); // 제일 앞에 있는 객체가 얻어지고 컬렉션에서는 지워진다.
		//System.out.println("data = "+ data);
		//System.out.println("size -->"+ll.size());
		//ture 객체가 없다 컬랙션에 false: 컬랙션에 남아있는 객체가 있다.
		while(!ll.isEmpty()) {
			String data = ll.pop();
			int cnt = ll.size();
			System.out.println(data+"남은 객체수="+ cnt);
			
			
		}
	}
	public static void main(String[] a) {
		new LinkedListTest();
	}
}

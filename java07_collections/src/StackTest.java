import java.util.Stack;

public class StackTest {

	public StackTest() {
		Stack<String> stack = new Stack<String>();
		
		// stack은 먼저 입력된 정보가 나중에 출력된다.(FILO:first in last out)
		// queue : FIFO 
		// push() : 입력 pop() :출력
		
		stack.push("홍길동");
		stack.push("세종대왕");
		stack.push("이순신");
		stack.push("김정희");
		
		// empty() : stack객체가 있으면 false, 객체가 없을 떄 true
		while(!stack.empty()) {
			String name = stack.pop();
			System.out.println(name);
		}
	}

	public static void main(String[] args) {
		

	}

}

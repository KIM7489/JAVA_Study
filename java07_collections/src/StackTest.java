import java.util.Stack;

public class StackTest {

	public StackTest() {
		Stack<String> stack = new Stack<String>();
		
		// stack�� ���� �Էµ� ������ ���߿� ��µȴ�.(FILO:first in last out)
		// queue : FIFO 
		// push() : �Է� pop() :���
		
		stack.push("ȫ�浿");
		stack.push("�������");
		stack.push("�̼���");
		stack.push("������");
		
		// empty() : stack��ü�� ������ false, ��ü�� ���� �� true
		while(!stack.empty()) {
			String name = stack.pop();
			System.out.println(name);
		}
	}

	public static void main(String[] args) {
		

	}

}

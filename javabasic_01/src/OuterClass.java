
public class OuterClass {
	int num = 100;
	String name = "ȫ�浿";
	
	public OuterClass() {
	}
	public void print() {
		System.out.println("num="+num);
		System.out.println("name="+name);
	}
	public static void main(String[] args) {
		

	}
	//����Ŭ����
	class InnerClass{
		//�������
		String tel = "010-1234-5678";
		//�����ڸ޼ҵ�
		InnerClass(){
			System.out.println("InnerClass������ �޼ҵ� �����");
		}
		//�޼ҵ�
		public void output() {
			System.out.println("tel="+tel);
		}
	}
}

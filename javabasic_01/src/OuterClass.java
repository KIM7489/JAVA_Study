
public class OuterClass {
	int num = 100;
	String name = "홍길동";
	
	public OuterClass() {
	}
	public void print() {
		System.out.println("num="+num);
		System.out.println("name="+name);
	}
	public static void main(String[] args) {
		

	}
	//내부클래스
	class InnerClass{
		//멤버변수
		String tel = "010-1234-5678";
		//생성자메소드
		InnerClass(){
			System.out.println("InnerClass생성자 메소드 실행됨");
		}
		//메소드
		public void output() {
			System.out.println("tel="+tel);
		}
	}
}


public class AnonimoudaInner {

	public AnonimoudaInner() {
		
	}
	public void innerTest() {
		//�͸��� ���� Ŭ���� : Ŭ�������� �������� �ʴ´�.
		//				  �ٸ� Ŭ������ ��üȭ�ϴ� �������� Ŭ���� �����Ͽ� ���θ����.
		//				Ŭ�������� �������� �����Ƿ� ������ ������ �� ����.
		new Student() {
			//����� 
			String tel = "010=1234=8888";
			//StudentŬ������ print �޼ҵ带 �������̵�
			public void print() {
				System.out.println("num="+num);
				System.out.println("num="+name);
			}
		}.print();
	}
	public static void main(String[] args) {
		new AnonimoudaInner().innerTest();

	}

}

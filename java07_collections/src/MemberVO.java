
public class MemberVO {
	String name;
	String depart;
	String heire;
	int sal;
	
	//VECTOR ARRYLIST
	public MemberVO() {
	
	}
	public MemberVO(String name, String depart, String heire, int sal) {
		this.name = name;
		this.depart = depart;
		this.heire = heire;
		this.sal = sal;
	}
	public void setMemberVO(String name, String depart, String heire, int sal) {
		this.name = name;
		this.depart = depart;
		this.heire = heire;
		this.sal = sal;
	}
	public void setName(String name) {
	this.name = name;	
	}
	public String getName() {
		return name;
	}
	public void setDepart(String depart) {
	this.depart = depart;
	}
	public String getDepart() {
		return depart;
	}
	public void setHire(String heire) {
		this.heire = heire;
	}
	public String getHeire() {
		return heire;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getSal() {
		return sal;
	}
	//��� �޼ҵ�
	public void memverPrint() {
		System.out.println("�̸�="+ name);
		System.out.println("�μ���="+ depart);
		System.out.println("�Ի���="+ heire);
		System.out.println("�޿�="+ sal);
	}

}

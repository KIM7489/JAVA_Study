package Emplnfor;

public class EmpVO {
	private String empNo;//�����ȣ  
	private String empName;//�����
	private String tel;//����ó
	private int sal;//�޿�
	private String hireDate;//�Ի���
	
	public EmpVO() {
		
	}
	
	public EmpVO(String empNo, String empName, String tel, int sal, String hireDate) {
		this.empNo = empNo;
		this.empName = empName;
		this.tel = tel;
		this.sal = sal;
		this.hireDate = hireDate;
}
	//��� �Ѹ� ���
	
	public void empPrint() {
		System.out.printf("%3s %10s %20s %13d %15s \n",empNo,empName,tel,sal,hireDate);
	}
	// Ÿ��Ʋ ���
	public static void titlePrint() {
		System.out.printf("%-10s %-10s %-15s %-10s %-15s\n","�����ȣ","�����","����ó","�޿�","�Ի���");
		System.out.println("-------------------------------------------------------------------------------------");
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
}
	public String getEmpNo() {
		return empNo;
}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	
}

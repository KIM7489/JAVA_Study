package Emplnfor;

public class EmpVO {
	private String empNo;//사원번호  
	private String empName;//사원명
	private String tel;//연락처
	private int sal;//급여
	private String hireDate;//입사일
	
	public EmpVO() {
		
	}
	
	public EmpVO(String empNo, String empName, String tel, int sal, String hireDate) {
		this.empNo = empNo;
		this.empName = empName;
		this.tel = tel;
		this.sal = sal;
		this.hireDate = hireDate;
}
	//사원 한명 출력
	
	public void empPrint() {
		System.out.printf("%3s %10s %20s %13d %15s \n",empNo,empName,tel,sal,hireDate);
	}
	// 타이틀 출력
	public static void titlePrint() {
		System.out.printf("%-10s %-10s %-15s %-10s %-15s\n","사원번호","사원명","연락처","급여","입사일");
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

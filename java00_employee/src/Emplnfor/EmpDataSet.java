package Emplnfor;

import java.util.HashMap;

public class EmpDataSet {
	public static HashMap<String, EmpVO> empList = new HashMap<String, EmpVO>();
		public EmpDataSet() {
	
	}
	//�⺻������ ����
	public static void basicEmpSet() {
		empList.put("ȫ�浿", new EmpVO("1","ȫ�浿","010=1234-5678",2000,"2020-05-05"));
		empList.put("�̼���", new EmpVO("2","�̼���","010=4444-4444",100,"2020-05-05"));
		empList.put("�������", new EmpVO("3","�������","010=2222-2222",50320,"2020-05-05"));
		empList.put("�ÿ�", new EmpVO("4","�ÿ�","010=5555-5555",50200,"2020-05-05"));
		empList.put("�����", new EmpVO("5","�����","010=1111-1111",10000,"2020-05-05"));
//		empList.put("�����", new EmpVO("6","�����","010=7777-7777",12330,"2020-05-05"));
//		empList.put("������", new EmpVO("7","������","010=1414-5278",50000,"2020-05-05"));
//		empList.put("������", new EmpVO("8","������","010=1124-5478",50000,"2020-05-05"));
	}

}

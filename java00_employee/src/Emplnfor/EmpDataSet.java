package Emplnfor;

import java.util.HashMap;

public class EmpDataSet {
	public static HashMap<String, EmpVO> empList = new HashMap<String, EmpVO>();
		public EmpDataSet() {
	
	}
	//±âº»µ¥ÀÌÅÍ ¼ÂÆÃ
	public static void basicEmpSet() {
		empList.put("È«±æµ¿", new EmpVO("1","È«±æµ¿","010=1234-5678",2000,"2020-05-05"));
		empList.put("ÀÌ¼ø½Å", new EmpVO("2","ÀÌ¼ø½Å","010=4444-4444",100,"2020-05-05"));
		empList.put("¼¼Á¾´ë¿Õ", new EmpVO("3","¼¼Á¾´ë¿Õ","010=2222-2222",50320,"2020-05-05"));
		empList.put("±Ã¿¹", new EmpVO("4","±Ã¿¹","010=5555-5555",50200,"2020-05-05"));
		empList.put("»ï½ÄÀÌ", new EmpVO("5","»ï½ÄÀÌ","010=1111-1111",10000,"2020-05-05"));
//		empList.put("»ï¼øÀÌ", new EmpVO("6","»ï¼øÀÌ","010=7777-7777",12330,"2020-05-05"));
//		empList.put("»ïÆÈÀÌ", new EmpVO("7","»ïÆÈÀÌ","010=1414-5278",50000,"2020-05-05"));
//		empList.put("»ïÀÏÀÌ", new EmpVO("8","»ïÀÏÀÌ","010=1124-5478",50000,"2020-05-05"));
	}

}

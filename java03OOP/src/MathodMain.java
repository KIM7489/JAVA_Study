

public class MathodMain {

	public static void main(String[] args) {		
// 	  		객체명=instance=regerence변수\
// 			생성자 메소드
		MethodTest mt = new MethodTest();
		MethodTest mt2 = new MethodTest("010 4519 5201");
		MethodTest mt3 = new MethodTest(100, "세종대왕");
		MethodTest mt4 = new MethodTest("장영실", 200);
		
		
//객체내의 멤버영역의 변수를 다른 데이터로 수정하기
	mt.name = "이순신";
	System.out.println("mt.namer="+ mt.name);
	System.out.println("mt.namer="+ mt2.name);
	
	System.out.println("mt3.num="+mt3.num);//100
	System.out.println("mt3.name="+mt3.name);//세종대왕
	System.out.println("mt3.thel="+mt3.tel);// 02 121 2312 3123 123
	System.out.println("mt4,num="+ mt4.num);// 200
	System.out.println("mt4,name="+ mt4.name);// 장영실
	System.out.println("mt4,tel="+ mt4.tel);// 02-1234-1234
	}

}

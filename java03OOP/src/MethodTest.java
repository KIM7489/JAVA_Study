

public class MethodTest {
	//멤버영역
	int num = 12;
	String name = "홍길동";
	String tel;
	
	// 생성자 메소드 : 생략시 자동 추가 (jvm)
	// 			   상속 관계가 아닐때 만 추가 해준다. 
	// 매개변수는 데이터형이 다르거나 변수의 갯수가 달라야 한다.
	MethodTest(){};
	
	MethodTest(String tel){
		System.out.println("연락처:"+tel);
	};
	//MethodTest(String name){}
	MethodTest(int number){}
	//MetgodTest(int num, int number){}
	MethodTest(int num, String name){
		// this : 현재객체(현재 클래스) 오른쪽부터 실행
		// 지역변수를 선언하지 않았으면 그냥 적으면 됨
		this.num = num;  
		this.name = name; 
		String tel = "1234567";
		this.tel = "02-1234-1234";
		
	}
	
	MethodTest(String name, int num){
		//생성자 메소드에서 다른 생성자 메소드 호출하기
		//생성자 메소드에서 다른 생성자를 호출할떄는 메소드명을 직접 표기할수 없다. 
		//this라는 키워드를 사용한다 this()
		//MethodTest(num ,name)xxx
		//this()를 이용하여 다른 생성자 메소드를 호출할떄는 반드시 첫번쨰 실핸문이여야한다.
		
		
		//System.out.println("-------------");x   첫번쨰 실행문이 아니다.
		//this(num, name);x
		this(num, name);	
	}
	
}

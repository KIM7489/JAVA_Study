


import java.util.Scanner;

public class StandardWeoghtTOOP {
	Scanner scan = new Scanner(System.in);

	
//데이터 입력값 저장
	int age, gender; // 0
	double height, weight;  // 0.0
	double sWeight; //표준체중 	
	String sWeightMsg; //유형
	double sWeightIndex;
	public StandardWeoghtTOOP() {}

//데티어 입력 메소드
	double getConData(String msg) {
		System.out.print(msg+"=");
		return scan.nextDouble();
	}
	void setDat() {
		age = (int)getConData("나이");
		gender = (int)getConData("성별");
		height = getConData("키");
		weight = getConData("몸무게");
	}
//표준체중 index구하기
	void setStandardWeight() {
		double index = 0.90;
		if(age<=35 && gender==2) {
			index = 0.85;
		} else if(age >=36 && gender==1) {
			index = 0.95;
		}
		sWeight = (height-100)*index;
	}
	void setStandardWeightMsg() {
	    sWeightIndex = (weight/sWeight)*100;// 표준체중 지수
		if(sWeightIndex<=85) sWeightMsg = "마른형";
		else if(sWeightIndex<=95) sWeightMsg = "조금마른형";
		else if(sWeightIndex<=115) sWeightMsg = "표준형";
		else if(sWeightIndex<=125) sWeightMsg = "조금비만형";
		else sWeightMsg = "비만형";
	}
	void srandartweightOutput() {
		System.out.println("표준체중="+sWeight);
		System.out.println("표준체중 지수="+sWeightIndex+"으로"+sWeightIndex + "입니다.");
	}
	void startStandard() {
		setDat();
		setStandardWeight();
		setStandardWeightMsg();
		srandartweightOutput();
	}
	
	public static void main(String a[]) {
		StandardWeoghtTOOP oop = new StandardWeoghtTOOP();
		oop.startStandard();
	}
}

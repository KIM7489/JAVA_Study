


import java.util.Scanner;

public class StandardWeoghtTOOP {
	Scanner scan = new Scanner(System.in);

	
//������ �Է°� ����
	int age, gender; // 0
	double height, weight;  // 0.0
	double sWeight; //ǥ��ü�� 	
	String sWeightMsg; //����
	double sWeightIndex;
	public StandardWeoghtTOOP() {}

//��Ƽ�� �Է� �޼ҵ�
	double getConData(String msg) {
		System.out.print(msg+"=");
		return scan.nextDouble();
	}
	void setDat() {
		age = (int)getConData("����");
		gender = (int)getConData("����");
		height = getConData("Ű");
		weight = getConData("������");
	}
//ǥ��ü�� index���ϱ�
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
	    sWeightIndex = (weight/sWeight)*100;// ǥ��ü�� ����
		if(sWeightIndex<=85) sWeightMsg = "������";
		else if(sWeightIndex<=95) sWeightMsg = "���ݸ�����";
		else if(sWeightIndex<=115) sWeightMsg = "ǥ����";
		else if(sWeightIndex<=125) sWeightMsg = "���ݺ���";
		else sWeightMsg = "����";
	}
	void srandartweightOutput() {
		System.out.println("ǥ��ü��="+sWeight);
		System.out.println("ǥ��ü�� ����="+sWeightIndex+"����"+sWeightIndex + "�Դϴ�.");
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

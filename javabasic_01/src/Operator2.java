class Operator2 
{
	public static void main(String[] args) 
	{
		// ��Ʈ ������ : &, |, ^(XOR), ~  -> 2���� �����͸� �̿��� ������
		int a = 12;
		int b = 4;

		int result = a & b;  //   1:true, 0:false
		System.out.println("result="+ result);

		int result2=  a | b;
		System.out.println("result2="+ result2);

		// XOR : �ΰ��� �ٸ� �� ��
		int result3 = a ^ b;
		System.out.println("result3="+ result3);

		// ~ (����)
		// ������ �����͸� ȯ���ϴ� ��� : 2���� -> 1�� ���� + 1
		// 1�� ������ 0�� 1�� 1�� 0���� �ٲٴ� ���̴�.

		int result4 = ~a;  // -13
		System.out.println("result4="+ result4);

		// ����Ʈ ������ : ��Ʈ�� �̵�
		//  << : ��Ʈ�� �������� �̵��Ѵ�.  *���
		//  >>(��ȣ�� ä����), >>>(0���� ä����)  : ��Ʈ�� ���������� �̵�  /���

		int result5 = a << 2;  // �������� 2bit�̵� ������ 0���� ä��   48   12*4
		System.out.println("result5="+ result5);

		int result6 = a >> 2;  // ���������� 2bit�̵� ���� ���� �ڸ��� ��ȣ�� ä������.  3   12/4
		int result7 = result4 >> 2;  // -4
		System.out.println("result6="+ result6);
		System.out.println("result7="+ result7);
	
		int result8 = result4 >>> 2;
		System.out.println("result8="+ result8);


	}
}

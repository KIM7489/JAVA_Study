class GuGuDan 
{
	public static void main(String[] args) 
	{
		System.out.println("\t������");

		for(int dan=1; dan<=9; dan+=3){// dan=1,4,7
			//�� Ÿ��Ʋ         7+3
			for(int i=dan; i<dan+3; i++){ // dan=1   i=1,2,3   dan=4   4,5,6    dan=7    7,8,9
				System.out.print("=="+i+"��==\t");
			}
			System.out.println();

			//3�� ������ ���
			for(int k=2; k<=9; k++){// 2,3,4,5,6,7,8,9
				for(int z=dan; z<dan+3; z++){// dan=1   z=1,2,3   dan=4   4,5,6    dan=7    7,8,9 
					int result = z*k;
					System.out.print(z+"*"+k+"="+result+"\t");
				}
				System.out.println();
			}
		}
	}
}
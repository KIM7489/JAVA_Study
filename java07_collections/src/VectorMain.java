import java.util.Calendar;
import java.util.Vector;

public class VectorMain {

	public VectorMain() {
		//VectorTestŬ������ start()�޼ҵ带 ȣ���ϸ� VectTOR���ϵȴ�.
		VectorTest vt = new VectorTest();
		Vector vvv = vt.start();
	
		String aaa = (String)vvv.elementAt(0);
		System.out.println("aaa="+aaa);
		Calendar ccc = (Calendar)vvv.get(1);
		System.out.println("ccc="+ccc);
		Integer iii = (Integer)vvv.elementAt(2);
		System.out.println("ccc="+iii);
		MemberVO vo = (MemberVO)vvv.elementAt(3);
		vo.memverPrint();
		
		System.out.println(vvv.toString());
		
	}

	public static void main(String[] args) {
		new VectorMain();
		
	}

}

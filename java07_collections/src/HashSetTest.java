import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public HashSetTest() {
		// Set�������̽��� ��ӹ޾��� Ŭ������ 
		// 1. �Է¼����� �������� �۴´�.
		// 2. �ߺ������͸� ������� �ʴ´�.
		
		double[] data = {12,3,3.5,4.2,12,1.3,10,20,30,30,20};
		
		HashSet<Double> hs = new HashSet<Double>();
		
		for(double d : data) {
			hs.add(d);
		}
		System.out.print("SIZE"+hs.size());
	
		Iterator<Double> ii = hs.iterator();
		while(ii.hasNext()) {
			Double iidata = ii.next();
			System.out.println(iidata);
		}
	}
	
	public static void main(String[] args) {
		new HashSetTest();

	}

}

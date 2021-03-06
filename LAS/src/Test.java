import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import LasInfor.LasDataSet;

import LasInfor.LasVO;

public class Test {
	
	public Test() {
		
		LasDataSet.basicLasSet();
		
		ArrayList<LasVO> vd = new ArrayList<LasVO>();
		Collection<LasVO> va = LasDataSet.hs.values();
		Iterator<LasVO> ii = va.iterator();
	
		while(ii.hasNext()) {
			vd.add(ii.next());
		}

		Collections.sort(vd , new SortSal());
		new LasVO().titlePrint();
		for(LasVO vo : vd) {
			System.out.println(vo.toString());
		}
	}
public static void main(String[] aa) {
	new Test();
}
	
	
	class SortSal implements Comparator<LasVO> {
		public int compare(LasVO v1, LasVO v2) {
			return (v1.getBookSal() < v2.getBookSal()) ? -1 :(v1.getBookSal() > v2.getBookSal()) ? 1: 0;
		}
	}
}



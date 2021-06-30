package javareview01;

import java.util.Random;
import java.util.TreeSet;

public class loto {
	Random random = new Random();
	public loto() {
		
	}

	public Integer lotoCreat() {
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		int num;
		while(lotto.size()<7) {
			//로또번호 생성
			num = random.nextInt(45)+1;
			lotto.add(num);
	}
		lotto.remove(num);
		return lotto;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

import java.util.HashMap;
import java.util.Set;

public class dddd {

	public dddd() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		HashMap<String , Integer> map = new HashMap<String , Integer>();

	    map.put("�ų���", 1);
	    map.put("����", 2);
	    map.put("��ȭ", 3);
	    map.put("�Ⱦ�", 4);
	    map.put("����", 5);

	    Set set = map.entrySet();

	    System.out.println(set);
	}

}

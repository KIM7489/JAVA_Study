
public class DefaultData {
	String name="ȫ�浿";
	String tel="123-1234-1234";
	
	public DefaultData() {
	
	}
	
	public DefaultData(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	 public static void sum() {
		int tot=0;
		for(int i=1; i<=100; i++) {
			tot += i;
		}
		System.out.println("tot="+tot);
	}
	public String getName() {
		return name;
	}
}

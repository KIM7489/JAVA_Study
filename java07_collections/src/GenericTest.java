// 제너릭 규칙 <> -> element key value 
public class GenericTest<E> {
	
	private E username;
	
	public GenericTest() {
	}
	
	public GenericTest(E username) {
		this.username = username;
	}
	
	public E getUsetname() {
		return username;
	}
	
	public void setUsername(E username) {
		this.username = username;
	}
}

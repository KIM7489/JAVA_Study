package LasInfor;

import java.util.HashMap;

public class LasLoginData {
	public static HashMap<String, LoginVO> hs1 = new HashMap<String, LoginVO>();
	
	public LasLoginData() {
	}
	
	public static void loginSet() {
	hs1.put("admin", new LoginVO("admin","1234","kdh74899@naver.com","���빮��","2020-10-10"));
	hs1.put("kim", new LoginVO("kim","123","fdsfdsdf@naver.com","��õ��/�ɰ","2020-10-10"));
	}
}
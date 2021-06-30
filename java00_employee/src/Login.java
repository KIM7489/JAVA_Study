
public class Login {
	private final String USERID = "admin";
	private final String USERPWD = "1234";
	public Login() {
	
	}
	//로그인 체크 구현 true:로그인성공, false:로그인 실패
	public boolean loginCheck(String userid, String userPwd) {
		if(userid.equals(USERID) && userPwd.equals(USERPWD)) {
			//로그인 성공1
			return true;
		} else {
			//로그인 실패
			return false;
		}
	}
}


public class Login {
	private final String USERID = "admin";
	private final String USERPWD = "1234";
	public Login() {
	
	}
	//�α��� üũ ���� true:�α��μ���, false:�α��� ����
	public boolean loginCheck(String userid, String userPwd) {
		if(userid.equals(USERID) && userPwd.equals(USERPWD)) {
			//�α��� ����1
			return true;
		} else {
			//�α��� ����
			return false;
		}
	}
}


public class SLogin {
	private EAccount eAccount;
	public SLogin() {
		this.eAccount = new EAccount();
	}
	public VLogin login(String id, String password) {
		//id 찾아서 달라..
		//틀리면 널 주고 P에서 아이고 없읍니다. 다시 입력해주세요. 
		VLogin vLogin = this.eAccount.getLogin(id, password);
		
		return vLogin;
		
	}

}

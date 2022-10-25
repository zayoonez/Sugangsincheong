import java.util.Scanner;

public class PLogin {
	
	private SLogin sLogin;

	//slogin연결
	public PLogin() {
		this.sLogin = new SLogin();
	}

	public VLogin show() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("아이디를 입력하세요");
		String id = scanner.next();
		System.out.println("비밀번호를 입력하세요");
		String password = scanner.next();
		scanner.close();

		
		
		
		VLogin vlogin = sLogin.login(id,password);
		if(vlogin == null) {
			System.out.println("잘못 입력하셨습니다.");
		}
		else { 
			System.out.println(id + "님 로그인되었습니다.");
		}
	
		
		return vlogin;
	}

}

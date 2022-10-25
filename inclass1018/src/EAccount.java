import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EAccount {
	
	private String rId;
	private String rPassword;
	private String rName;
	private String rAddress;
	//...
	public EAccount() {
		
	}
	public VLogin getLogin(String id, String password) {
		VLogin vLogin = null;
		//여기다 담을 거야. file read. 

		try {
			File file = new File("data/account");
			Scanner sc = new Scanner(file);
			boolean found = false;
			while(sc.hasNext() && !found) {
				this.rId = sc.next();
				this.rPassword = sc.next();
//				if(this.rId.compareTo(id)==0 && this.rPassword.compareTo(password)==0) {
//					found = true;
//				}
				if(this.rId.equals(id) && this.rPassword.equals(password)) {
					found = true;
				}
				else {
					found = false;
				}
//				if(id.equals(rId) && password.equals(rPassword)) {
//					return vLogin;
//				}
			}
			sc.close();
			if(found==true) {
				vLogin = new VLogin();
				vLogin.setrId(id);
				vLogin.setrPassword(password);
			}
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return vLogin;
	}

}

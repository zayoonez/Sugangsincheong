import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginDialog extends JDialog {
	private static final long serialVersionUID = 1L;

	private JTextField tfId;
	private JPasswordField tfPassword;
	private JLabel result;
	
	private SLogin sLogin;
	
	public LoginDialog(MainFrame mainFrame, boolean modal) {
		super(mainFrame);
		this.setSize(400, 300);
		
		LayoutManager layoutManager = new GridLayout(3, 2);
		this.setLayout(layoutManager);

		JLabel lbId = new JLabel("아이디");
		this.add(lbId);
		
		this.tfId = new JTextField();
		this.tfId.setColumns(10);
		this.add(this.tfId);
		
		JLabel lbPassword = new JLabel("비밀번호");
		this.add(lbPassword);
		
		this.tfPassword = new JPasswordField();
		this.tfPassword.setColumns(10);
		this.add(this.tfPassword);
		
		JButton btLogin = new JButton("로그인");
		this.add(btLogin);
		
		ActionHandler actionHandler = new ActionHandler();
		btLogin.addActionListener(actionHandler);
		
		result = new JLabel("");
		this.add(result);
		
		this.sLogin = new SLogin();
	}
	
	private void login() {
		String id = this.tfId.getText();
		String password = this.tfPassword.getText();
		
		VLogin vLogin = sLogin.login(id, password);
		if (vLogin == null) {
			// 아이디가 없거나 비밀번호가 틀렸습니다.
			result.setText("아이디 혹은 비밀번호가 틀렸습니다.");
		}
		else {
		result.setText(id + "님, 로그인 완료되었습니다.");
		}
	}
	private class ActionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			login();
		}		
	}
}

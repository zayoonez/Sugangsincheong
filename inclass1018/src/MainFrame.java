import java.awt.BorderLayout;
import java.awt.LayoutManager;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	public MainFrame() {
		// attributes
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 600);
		
		// components
		LayoutManager layoutManager = new BorderLayout();
		this.setLayout(layoutManager);
		
	
		SugangsincheongPanel sugangsincheongPanel = new SugangsincheongPanel();
		this.add(sugangsincheongPanel, BorderLayout.CENTER);
		
		// dialog는 this로 부모를 알려주어야
		LoginDialog loginDialog = new LoginDialog(this);
//		this.add(loginPanel, BorderLayout.NORTH);
		//blocking modal 루 바꾸자. 
		
		loginDialog.setVisible(true);
	
	}
}

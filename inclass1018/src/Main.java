import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Main {
	public static void main(String[] args) throws IOException {
		MainFrame mainFrame = new MainFrame();
//		JFrame kkmainFrame = new JFrame();
//		JLabel label = new JLabel("Test");
//		mainFrame.setSize(400, 600);//바깥에서 정의하지마. 
		
		mainFrame.setVisible(true);
//		mainFrame.add(label);
//		JTextArea textId = new JTextArea("아이디를 입력하세요.");
//		textId.setSize(100,40);
//		mainFrame.add(textId); //이것도 사이즈 알아서 layout 해봐야징. 
		
		PMainFrame pMainFrame = new PMainFrame();
		pMainFrame.show();
		}
		
	}
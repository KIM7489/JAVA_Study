import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JSplitPane;

public class Member01 extends JFrame{
	
	Panel pan;
	Panel pan2;
	JSplitPane split = new JSplitPane();
	
	public Member01() {
		super("회원가입");
		setSize(1000,700);
		
		
		
		
		
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Member01();
		
	}

}

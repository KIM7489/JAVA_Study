package java09_swing;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameTest extends JFrame {
	ImageIcon icon1 = new ImageIcon("img/flower2.jfif");
	public JFrameTest() {
		
		// BorderLayout을 GridLayout으로 변경하기
		GridLayout layout = new GridLayout(3,2,10,10);
		setLayout(new GridLayout(3,2));
		
		JButton btn1 = new JButton("버튼1");
		add(btn1);
		JButton btn2 = new JButton(icon1);
		add(btn2);
		JButton btn3 = new JButton("꽃병",icon1);
		add(btn3);
		JButton btn4 = new JButton("네번째버튼");
		add(btn4);
		
		
		setSize(500,500);
		setVisible(true);
		//setDefaulCloseOperation(DO_NOTHING_ON_CLOSE);
	}

	public static void main(String[] args) {
		
		

	}

}

package java09_swing;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BoderLayout_Ex extends JFrame {

	public BoderLayout_Ex() {
		
		   setTitle("BorderLayout예제");
		   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 시스템 종료 메소드 
		   Container contentPane = getContentPane(); // 컨텐트팬 알아내기
		   contentPane.setLayout(new BorderLayout(30,20));
		   contentPane.add(new JButton("Claculate"),BorderLayout.CENTER);
		   contentPane.add(new JButton("div"),BorderLayout.WEST);
		   contentPane.add(new JButton("sub"),BorderLayout.SOUTH);
		   contentPane.add(new JButton("add"),BorderLayout.NORTH);
		   contentPane.add(new JButton("mul"),BorderLayout.EAST);
		   
		   setSize(300,200);
		   setVisible(true);
		   
		   
		   
		   
	}

	public static void main(String[] args) {
		new BoderLayout_Ex();

	}

}

package java09_swing;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BoderLayout_Ex extends JFrame {

	public BoderLayout_Ex() {
		
		   setTitle("BorderLayout����");
		   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �ý��� ���� �޼ҵ� 
		   Container contentPane = getContentPane(); // ����Ʈ�� �˾Ƴ���
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

package java09_swing;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame {

	public ContentPaneEx() {
		setTitle("ContentPane�� JFrame ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane(); //�����̳��� �˾Ƴ���
		contentPane.setBackground(Color.ORANGE);  //�������� ��� ����
	  contentPane.setLayout(new FlowLayout(FlowLayout.LEFT ,30,40));  //����Ʈ�ҿ� FlowLayout
	  //contentPane.setLayout(new CardLayout());											  // ��ġ������ �ޱ�
		
		contentPane.add(new JButton("OK"));       //OK ��ư �ޱ�
		contentPane.add(new JButton("Cancel"));   //Cancel ��ư �ޱ�
		contentPane.add(new JButton("lgnore"));	  // lgnore ��ư �ޱ�
    
	    setSize(500, 500); // ������ ũ�� 300 x 150 ����
		setVisible(true);  // ȭ�鿡, ������ ���
		   
	}

	public static void main(String[] args) {
		ContentPaneEx con = new ContentPaneEx();

	}

}

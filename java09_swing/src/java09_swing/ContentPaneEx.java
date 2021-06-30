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
		setTitle("ContentPane과 JFrame 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane(); //컨테이너팬 알아내기
		contentPane.setBackground(Color.ORANGE);  //오렌지색 배경 설정
	  contentPane.setLayout(new FlowLayout(FlowLayout.LEFT ,30,40));  //컨텐트팬에 FlowLayout
	  //contentPane.setLayout(new CardLayout());											  // 배치관리자 달기
		
		contentPane.add(new JButton("OK"));       //OK 버튼 달기
		contentPane.add(new JButton("Cancel"));   //Cancel 버튼 달기
		contentPane.add(new JButton("lgnore"));	  // lgnore 버튼 달기
    
	    setSize(500, 500); // 프레임 크기 300 x 150 설정
		setVisible(true);  // 화면에, 프레임 출력
		   
	}

	public static void main(String[] args) {
		ContentPaneEx con = new ContentPaneEx();

	}

}

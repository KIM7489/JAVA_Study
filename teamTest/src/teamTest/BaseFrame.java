package teamTest;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class BaseFrame extends JFrame implements ActionListener{
	JSplitPane baseSp;
	JSplitPane menuSp;
	JPanel viewPane = new JPanel();
	
		Font homeFnt = new Font("����",Font.BOLD, 100);
		Font menuFnt = new Font("����",Font.BOLD, 40);
			
	public BaseFrame() {
		
		super("BIT CINEMA");
		SignUp pan1 = new SignUp();
		
		baseTop();												//panel
		baseSp = new JSplitPane(JSplitPane.VERTICAL_SPLIT, menuSp, pan1.pan1());
		baseSp.setDividerSize(0);
		baseSp.setDividerLocation(200);
		
	
		add(baseSp);
		setSize(1200,800);
		setVisible(true);
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	
	}
	
	public void baseTop(){
		
		JPanel TopPane = new JPanel();
		JPanel BottomPane = new JPanel();
		BottomPane.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 5));
		BottomPane.setBackground(Color.WHITE);
		TopPane.setBackground(Color.WHITE);
		
		
		//BIT CIEMA ��
		//Ŭ���� �ʱ�ȭ������ ���� ��� �߰� �ʿ�?
		JLabel lblHome = new JLabel("BIT CINEMA", JLabel.CENTER);
		lblHome.setFont(homeFnt);
		TopPane.add(lblHome);
		
		
		//���� �޴�
		//�󺧷� ������, ������ �ö����� ���콺��ư �̹��� ���� �̺�Ʈ?, Ŭ���� viewPane�� �� ȭ��� ���
		JLabel lblMovie = new JLabel("��ȭ", JLabel.CENTER);
		JLabel lblTicketing = new JLabel("����", JLabel.CENTER);
		JLabel lblMovieHouse = new JLabel("����", JLabel.CENTER);
		JLabel lblMyPage = new JLabel("����������", JLabel.CENTER);
		lblMovie.setFont(menuFnt);
		lblTicketing.setFont(menuFnt);
		lblMovieHouse.setFont(menuFnt);
		lblMyPage.setFont(menuFnt);
		BottomPane.add(lblMovie);
		BottomPane.add(lblTicketing);
		BottomPane.add(lblMovieHouse);
		BottomPane.add(lblMyPage);
		
		
		//��ư���� ������ ���߿� �����غ���....
//		JButton movBtn = new JButton("��ȭ");
//		JButton ticBtn = new JButton("����");
//		JButton movHBtn = new JButton("����");
//		JButton myPageBtn = new JButton("����������");
		
//		movBtn.setFont(menuFnt);
//		ticBtn.setFont(menuFnt);
//		movHBtn.setFont(menuFnt);
//		myPageBtn.setFont(menuFnt);
		
//		movBtn.setBackground(Color.WHITE);;
//		ticBtn.setFont(menuFnt);
//		movHBtn.setFont(menuFnt);
//		myPageBtn.setFont(menuFnt);
		
//		BottomPane.add(movBtn);
//		BottomPane.add(ticBtn);
//		BottomPane.add(movHBtn);
//		BottomPane.add(myPageBtn);
		
		
		menuSp = new JSplitPane(JSplitPane.VERTICAL_SPLIT, TopPane,BottomPane);
		menuSp.setDividerLocation(130);
		menuSp.setDividerSize(0);
	}
	public void mainPanel() {
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton button = (JButton)e.getSource();
		if(button.equals("�ߺ�Ȯ��")) {
			SignIn signin = new SignIn();
			signin.pan1();
			System.out.println("����");
		}
		
	}
	public static void main(String[] args) {
		new BaseFrame();
	}

	

}
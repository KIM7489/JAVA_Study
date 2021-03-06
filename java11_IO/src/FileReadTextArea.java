import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class FileReadTextArea extends JFrame implements ActionListener{
	JButton btn = new JButton("클릭하세요");
	JTextArea ta = new JTextArea();
	JScrollPane sp;
	
	public FileReadTextArea() {
		add(BorderLayout.NORTH, btn);
		sp = new JScrollPane(ta);
		add(sp);
		
		setSize(500,600);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		btn.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		try {
			File f = new File("c://mypro/testFile/CalendarTest.java");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			while(true) {
				String txt = br.readLine();
				if(txt==null)break;
				ta.append(txt+"\n");
			}
			br.close();
			fr.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new FileReadTextArea();

	}

}

package java09_swing;

import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class DigitalClock01 extends JFrame {
	Font fnt = new Font("����", Font.BOLD, 100);
	Calendar now;
	JLabel lbl = new JLabel("00:00:00", JLabel.CENTER);
	public DigitalClock01() {
			super("�ð�");
			add(lbl);
			lbl.setFont(fnt);
			
			setSize(500,200);
			setVisible(true);
			starClock();
	}
	//�ð� ����
	public void starClock() {
		do {
			//�ð�����
			lbl.setText(getTimer());
			
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {};
		}while(true);
	}

	public String getTimer() {
		now = Calendar.getInstance();
		SimpleDateFormat fmt = new SimpleDateFormat("HH:mm:ss");
		return fmt.format(now.getTime());
	}
	public static void main(String[] args) {
		new DigitalClock01();

	}

}
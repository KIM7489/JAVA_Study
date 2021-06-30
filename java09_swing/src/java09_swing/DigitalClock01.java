package java09_swing;

import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class DigitalClock01 extends JFrame {
	Font fnt = new Font("굴림", Font.BOLD, 100);
	Calendar now;
	JLabel lbl = new JLabel("00:00:00", JLabel.CENTER);
	public DigitalClock01() {
			super("시계");
			add(lbl);
			lbl.setFont(fnt);
			
			setSize(500,200);
			setVisible(true);
			starClock();
	}
	//시간 변경
	public void starClock() {
		do {
			//시간변경
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

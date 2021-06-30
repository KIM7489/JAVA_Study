package java09_swing;
import java.awt.Color;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class DigitalColock extends JFrame {

	private String one;
	private String two;
	private JLabel first = new JLabel();
	private JLabel second = new JLabel();
	
	
	public void setlable() {
		second.setOpaque(true);
		second.setBackground(new Color(0,0,0));
		second.setBounds(85,170,300,50);
		second.setForeground(Color.black);
		
		first.setOpaque(true);
		first.setBackground(new Color(0,0,0));
		first.setBounds(60, 120, 320, 50);
		first.setForeground(Color.black);
	}
	
	public DigitalColock() {
		set();
		setlable();
		timeget();
	}
	public void set() {
		
		setTitle("Y_Clock Test");
		setSize(500, 500);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public void timeget() {
		
		       while(true) {
							Calendar c = Calendar.getInstance();
							int year = c.get(Calendar.YEAR);
							int month = c.get(Calendar.MONTH);
							int date = c.get(Calendar.DATE);
							int amPm = c.get(Calendar.AM_PM);
							int hour = c.get(Calendar.HOUR);
							int min = c.get(Calendar.MINUTE);
							int sec = c.get(Calendar.SECOND);
							int msec = c.get(Calendar.MILLISECOND);
							String ampm=amPm==Calendar.AM? "PM":"AM";
							int day = c.get(Calendar.DAY_OF_WEEK);
							System.out.println(year+"년"+month+"월"+date+"일"+ampm+hour+"시"+min+"분"+sec+"초");
						try{
							Thread.sleep(100);
						} catch (Exception e){}
		       }
	}
	public static void main(String[] args) {
		new DigitalColock();
	}

}

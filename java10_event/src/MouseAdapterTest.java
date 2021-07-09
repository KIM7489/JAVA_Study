import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;

public class MouseAdapterTest extends JFrame {
	// 1개의 메소드만을 사용하고 싶을때 사용한다.
	// 메소드가 1개만 있는 추상클래스는 없다.
	// Adapter
	int x,y;
	MyCanvas my = new MyCanvas();
	public MouseAdapterTest() {}
	private void test()
	{
		setSize(500,500);
		add(my);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// 익명의 내부클래스
		my.addMouseListener(new MouseAdapter() {@Override
		public void mouseClicked(MouseEvent e) {
			
		}
		public void mouseReleased(MouseEvent e) {
			//마우스왼쪽버튼 :1, 가운데휠: 2, 오른쪽버튼 3
	    	//마우스가 클릭된곳의 좌표를 가져온다.
			if(e.getButton()==1) {
				x =e.getX();
				y =e.getY();
				my.repaint();
			}	
	    }
		});
		
	}
	public class MyCanvas extends Canvas{
		public void paint(Graphics g)
		{
			Random ran = new Random();
			g.setColor(new Color(ran.nextInt(256),ran.nextInt(256),ran.nextInt(256)));
			g.fillOval(x,y,50,50);
		}public void update(Graphics g)
		{
			paint(g);
		}
		
	}
	public static void main(String[] a)
	{
		new MouseAdapterTest().test();
	}
}

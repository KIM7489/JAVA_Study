import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;

public class MouseAdapterTest2 extends JFrame {
	// 1개의 메소드만을 사용하고 싶을때 사용한다.
	// 메소드가 1개만 있는 추상클래스는 없다.
	// Adapter
	
	MyCanvas my = new MyCanvas();
	public MouseAdapterTest2() {}
	private void test()
	{
		setSize(500,500);
		add(my);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		my.addMouseListener(new CanvasAdapterTest(my));
	}
	public class MyCanvas extends Canvas{
		int x,y;
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
		new MouseAdapterTest2().test();
	}
}
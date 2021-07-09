import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class packman extends JFrame {
	MyCanvas mc = new MyCanvas();
	Dimension dim;
	//캔버스의 x,y;
	int x,y;
	//이미지 포인트로 상횽할 변수
	int p=0;
	public packman() {
		
		add(mc);
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		//캔버스크기를 구하라
		dim = mc.getSize();
		x= (int)(dim.getWidth()/2 -25);
		y= (int)(dim.getWidth()/2 -25);
		
		//paint 메소드를 반복 호출
		
		while(true) {
			mc.repaint();
			if(p==0) p--;
			else p--;
			
			
		}
	}
	
	class MyCanvas extends Canvas{
		Image packMan;
		MyCanvas() {
			
			packMan = Toolkit.getDefaultToolkit().getImage("E:/workspace/packman1/src/img/packman.jpg");
		}
		public void paint(Graphics g) {
			//                   canvas    image
			g.drawImage(packMan, x, y, x+50, y+50, 0, 0, 50, 50, this);
		}
	}
	public static void main(String[] args) {
		new packman();

	}

}

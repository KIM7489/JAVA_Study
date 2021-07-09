

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class PackMan extends JFrame implements KeyListener {
	private Pack pa = new Pack();
	// 캔버스의 x, y
	int x,y;
	// 이미지 포인트로 사용할 변수
	int p=0;
	boolean test = false;
	Dimension dim;
	public PackMan() {}
	private void frame()
	{
		setTitle("팩맨");
		add(pa);
		setSize(500,500);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//캔버스의 크기를 구한다.
		dim= pa.getSize();
		x =(int)(dim.getWidth()/2-25);
		y =(int)(dim.getHeight()/2-25);
		
		//커서를 캔버스에 설정하기
		pa.setFocusable(true);
		
		//이벤트등록
		pa.addKeyListener(this);
		//paint 메소드를 반복호출
		while(true)
		{
			pa.repaint();
			//이미지 변환 왼쪽으로 이동
			if(p%2==0) { 
				p++;
			}else p--;
			//좌표이동  왼쪽으로 이동
			if(p==0|| p==1) {
				x-=10;
				if(x<=-50) x=(int)(dim.getWidth());
			}if(p==2|| p==3) {
				x+=10;
				if(x>=dim.getWidth()) x=-50;
			}if(p==4|| p==5) {
				y-=10;
				if(y<=-50) y=(int)dim.getHeight();
			}if(p==6|| p==7) {
				y+=10;
				if(y>=dim.getHeight()) y=-50;
			}
			// 시간지연
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public class Pack extends Canvas
	{
		public Image ime;
		public Pack() {
		ime = Toolkit.getDefaultToolkit().getImage("img/packman.jpg");
		}
		public void paint(Graphics g) {
			//                좌표 4개         그림크기 4개
			g.drawImage(ime,x,y,x+50,y+50,    p*50,0,p*50+50,50,this);
		}
	}
	public void keyPressed(KeyEvent e) {}
	public void keyReleased(KeyEvent e) {
		int code = e.getKeyCode();
		if(code== KeyEvent.VK_LEFT ||code==KeyEvent.VK_A)
		{
			p=0;
		}else if(code== KeyEvent.VK_RIGHT ||code==KeyEvent.VK_D)
		{
			p=2;
		}else if(code== KeyEvent.VK_UP ||code==KeyEvent.VK_W)
		{
			p=4;
		}else if(code== KeyEvent.VK_DOWN ||code==KeyEvent.VK_S)
		{
			p=6;
		}
		
	}
	public void keyTyped(KeyEvent e) {}
	
	public static void main(String[] a)
	{
		new PackMan().frame();
	}
}

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CanvasAdapterTest extends MouseAdapter {
	MouseAdapterTest2.MyCanvas my;
	public CanvasAdapterTest() {}
	public CanvasAdapterTest(MouseAdapterTest2.MyCanvas my) {
		this.my=my;
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		if(e.getButton()==1)
		{
			my.x= e.getX();
			my.y= e.getY();
			my.repaint();
		}
	}
}


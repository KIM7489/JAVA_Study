import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;

public class JTabbedPaneTest extends JFrame {
   JTabbedPane tp;
   JLabel lbl;
   ImageIcon ii = new ImageIcon("img/test_img.jpg");
   
   JButton btn;
   ImageIcon iii = new ImageIcon("img/test_img2.png");
   
   DigitalClock2 dc = new DigitalClock2(0,0);
   CalculatorEX2 cal = new CalculatorEX2();
   SwingCalendar2 sc = new SwingCalendar2();

   Dimension dim;
   int x,y;
   Packman2 pm;
   public JTabbedPaneTest() {
      super("탭메뉴");
      
      tp = new JTabbedPane(JTabbedPane.LEFT);
      
      lbl = new JLabel(ii);
      tp.addTab("레이블", lbl);
      btn = new JButton(iii);
      tp.addTab("버튼", btn);
      
      tp.addTab("시계", dc);
      
      tp.addTab("계산기", cal);
      
      tp.addTab("달력", iii, sc, "달력");
      
      
      tp.insertTab("Button", null, new JButton("추가된 버튼"), "중간에 탭메뉴 추가", 3);
      
      //탭의 활성화 비활성화
      //            탭 index , true/false
//      tp.setEnabledAt(2, false);
      
      //첫번째 탭을 제외한 나머지 모든 탭을 비활성화 한다.
//      tp.setEnabled(false);
      add(tp);
      setSize(500,500);
      
      dim = tp.getSize();
      pm = new Packman2(dim);
      
      tp.insertTab("팩맨", null, pm, "팩맨", 4);      
      
      setVisible(true);
      setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      //탭의 삭제
//      try {Thread.sleep(3000);}catch(Exception e) {}
//      tp.removeTabAt(3);
      
   }

   public static void main(String[] args) {
      new JTabbedPaneTest();
   }

}
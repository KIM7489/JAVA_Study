import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;

public class JInternalFrameTest extends JFrame implements ActionListener{
   JDesktopPane dp = new JDesktopPane();
   JInternalFrame if1, if2, if3;
   
   ImageIcon openIcon = new ImageIcon("img/2.gif");
   ImageIcon saveIcon = new ImageIcon("img/1.gif");
   
   
   JToolBar tb = new JToolBar();
      JButton openBtn = new JButton(openIcon);
      JButton saveBtn = new JButton(saveIcon);
      JButton foreColor = new JButton("글자색");
      
   //글꼴
   JToggleButton boldBtn = new JToggleButton("A");//진하게
   JToggleButton italicBtn = new JToggleButton("A");//기울임꼴
   JComboBox<String> fontCombo = new JComboBox<String>();//글꼴
   JComboBox<Integer> sizeCombo = new JComboBox<Integer>();//글자크기
   DefaultComboBoxModel<String> fontModel = new DefaultComboBoxModel<String>();
   DefaultComboBoxModel<Integer> sizeModel = new DefaultComboBoxModel<Integer>();
      
      
      int bold = 0;// 1-> 0
      int italic = 0;
   public JInternalFrameTest() {
      tb.add(openBtn);
      tb.add(saveBtn);
      tb.addSeparator();
      tb.add(foreColor);
      
      //글꼴관련 메뉴
      boldBtn.setFont(new Font("Arial",Font.BOLD,14));
      italicBtn.setFont(new Font("Arial",Font.ITALIC,14));      
      tb.add(boldBtn);
      tb.add(italicBtn);
      
      //글꼴 : 윈도우 운영체제에서 지원하는 글꼴을 이요하여 콤보박스 만들기
      GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
      String fontName[] = ge.getAvailableFontFamilyNames();
      fontModel = new DefaultComboBoxModel<String>(fontName);
      fontCombo.setModel(fontModel);
      fontCombo.setSelectedItem("굴림");
      tb.add(fontCombo);
      
      //글자크기
      for(int size=8; size<100;size+=2) {
         sizeModel.addElement(size);
      }
      sizeCombo.setModel(sizeModel);
      sizeCombo.setSelectedItem(12);
      tb.add(sizeCombo);
      
      add(BorderLayout.NORTH,tb);
      
      add(dp);
      
      //먼저만든게 위로옴
      if1 = new JInternalFrame();
      if1.setSize(300, 200);
      if1.setVisible(true);
      dp.add(if1);
      
      if2 = new JInternalFrame("메모장", true);//창크기조절가능
      if2.add(new JScrollPane(new JTextArea()));
      if2.setBounds(100,200,500,400);
      if2.setVisible(true);
      dp.add(if2);
      
      if3 = new JInternalFrame("계산기", true, true, true, true);
      if3.add(new CalculatorEx2());
      if3.setSize(400,350);
      if3.setVisible(true);
      dp.add(if3);
      
      
      
      setSize(1200,1000);
      setVisible(true);
      setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      
      try {
         if3.setSelected(true);//계산기 프레임 활성화 
      }catch(Exception e) {
         
      }
      openBtn.addActionListener(this);
      saveBtn.addActionListener(this);
      foreColor.addActionListener(this);
      boldBtn.addActionListener(this);
   }
   public void actionPerformed(ActionEvent ae) {
      Object event = ae.getSource();
      if(event instanceof JButton) {
         if(event == openBtn) {
            fileOpen();
         }else if(event == saveBtn) {
            fileSave();
         }else if(event == foreColor) {
            setFontFore();
         }else if(event == boldBtn) {
            if(boldBtn.isSelected()) {
               //진하게 버튼이 선택되었을때
               bold = 1;
            }else {
               //아닐때
               bold = 0;
            }
            fontSetting();
         }else if(event == italicBtn) {
            
         }else {
            
         }
      }
   }
   public void fontSetting() {
      //DeskTop에서 선택된 JInternalFrame을 구한 후 그 안에 있는 JTextArea 얻어오기
      JInternalFrame activeIf = dp.getSelectedFrame();
      JTextArea ta = (JTextArea)activeIf.getFocusOwner();
      
      ta.setFont(new Font((String)fontCombo.getSelectedItem(),bold+italic,(Integer)sizeCombo.getSelectedItem()));
   }
   //글자색 변경
   public void setFontFore(){
      JColorChooser cc = new JColorChooser(Color.GREEN);
      Color selectColor = cc.showDialog(this, "글자색", Color.PINK);
      
      JInternalFrame selectif = dp.getSelectedFrame();
      JTextArea ta = (JTextArea)selectif.getFocusOwner();
      ta.setForeground(selectColor);
      
   }
   //파일저장
   public void fileSave() {
      JFileChooser fc = new JFileChooser();
      if(fc.showSaveDialog(this)==0) {
         try {
            File f = fc.getSelectedFile();            
            FileWriter fw = new FileWriter(f);
            
            //현재 선택된 Frame얻어오기 ->창이여러개여서(활성화 된 창 얻어와야함)
            JInternalFrame selectIf = dp.getSelectedFrame();
            JTextArea eventTa = (JTextArea)selectIf.getFocusOwner();//textArea 리턴됨/컴포넌트로 넘어와서 형변환 해줘야함
            fw.write(eventTa.getText());
         }catch(Exception e) {
            
         }
      }
   }
   //파일열기
   public void fileOpen() {
      JFileChooser fc = new JFileChooser();
      //0: 열기, 1:취소
      //int state = fc.showOpenDialog(this); 변수에 담는 방법
      if(fc.showOpenDialog(this)==0) {//안담고 바로 쓰는 방법
         //선택한 파일 객체 얻어오기
         File f = fc.getSelectedFile();
         JTextArea ta = new JTextArea();
         
         try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);//한문장씩 읽어오는것..?
            while(true) {
               String readData = br.readLine();
               if(readData == null)break;
               ta.append(readData+"\n");
            }
            JScrollPane sp2 = new JScrollPane(ta);
            JInternalFrame if5 = new JInternalFrame(f.getPath(), true,true,true,true);//리사이즈 닫기 최대화 아이콘화
            if5.add(sp2);
            dp.add(if5);//여기서 먼저 추가해야 맨뒤에있던 창이 파일을 열었을때 맨앞으로 나옴
            if5.setSize(500,500);
            if5.setSelected(true);
            if5.setVisible(true);
            
         }catch(Exception e) {
            
         }
      }
   }

   public static void main(String[] args) {
      new JInternalFrameTest();

   }

}
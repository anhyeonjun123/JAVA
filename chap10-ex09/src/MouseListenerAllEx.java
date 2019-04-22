import javax.swing.*; 
import java.awt.Event.*; 
import java.awt.*; 
 
public class MouseListenerAllEx extends JFrame { 
	private JLabel la = new JLabel("No Mouse Event"); //메시지 출력 레아블 컴포넌트 
	 
	 public MouseListenerAllEx() { 
		 setTitle("MouseListener와 MouseMotionListener 예제"); 
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		  
		 Container c = getContentPane();
		 c.setLayout(new FlowLayout ());
		  
		 MyMouseListener listener = new MyMouseListener(); // 리스너 객체 생성 
		 c.addMouseListener(listener);         //MouseListener 리스너 등록 
		 c.addMouseMotionListener(listener); // MouseMotionListener 리스너등록 
		 
		 
	 }
}
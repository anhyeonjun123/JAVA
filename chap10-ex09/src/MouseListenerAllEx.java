import javax.swing.*; 
import java.awt.Event.*; 
import java.awt.*; 
 
public class MouseListenerAllEx extends JFrame { 
	private JLabel la = new JLabel("No Mouse Event"); //�޽��� ��� ���ƺ� ������Ʈ 
	 
	 public MouseListenerAllEx() { 
		 setTitle("MouseListener�� MouseMotionListener ����"); 
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		  
		 Container c = getContentPane();
		 c.setLayout(new FlowLayout ());
		  
		 MyMouseListener listener = new MyMouseListener(); // ������ ��ü ���� 
		 c.addMouseListener(listener);         //MouseListener ������ ��� 
		 c.addMouseMotionListener(listener); // MouseMotionListener �����ʵ�� 
		 
		 
	 }
}
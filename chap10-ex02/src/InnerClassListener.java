import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
 
public class InnerClassListener extends JFrame { 
	public InnerClassListener () { 
		setTitle("Action �̺�Ʈ ������ ����"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		Container c = getContentPane(); 
		c.setLayout(new FlowLayout()); 
		JButton btn = new JButton("Action"); 
		btn.addActionListener(new MyActionSistener());
	}
}

public class InnerClassListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

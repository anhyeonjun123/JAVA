import javax.swing.*;
import java.awt.*; 
 
public class ButtonEx extends JFrame { 
	public ButtonEx() {
		setTitle("이미지 버튼 에제"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		Container c = getContentPane(); 
		c.setLayout(new FlowLayout()); 
		 
		// 3개의 이미지를 파일로부터 읽어들인다. 
		ImageIcon nornalIcon = new ImageIcon("images/normalIcon.gif"); 
		ImageIcon rolloverIcon = new ImageIcon("images/rolloverIcon.gif"); 
		ImageIcon pressedIcon = new ImageIcon("images/pressedIcon.gif"); 
		 
		// 3개의 이미지를 가진 버튼 생성 
		JButton btn = new JButton("call~~", nornalIcon); 
		btn.setPressedIcon(pressedIcon);  
		btn.setRolloverIcon(rolloverIcon); 
		c.add(btn);
		
		setSize(250,150);
		setVisible(true); 
	}
	
public static void main(String [] args) { 
	new ButtonEx();
	

	}
}

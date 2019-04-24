import javax.swing.*;

import java.awt.*; 
 
public class SwingEx extends JFrame { 
	public SwingEx() { 
		setTitle("스윙 컴포넌트 보이기 예제"); 
		createMenu(); 
		createToolBar(); 
		createSplitPane(); 
		setSize(500,400); 
		setVisible(true); 
	}
	 
	private void createMenu() { 
		JMenuBar mb = new JMenuBar(); 
		mb.add(new JMenu("File")); 
		mb.add(new JMenu("Edit")); 
		mb.add(new JMenu("Source")); 
		mb.add(new JMenu("Project")); 
		mb.add(new JMenu("Run")); 
		 
		this.setJMenuBar(mb); 
	}
}







public class SwingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

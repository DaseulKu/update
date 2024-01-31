package swing.ver01;

import java.awt.Container;
import javax.swing.JFrame;
public class MyWin extends JFrame{
	public MyWin() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		this.setTitle("Title");
		this.setSize(400, 300);
		this.setLocation(700, 400);
		this.setVisible(true);	
	}
	public static void main(String[] args) {
		new MyWin();
	}
}
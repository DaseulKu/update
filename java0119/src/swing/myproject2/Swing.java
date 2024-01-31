package swing.myproject2;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Swing extends JFrame{
	JButton jb1 = new JButton("버튼1");
	JButton jb2 = new JButton("버튼2");
	JTextField jt1 = new JTextField();
	JTextField jt2 = new JTextField();
	public Swing() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		this.setVisible(true);
		this.setSize(500, 500);
		this.setLocation(100,100);
		this.setTitle("스윙스윙");
		
		con.setLayout(new FlowLayout());
		
		JLabel jl1 = new JLabel();
		con.add(jl1);
		con.add(jt1);
		jl1.setLocation(100, 100);
		jl1.setSize(100, 10);
		jt1.setLocation(200, 200);
		jt1.setSize(100, 10);
		
		JLabel jl2 = new JLabel();
		con.add(jl2);
		con.add(jt2);
		
	}
	public static void main(String[]args) {
		new Swing();
	}
}

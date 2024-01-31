package swing.ver04;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyWin extends JFrame{
	JLabel lb1 = new JLabel("label1");
	JTextField tf1 = new JTextField(5);
	JButton bt1 = new JButton("button1");
	
	JLabel lb2 = new JLabel("label2");
	JTextField tf2 = new JTextField(5);
	JButton bt2 = new JButton("button2");
	
	public MyWin() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container con = this.getContentPane();
		con.setLayout(new FlowLayout());
		con.add(lb1);
		con.add(tf1);
		con.add(bt1);
		
		con.add(lb2);
		con.add(tf2);
		con.add(bt2);
		
		this.setTitle("Title");
		this.setSize(400, 300);
		this.setLocation(700, 400);
		this.setVisible(true);	
		// 익명 클래스(anonymous class)를 사용하여 ActionListener를 구현
		// 해당 버튼에 대한 액션 이벤트를 처리할 익명의 ActionListener를 생성
		//클래스를 새로 만들지 않고도 ActionListener를 정의할 수 있어서 코드가 간결해짐
		bt1.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button1 Clicked!");
			}
		});
		
		bt2.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button2 Clicked!");				
			}
		});
		
	}
	public static void main(String[] args) {
		new MyWin();
	}
}
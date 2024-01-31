package swing.ver03;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyWin extends JFrame implements ActionListener{
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
		con.add(lb1); con.add(tf1); con.add(bt1);	
		con.add(lb2); con.add(tf2); con.add(bt2);
		
		this.setTitle("Title");
		this.setSize(400, 300);
		this.setLocation(700, 400);
		this.setVisible(true);
		
		bt1.addActionListener(this); // 현재객체(JButton)가 ActionListener를 구현있음
		bt2.addActionListener(this); // 버튼의 액션 이벤트가 발생하면 MyWin 내부의 actionPerformed 메소드호출
	}
	public static void main(String[] args) {
		new MyWin();
	}
	@Override // ActionListener 의 추상 메소드 재정의
	public void actionPerformed(ActionEvent e) {
		// 버튼이 클릭되었을때 실행되는 코드
//		System.out.println("Button Clicked!"); 어떤 버튼을 눌러도 같은 결과 실행
		if(e.getSource().equals(bt1)) {
			System.out.println("Button1 Clicked!");
		}else if(e.getSource().equals(bt2)){
			System.out.println("Button2 Clicked!");
		}
		
	}
}
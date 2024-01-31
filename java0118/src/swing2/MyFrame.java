package swing2;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

class MyAction implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getSource());
	}
}

public class MyFrame extends JFrame{
	public MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		this.setVisible(true);
		this.setSize(500, 300);
		this.setLocation(1000, 500);
		this.setTitle("오늘은 이벤트");
		
		con.setLayout(new FlowLayout()); // 배치관리자(삽입되는 순서대로 왼>오로 배치)
		JButton jb1 = new JButton("버튼1");
		con.add(jb1);
		jb1.addActionListener(new MyAction());
		JButton jb2 = new JButton("버튼2");
		con.add(jb2);
		jb2.addActionListener(new MyAction());
	}
	
	public static void main(String[]args) {
		new MyFrame();
	}
}

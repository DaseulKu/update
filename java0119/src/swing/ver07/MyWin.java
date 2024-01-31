package swing.ver07;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyWin extends JFrame {
	JLabel lb1 = new JLabel("레이블1");
	JTextField tf1 = new JTextField(5);
	JButton bt1 = new JButton("버튼1");

	JLabel lb2 = new JLabel("종료레이블2");
	JTextField tf2 = new JTextField(5);
	JButton bt2 = new JButton("종료버튼");

	JLabel lbState = new JLabel("메세지상태보여줌");
	JTextArea ta = new JTextArea(5,10);
	public MyWin() {
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

		Container con = this.getContentPane();
		con.setLayout(new FlowLayout());//적힌순서대로
		con.add(lbState);
		
		con.add(lb1);
		con.add(tf1);
		con.add(bt1);

		con.add(lb2);
		con.add(tf2);
		con.add(bt2);
		JScrollPane scroll = new JScrollPane(ta);
//		scroll.setsize(30,20);
		con.add(scroll);
		this.setTitle("윈도우제목");
		this.setSize(400, 300);
		this.setLocation(700, 400);
		this.setVisible(true);

		bt1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼1을 클릭했습니다");
				lbState.setText("버튼1클릭 메세지");
			}
		});

		bt2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				confirmExit();
			}
		});
		//파일읽기 작업 처리
		JOptionPane.showMessageDialog(this,
				"파일을 읽었습니다!","파일읽기",JOptionPane.INFORMATION_MESSAGE);

	}
	
	public void confirmExit() {
		int answer = JOptionPane.showConfirmDialog(this, 
				"종료하시겠습니까?","확인",JOptionPane.YES_NO_OPTION);
		if(answer==JOptionPane.YES_OPTION) {
			System.out.println("프로그램을 종료합니다");
			lbState.setText("종료메세지");
			//파일로 객체를 보내는 코드 넣을 예정
			System.exit(0);
		}else {
			System.out.println("종료를 취소합니다");
			lbState.setText("종료취소 메세지");
		}
	}
	public static void main(String[] args) {
		new MyWin();
	}
}
package swing.myproject1;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class MyFrame extends JFrame implements ActionListener{
	JButton jb1 = new JButton("전체내용");
	JButton jb2 = new JButton("입력");
	JButton jb3 = new JButton("조회");
	JButton jb4 = new JButton("수정");
	JButton jb5 = new JButton("삭제");
	JTextField jt1 = new JTextField();
	JTextField jt2 = new JTextField();
	JTextField jt3 = new JTextField();
	JTextField jt4 = new JTextField();
	JTextField jt5 = new JTextField();
	JTextField jt6 = new JTextField();
	List<Account> list = new ArrayList<>();
	public MyFrame() {
		Container con = this.getContentPane();
		con.setLayout(null);
		
		JLabel lb1 = new JLabel("이름");
		con.add(lb1);
		lb1.setLocation(20, 50);
		lb1.setSize(100, 30);
		
		
		con.add(jt1);
		jt1.setLocation(50, 50);
		jt1.setSize(100, 30);
		
		JLabel lb2 = new JLabel("아이디");
		con.add(lb2);
		lb2.setLocation(200, 50);
		lb2.setSize(100, 30);
		
		
		con.add(jt2);
		jt2.setLocation(250, 50);
		jt2.setSize(100, 30);
		
		JLabel lb3 = new JLabel("패스워드");
		con.add(lb3);
		lb3.setLocation(400, 50);
		lb3.setSize(100, 30);
		
		
		con.add(jt3);
		jt3.setLocation(460, 50);
		jt3.setSize(100, 30);
		
		JLabel lb4 = new JLabel("생년월일");
		con.add(lb4);
		lb4.setLocation(620, 50);
		lb4.setSize(100, 30);
		
		
		con.add(jt4);
		jt4.setLocation(680, 50);
		jt4.setSize(100, 30);
		
		JLabel lb5 = new JLabel("전화");
		con.add(lb5);
		lb5.setLocation(20, 80);
		lb5.setSize(100, 30);
		
		
		con.add(jt5);
		jt5.setLocation(50, 80);
		jt5.setSize(100, 30);
		
		JLabel lb6 = new JLabel("잔고");
		con.add(lb6);
		lb6.setLocation(200, 80);
		lb6.setSize(100, 30);
		
		
		con.add(jt6);
		jt6.setLocation(250, 80);
		jt6.setSize(100, 30);
		
		
		jb1.setLocation(20, 350);
		jb1.setSize(100, 30);
		con.add(jb1);
		jb1.addActionListener(this);
		
		
		jb2.setLocation(200, 350);
		jb2.setSize(100, 30);
		con.add(jb2);
		jb2.addActionListener(this);
		
		
		jb3.setLocation(380, 350);
		jb3.setSize(100, 30);
		con.add(jb3);
		jb3.addActionListener(this);
		
		jb4.setLocation(560, 350);
		jb4.setSize(100, 30);
		con.add(jb4);
		jb4.addActionListener(this);
		
		jb5.setLocation(740, 350);
		jb5.setSize(100, 30);
		con.add(jb5);
		jb5.addActionListener(this);
		JTextArea ta = new JTextArea();
		ta.setLocation(20, 120);
		ta.setSize(830, 200);
		con.add(ta);
		
		this.setLocation(200, 100);
		this.setTitle("스윙 연습");
		this.setVisible(true);  // 윈도우 프레임을 보이게
		this.setSize(900, 500);  // 크기 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String... ar) {
		
		new MyFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
//		System.out.println(e.getActionCommand()); 버튼위에 글자
		switch(e.getActionCommand()) {
		case "전체내용":
			System.out.println("전체내용");
			for (Account account : list) {
				System.out.println(account);
			}
			break;
		case "입력":
			System.out.println("입력완료");
			System.out.println("입력된 정보가 저장되었습니다");
			String name = jt1.getText();
			String id = jt2.getText();
			String pw = jt3.getText();					
			String ssn = jt4.getText();			
			String tel = jt5.getText();	
			int balance = Integer.parseInt(jt6.getText());
			list.add(new Account(name, id, pw, ssn, tel, balance));
			break;
		case "조회":
			System.out.println("조회하기");
			String inputId = jt2.getText();
			boolean found = false;
			for (Account account : list) {
		        if (account.getId().equals(inputId)) {
		        	System.out.println("조회된 계정 아이디: " + account.getId());
		        	found = true;
		            break;
		        }
			}if (!found) {
		        System.out.println("일치하는 아이디가 없습니다.");
		    }
		    break;
		case "수정":
			System.out.println("수정 실행");
			break;
		case "삭제":
			System.out.println("삭제 실행");
			break;
		default:
			break;
		}
	}
}
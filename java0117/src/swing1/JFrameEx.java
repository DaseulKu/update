package swing1;

import javax.swing.JFrame;

public class JFrameEx {

	public static void main(String[] args) {
		JFrame jf = new JFrame(); // 지역변수
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(300, 300);
		jf.setVisible(true);
	}

}

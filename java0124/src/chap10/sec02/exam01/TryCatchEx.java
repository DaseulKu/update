package chap10.sec02.exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TryCatchEx {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			System.out.println("클래스가 존재하지 않음");
			System.exit(0); // 여기서 예외 처리가 끝나지 않으면 계속 다음 코드를 실행
//			e1.printStackTrace();
		}finally {
			System.out.println("반드시 실행");
		}
		try {
			Connection conn = DriverManager.getConnection(null);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
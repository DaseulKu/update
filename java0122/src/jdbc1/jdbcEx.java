package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/company";
		String id = "root";
		String pass = "mysql";
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("mysql 드라이버 로딩!");
		Connection conn = DriverManager.getConnection(url, id, pass);
		System.out.println("mysql 접속 성공");
		Statement stmt = conn.createStatement(); // sql문 만들어서 Statement stmt에 저장
		ResultSet rs = stmt.executeQuery("select * from dept"); // Statement stmt에 저장된 sql문 읽고 결과는 ResultSet 객체에 반환
		while (rs.next()) { // rc에 있는거 한줄씩 순서대로 읽기
			int deptno = rs.getInt("deptno"); // 컬럼 읽기
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			System.out.printf("%d, %s, %s\n", deptno, dname, loc);
		}
		Statement stmt1 = conn.createStatement();
		ResultSet rs1 = stmt1.executeQuery("select * from emp");
		while (rs1.next()) {
			String ename = rs1.getString("ename");
			double sal = rs1.getDouble("sal");
			System.out.printf("%s, %f\n", ename, sal);
		}

		conn.close();
	}
}
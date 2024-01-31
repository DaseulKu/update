package jdbc4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Dept {
	int deptno;
	String dname;
	String loc;

	public Dept(int deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}

}

public class DMenu {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/firm";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "mysql";
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {

			boolean exit = false;

			while (!exit) {
				System.out.println("1. 데이터 보기");//R
				System.out.println("2. 데이터 삽입");//C
				System.out.println("3. 종료");
				System.out.print("선택하세요: ");

				String choice = scanner.nextLine();

				switch (choice) {
				case "1":
					viewData(connection);
					break;
				case "2":
					insertData(connection);
					break;
				case "3":
					exit = true;
					break;
				default:
					System.out.println("유효하지 않은 선택 다시 시도하세요.");
					break;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void viewData(Connection connection) {
		List<Dept> list = new ArrayList<>();
		Connection conn = null;
		Statement stmt = null;
		String sql = "select deptno, dname,loc from dept";
		try {
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				Dept dept = new Dept(deptno, dname, loc);
				list.add(dept);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		for (Dept dept : list) {
			System.out.println(dept.getDeptno() + " | " + dept.getDname() + " | " + dept.getLoc());
		}
	}

	private static void insertData(Connection connection) {

		Connection conn = null;
		Statement stmt = null;

		System.out.print("부서번호:");
		int deptno = Integer.parseInt(scanner.nextLine());
		System.out.print("부서이름:");
		String dname = scanner.nextLine();
		System.out.print("부서위치:");
		String loc = scanner.nextLine();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			stmt = conn.createStatement();
			String sql = "insert into dept (deptno,dname,loc) values (" + deptno + ",'" + dname + "','" + loc + "')";
			int result = stmt.executeUpdate(sql);
			if (result == 1) {
				System.out.println("입력성공");
			} else {
				System.out.println("입력실패");
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
package jdbc3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



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

public class JdbcArrayEx {
	public static void main(String[] args) {
		List<Dept> list = new ArrayList<>();
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";
		Statement stmt = null; // import java.sql 하는거 주의
		Connection conn = null;
		String sql = "select deptno, dname,loc from dept"; // db에 문자열로 제출
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, pass);
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql); //
			while (rs.next()) {
//				int deptno = rs.getInt(1); 매개값으로 select 문에 선언된 순서
				int deptno = rs.getInt("deptno"); // or column index
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
//				String str = deptno + ", " + dname + ", " + loc; // 단점:한 column 씩 자료 출력이어려움
//				System.out.println(deptno+", "+dname+", "+loc);
				Dept dept = new Dept(deptno, dname, loc);
//				list.add(str);
				list.add(dept);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println(list); // toString 생성해서 출력
//		for(Dept dept : list) { //list 에 있는 모든 자료 출력
//			System.out.println(dept);
//		}
		for (Dept dept : list) {  // 원하는 column 출력
			System.out.println(dept.getDeptno()+"\t"+dept.getDname()+"\t"+dept.getLoc());
		}
		
	}
}
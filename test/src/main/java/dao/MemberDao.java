package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.Member;

public class MemberDao {
	private static Connection conn;
	private static MemberDao dao = new MemberDao();

	private MemberDao() {
	}

	public static MemberDao getInstance() {
		MemberDao.getConnection();
		return dao;
	}

	private static void getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe?useUnicode=true&characterEncoding=UTF-8", "scott", "tiger");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public Member selectForLogin(String id, String email) {
		Member member = null;
		String sql = "select * from member where id=? and email=?";
		try (PreparedStatement pstmt = conn.prepareStatement(sql);) {
			pstmt.setString(1, id);
			pstmt.setString(2, email);
			try (ResultSet rs = pstmt.executeQuery();) {
				if (rs.next()) {
					int memberno = rs.getInt("memberno");
					String Id = rs.getString("id");
					String Email = rs.getString("email");
					String name = rs.getString("name");
					member = new Member(memberno, Id, Email, name);
				}
			}
		} catch (SQLException e) {
			System.out.println("데이터베이스 쿼리 중 오류 발생: " + e.getMessage());
			throw new RuntimeException("데이터베이스 연결을 설정하는 중 오류가 발생했습니다. 나중에 다시 시도하세요.", e);
		}
		return member;
	}

	public Member select(String id) {
		Member member = null;
		String sql = "select * from member where id=?";
		try (PreparedStatement pstmt = conn.prepareStatement(sql);) {
			pstmt.setString(1, id);
			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
					int memberno = rs.getInt("memberno");
					String Id = rs.getString("id");
					String email = rs.getString("email");
					String name = rs.getString("name");

					member = new Member(memberno, Id, email, name);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return member;
	}

	public int insert(Member member) {
		String sql = "insert into member (memberno, id, email, name) values(seq_member.nextval,?,?,?)";
		try (PreparedStatement pstmt = conn.prepareStatement(sql);) {
			 pstmt.setString(1, member.getId());
		     pstmt.setString(2, member.getEmail());
		     pstmt.setString(3, member.getName());
		        
		        pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int update(Member member) {
		String sql = "update member set email=?, name=? id=? where memberno=?";
		try (PreparedStatement pstmt = conn.prepareStatement(sql);) {
			pstmt.setString(1, member.getEmail());
			pstmt.setString(2, member.getName());
			pstmt.setString(3, member.getId());
			pstmt.setInt(4, member.getMemberno());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
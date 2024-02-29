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
	private MemberDao() {}

	public static MemberDao getInstance() {
		MemberDao.getConnection();
		return dao;
	}

	private static void getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public Member selectForLogin(String id, String email) {
		Member member = null;
		String sql = "select * from member where id=? and email=?";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, email);
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				member = new Member(rs.getString("id"), rs.getString("email"), rs.getString("name"));
			}
		} catch (SQLException e) {
			 // 예외 정보를 간단한 방법으로 콘솔에 출력
	        System.err.println("데이터베이스 연결을 설정하는 중 오류 발생:");
	        e.printStackTrace();

	        // 사용자에게 더 친화적인 에러 메시지를 전달하고 예외 다시 던지기
	        throw new RuntimeException("데이터베이스 연결을 설정하는 중 오류가 발생했습니다. 나중에 다시 시도하세요.", e);
		}
		return member;
	}
	
	public Member select(String id) {
		Member member = null;
		String sql = "select * from member where id=?";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				member = new Member(rs.getString("id"), rs.getString("email"), rs.getString("name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return member;
	}
	
	public int insert(Member member) {
		String sql = "insert into member (memberno, id, email, name) values(seq_member.nextval,?,?,?)";
		try (
			PreparedStatement pstmt = conn.prepareStatement(sql);
		){
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getEmail());
			pstmt.setString(3, member.getName());		
			
			return pstmt.executeUpdate();
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		return 0;		
	}
	
	public int update(Member member) {
		String sql = "update member set email=?, name=? where id=?";
		try (
			PreparedStatement pstmt = conn.prepareStatement(sql);
		){			
			pstmt.setString(1, member.getEmail());
			pstmt.setString(2, member.getName());		
			pstmt.setString(3, member.getId());
			return pstmt.executeUpdate();
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		return 0;		
	}
}
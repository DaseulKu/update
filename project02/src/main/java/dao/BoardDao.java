package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import dto.Board;

public class BoardDao {
	private static Connection conn;
	private static BoardDao dao = new BoardDao();
	private BoardDao() {}

	public static BoardDao getInstance() {
		BoardDao.getConnection();
		return dao;
	}

	private static void getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1", "root", "mysql");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Board> selectList() {
		ArrayList<Board> list = new ArrayList<Board>();
		String sql = "select * from board order by memberno desc";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				Board board = new Board(rs.getInt("memberno"), rs.getString("writer"), rs.getString("title"),
										rs.getString("content"), rs.getString("regtime"), rs.getInt("hits"));
				list.add(board);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public Board selectOne(int memberno, boolean inc) {
		Board board = null;
		String sql = "select * from board where memberno = ?";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, memberno);
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				board = new Board(rs.getInt("memberno"),rs.getString("writer"), rs.getString("title"),
								  rs.getString("content"), rs.getString("regtime"), rs.getInt("hits"));
			
			}
			if (inc) {
				pstmt.executeUpdate("update board set hits=hits+1 where memberno=" + memberno);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return board;
	}
	
	public int delete(int memberno) {
		try (
			PreparedStatement pstmt = conn.prepareStatement("delete from board where memberno="+memberno);			
			){
			return pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return 0;			
	}
	
	public int insert(Board board) {
		String sql = "insert into board (writer, title, content, regtime, hits) values(?,?,?,now(),0)";
//		String curTime = LocalDate.now() + " " + LocalTime.now().toString().substring(0, 8);
		try (
			PreparedStatement pstmt = conn.prepareStatement(sql);
		){
			pstmt.setString(1, board.getWriter());
			pstmt.setString(2, board.getTitle());
			pstmt.setString(3, board.getContent());
//			pstmt.setString(4, curTime);
			return pstmt.executeUpdate();
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		return 0;		
	}
	
	public int update(Board board) {
		String sql = "update board set writer=?, title=?, content=?, regtime=now() where memberno=?";
//		String curTime = LocalDate.now() + " " + LocalTime.now().toString().substring(0, 8);
		try (
			PreparedStatement pstmt = conn.prepareStatement(sql);
		){
			pstmt.setString(1, board.getWriter());
			pstmt.setString(2, board.getTitle());
			pstmt.setString(3, board.getContent());
//			pstmt.setString(4, curTime);
			pstmt.setInt(4, board.getMemberno());
			return pstmt.executeUpdate();
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		return 0;		
	}
}
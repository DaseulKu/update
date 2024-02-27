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
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Board> selectList() {
		ArrayList<Board> blist = new ArrayList<Board>();
		String sql = "select * from board";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				Board board = new Board(rs.getInt("num"), rs.getString("title"), rs.getString("content"), 
										rs.getString("regtime"), rs.getInt("hits"),rs.getInt("memberno"));
				blist.add(board);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return blist;
	}

	public Board selectOne(int num, boolean inc) {
		Board board = null;
		String sql = "select * from board where num = ?";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				board = new Board(rs.getInt("num"), rs.getString("title"), rs.getString("content"), 
								  rs.getString("regtime"), rs.getInt("hits"),rs.getInt("memberno"));
			
			}
			if (inc) {
				pstmt.executeUpdate("update board set hits=hits+1 where num=" + num);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return board;
	}
	
	public int delete(int num) {
		try (
			PreparedStatement pstmt = conn.prepareStatement("delete from board where num="+num);			
			){
			return pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return 0;			
	}
	
	public int insert(Board board) {
		String sql = "insert into board (num, title, content, regtime, hits, memberno) values(seq_board.nextval,?,?,sysdate,0,0)";
//		String curTime = LocalDate.now() + " " + LocalTime.now().toString().substring(0, 8);
		try (
			PreparedStatement pstmt = conn.prepareStatement(sql);
		){
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
//			pstmt.setString(3, curTime);
			return pstmt.executeUpdate();
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		return 0;		
	}
	
	public int update(Board board) {
		String sql = "update board set title=?, content=?, regtime=sysdate where num=?";
//		String curTime = LocalDate.now() + " " + LocalTime.now().toString().substring(0, 8);
		try (
			PreparedStatement pstmt = conn.prepareStatement(sql);
		){
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
//			pstmt.setString(3, curTime);
			pstmt.setInt(3, board.getNum());
			return pstmt.executeUpdate();
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		return 0;		
	}
}
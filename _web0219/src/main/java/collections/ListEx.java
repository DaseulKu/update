package collections;

import java.util.List;

import m_dao.BoardDao;
import m_dto.Board;

public class ListEx {

	public static void main(String[] args) {
		BoardDao dao = BoardDao.getInstance();
		List<Board> list = dao.selectList();
		list.stream().forEach(b->{
			System.out.println(b.getTitle()+"-"+b.getContent());
		});
		
		
//		for(Board board : list) {
//			System.out.println(board.getTitle()+"-"+board.getContent());
//		}

	}

}

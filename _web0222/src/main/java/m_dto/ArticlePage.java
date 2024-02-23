package m_dto;

import java.util.List;

public class ArticlePage {

	private int total;			// 전체 게시글의 개수
	private int currentPage;	// 현재 페이지
	private List<Board> content;// 내용
	private int totalPages;		// 전체 페이지의 개수
	private int startPage; 		// 화면 하단에 보여줄 페이지 이동 링크의 시작 번호
	private int endPage; 		// 끝 번호
								// size 한 페이지당 보여줄 목록의 개수
	public ArticlePage(int total, int currentPage, int size, List<Board> content) {
		this.total = total;
		this.currentPage = currentPage;
		this.content = content;
		if (total == 0) {
			this.totalPages = 0;
			this.startPage = 0;
			this.endPage = 0;
		} else {
			totalPages = total / size;
			if (total % size > 0) {
				totalPages++;
			}
			int modVal = currentPage % 5;
			startPage = currentPage / 5 * 5 + 1;
			if (modVal == 0)
				startPage -= 5;

			endPage = startPage + 4;
			if (endPage > totalPages)
				endPage = totalPages;
		}
	}
	public boolean hasNoArticles() {
		return total == 0;
	}
	public boolean hasArticles() {
		return total > 0;
	}
	public int getTotal() {
		return total;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public List<Board> getContent() {
		return content;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public int getStartPage() {
		return startPage;
	}
	public int getEndPage() {
		return endPage;
	}
}
package dto;

public class Board {
	private int num;
	private String title;
	private String content;
	private String regtime;
	private int hits;
	private int memberno;
	
	public Board() {}
	
	public Board(int num, String title, String content) {
		this(0,title,content,"",0,0);
	}
	public Board(int num, String title, String content, String regtime, int hits, int memberno) {
		this.num = num;
		this.title = title;
		this.content = content;
		this.regtime = regtime;
		this.hits = hits;
		this.memberno = memberno;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRegtime() {
		return regtime;
	}

	public void setRegtime(String regtime) {
		this.regtime = regtime;
	}

	public int getHits() {
		return hits;
	}

	public void setHits(int hits) {
		this.hits = hits;
	}
	public int getMemberno() {
		return memberno;
	}
	public void setMemberno(int Memberno) {
		this.memberno = Memberno;
	}
	@Override
	public String toString() {
		return "Board [num=" + num + ", title=" + title + ", content=" + content + ", regtime="
				+ regtime + ", hits=" + hits + ", memberno=" + memberno + "]";
	}
}
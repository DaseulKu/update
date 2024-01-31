package chap07.sec01.exam01;

public class Account {
	private String name;
	private int balance; // 은행잔고
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if(balance > 0) {
			this.balance = balance;
		}
		
	}
	
}

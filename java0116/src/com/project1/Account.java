package com.project1;

public class Account {
	String name;
	String ssn;
	String tel;
	String id;
	String pw;
	int balance;
	
	public Account(String name, String ssn, String tel, String id, String pw) {
		super();
		this.name = name;
		this.ssn = ssn;
		this.tel = tel;
		this.id = id;
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void deposit(int deposit){
        //입금
        if(deposit <= 0){
            System.out.println("금액을 정확히 입력하세요.");
            return;
        }
        balance += deposit;     
    }
 
    //출금
    public void withdraw(int withdraw){
        if(withdraw > balance){
            System.out.println("잔액이 부족합니다.");
            return;
        }
 
        if(withdraw <= 0){
            System.out.println("0원 및 마이너스단위는 출금하실 수 없습니다.");
            return;
        }
        balance -= withdraw;
    }
	@Override
	public String toString() {
		return "Account [name=" + name + ", ssn=" + ssn + ", tel=" + tel + ", id=" + id + ", pw=" + pw + ", balance="
				+ balance + "]";
	}

}

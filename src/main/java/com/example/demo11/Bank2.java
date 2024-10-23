package com.example.demo11;

public class Bank2 extends NameId {

	private String branchTitle;

	private int balance;

	public Bank2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bank2(String branchTitle, String id, String name, int balance) {
		super(id, name);
		this.branchTitle = branchTitle;
		this.balance = balance;
	}

	
	public String getBranchTitle() {
		return branchTitle;
	}

	public int getBalance() {
		return balance;
	}
	
	

}

package com.example.demo11;

public class Bank {
	//預設建構方法(使用source -> generate constructors from superClass),小括號內沒有參數
	//格式 : 方法的存取權限 "類別"名稱() {}
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//建構方法帶Set,在new實體時同時賦予參數值(可以減少code行數),等同於實作set
	//建立帶有參數的建構方法時,預設不帶參數的建溝方法就不能夠時用
	public Bank(String branch, String user, int balance) {
		super();
		this.branch = branch;
		this.user = user;
		this.balance = balance;
	}


	private String branch;// 分行名稱

	private String user;// 用戶名稱

	private int balance;// 初始值餘額
	
	//一般方法 
	//格式 : 存取權限 方法的回傳值資料型態 方法名稱(參數資料型態 參數資料名稱) { 方法的實作內容 }
	//      public  String      getBranch() {}
	public String getBranch() {// 取得分行名稱
		return branch;
	}

	public void setBranch(String branch) {// 設定分行名稱
		this.branch = branch;
	}

	public String getUser() {// 取得用戶名稱
		return user;
	}

	public void setUser(String user) {// 設定用戶名稱
		this.user = user;
	}

	public int getBalance() {// 取得餘額
		return balance;
	}

	/**
	 * 存款 = 餘額+存款金額 如果存款金額小於0則回覆"無效金額"後停止
	 * 
	 * @param amount 存款金額
	 */
	public void saving(int amount) {
		if (amount < 0) {
			System.out.println("無效金額");
		} else {
			balance += amount;
		}
		System.out.println("目前存款為 : " + balance);
	}

	/**
	 * 提款 = 餘額-提款金額 
	 * 如果提款金額小於0則回覆"無效金額"後停止 
	 * 如果提款金額大於存款則回覆"餘額不足"後停止
	 * 
	 * @param amount 提款金額
	 */
	public void withdraw(int amount) {
		if (amount < 0) {
			System.out.println("無效金額");
		} else if (amount > balance) {
			System.out.println("餘額不足");
		} else {
			balance -= amount;
		}
		//排除 金額為負
//		if(amount < 0) {
//			System.out.println("無效金額");
//			return;
//		}
//		//排除 餘額不足
//		if(amount > balance) {
//			System.out.println("餘額不足");
//			return;
//		}
//		balance -= amount;
		System.out.println("提款" + amount + "元台幣，目前存款剩餘 : " + balance);
	}
	public String test1(String str) {
		return str + "test complite";
	}
	
	public Bank test2(String ste) {
		return new Bank(); //回傳值為類別，用new建立一個新類別
	}
	//Static 介紹 
	public static void bankTest3() {
		System.out.println("全域(static)方法,可以不用新增(new),直接透過 類別名稱.靜態方法 呼叫");
	}
}

package com.example.demo11;

public class Bank {
	//�w�]�غc��k(�ϥ�source -> generate constructors from superClass),�p�A�����S���Ѽ�
	//�榡 : ��k���s���v�� "���O"�W��() {}
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//�غc��k�aSet,�bnew����ɦP�ɽᤩ�Ѽƭ�(�i�H���code���),���P���@set
	//�إ߱a���Ѽƪ��غc��k��,�w�]���a�Ѽƪ��ط���k�N������ɥ�
	public Bank(String branch, String user, int balance) {
		super();
		this.branch = branch;
		this.user = user;
		this.balance = balance;
	}


	private String branch;// ����W��

	private String user;// �Τ�W��

	private int balance;// ��l�Ⱦl�B
	
	//�@���k 
	//�榡 : �s���v�� ��k���^�ǭȸ�ƫ��A ��k�W��(�ѼƸ�ƫ��A �ѼƸ�ƦW��) { ��k����@���e }
	//      public  String      getBranch() {}
	public String getBranch() {// ���o����W��
		return branch;
	}

	public void setBranch(String branch) {// �]�w����W��
		this.branch = branch;
	}

	public String getUser() {// ���o�Τ�W��
		return user;
	}

	public void setUser(String user) {// �]�w�Τ�W��
		this.user = user;
	}

	public int getBalance() {// ���o�l�B
		return balance;
	}

	/**
	 * �s�� = �l�B+�s�ڪ��B �p�G�s�ڪ��B�p��0�h�^��"�L�Ī��B"�ᰱ��
	 * 
	 * @param amount �s�ڪ��B
	 */
	public void saving(int amount) {
		if (amount < 0) {
			System.out.println("�L�Ī��B");
		} else {
			balance += amount;
		}
		System.out.println("�ثe�s�ڬ� : " + balance);
	}

	/**
	 * ���� = �l�B-���ڪ��B 
	 * �p�G���ڪ��B�p��0�h�^��"�L�Ī��B"�ᰱ�� 
	 * �p�G���ڪ��B�j��s�ګh�^��"�l�B����"�ᰱ��
	 * 
	 * @param amount ���ڪ��B
	 */
	public void withdraw(int amount) {
		if (amount < 0) {
			System.out.println("�L�Ī��B");
		} else if (amount > balance) {
			System.out.println("�l�B����");
		} else {
			balance -= amount;
		}
		//�ư� ���B���t
//		if(amount < 0) {
//			System.out.println("�L�Ī��B");
//			return;
//		}
//		//�ư� �l�B����
//		if(amount > balance) {
//			System.out.println("�l�B����");
//			return;
//		}
//		balance -= amount;
		System.out.println("����" + amount + "���x���A�ثe�s�ڳѾl : " + balance);
	}
	public String test1(String str) {
		return str + "test complite";
	}
	
	public Bank test2(String ste) {
		return new Bank(); //�^�ǭȬ����O�A��new�إߤ@�ӷs���O
	}
	//Static ���� 
	public static void bankTest3() {
		System.out.println("����(static)��k,�i�H���ηs�W(new),�����z�L ���O�W��.�R�A��k �I�s");
	}
}

package com.example.demo11;

public class MyThreadApplication {

//	public static void main(String[] args) {
//		MyThread thread = new MyThread();
//		System.out.println("AAA");
//		thread.run(); // �@���k���I�s�L�X sum
//		thread.start(); // ������I�s�覡: start() ���G�|�ܦ� AAA -> BBB -> sum
//		System.out.println("BBB");
//	}

	// �~�� Thread ���O
//	public static void main(String[] args) {
//		HorseRacing horse1 = new HorseRacing("horse1");
//		HorseRacing horse2 = new HorseRacing("horse2");
//		// ����@���k
////		horse1.run();
////		horse2.run();
//		// ���� Thread
//		horse1.start();
//		horse2.start();
//	}

	// ��@ runnable ����
// 	public static void main(String[] args) {
//		HorseRacing2 horse1 = new HorseRacing2("horse1");
//		HorseRacing2 horse2 = new HorseRacing2("horse2");
//		// �n����@ Runnable ������ HorseRacing2 �i�H�z�L start() �I�s�������k
//		// �N�n�� h1�Bh2 ��b��������A�ҥH�n���إ߰����
//		Thread t1 = new Thread(horse1);
//		Thread t2 = new Thread(horse2);
//		// ���� Thread
//		t1.start();
//		t2.start();
//	}

	// �沼�{��: �|���v�ɦM�`�o��
//	public static void main(String[] args) {
//		// �����u��10�i���A�ҥH�u�� new �@�� SellTickets
//		SellTickets s = new SellTickets();
//		// �إ� 2 �� Thread ����A ����2�x�����b��10�i��
//		Thread t1 = new Thread(s, "t1");
//		Thread t2 = new Thread(s, "t2");
//		t1.start();
//		t2.start();
//	}

}

package com.example.demo11;

public class MyThreadApplication {

//	public static void main(String[] args) {
//		MyThread thread = new MyThread();
//		System.out.println("AAA");
//		thread.run(); // 一般方法的呼叫印出 sum
//		thread.start(); // 執行緒呼叫方式: start() 結果會變成 AAA -> BBB -> sum
//		System.out.println("BBB");
//	}

	// 繼承 Thread 類別
//	public static void main(String[] args) {
//		HorseRacing horse1 = new HorseRacing("horse1");
//		HorseRacing horse2 = new HorseRacing("horse2");
//		// 執行一般方法
////		horse1.run();
////		horse2.run();
//		// 執行 Thread
//		horse1.start();
//		horse2.start();
//	}

	// 實作 runnable 介面
// 	public static void main(String[] args) {
//		HorseRacing2 horse1 = new HorseRacing2("horse1");
//		HorseRacing2 horse2 = new HorseRacing2("horse2");
//		// 要讓實作 Runnable 介面的 HorseRacing2 可以透過 start() 呼叫執行緒方法
//		// 就要把 h1、h2 方在執行緒中，所以要先建立執行緒
//		Thread t1 = new Thread(horse1);
//		Thread t2 = new Thread(horse2);
//		// 執行 Thread
//		t1.start();
//		t2.start();
//	}

	// 賣票程式: 會有競賽危害發生
//	public static void main(String[] args) {
//		// 模擬只有10張票，所以只能 new 一個 SellTickets
//		SellTickets s = new SellTickets();
//		// 建立 2 個 Thread 實體， 模擬2台機器在賣10張票
//		Thread t1 = new Thread(s, "t1");
//		Thread t2 = new Thread(s, "t2");
//		t1.start();
//		t2.start();
//	}

}

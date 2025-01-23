package com.example.demo11;

public class SellTickets implements Runnable {

	private int tickets = 10;

	// synchronized(同步): 寫在方法上，一次只能有一個執行緒使用此方法(獨佔)，
	// 其他執行緒要等到前一個執行結束後才能執行此方法
//	@Override 
//	public synchronized void run() {
//		for (int i = 0; i < 10; i++) {
//			tickets --;
//			if (tickets > 0) {
//				try {
//					Thread.sleep(500);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//				System.out.printf("%s賣出一張票，票剩下 %d 張!! \n", //
//						Thread.currentThread().getName(), tickets);
//			}else {
//				System.out.println(Thread.currentThread().getName() + " 票已賣完");
//			}
//		}
//	}

	// 同步區塊 : 將需要獨佔資源的程式法區塊用 synchronized (this) 包起來
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			synchronized (this) {
				tickets--;
				if (tickets > 0) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.printf("%s賣出一張票，票剩下 %d 張!! \n", //
							Thread.currentThread().getName(), tickets);
				} else {
					System.out.println(Thread.currentThread().getName() + " 票已賣完");
				}
			}
		}
	}

}

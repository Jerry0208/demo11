package com.example.demo11;

public class SellTickets implements Runnable {

	private int tickets = 10;

	// synchronized(�P�B): �g�b��k�W�A�@���u�঳�@�Ӱ�����ϥΦ���k(�W��)�A
	// ��L������n����e�@�Ӱ��浲����~����榹��k
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
//				System.out.printf("%s��X�@�i���A���ѤU %d �i!! \n", //
//						Thread.currentThread().getName(), tickets);
//			}else {
//				System.out.println(Thread.currentThread().getName() + " ���w�槹");
//			}
//		}
//	}

	// �P�B�϶� : �N�ݭn�W���귽���{���k�϶��� synchronized (this) �]�_��
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
					System.out.printf("%s��X�@�i���A���ѤU %d �i!! \n", //
							Thread.currentThread().getName(), tickets);
				} else {
					System.out.println(Thread.currentThread().getName() + " ���w�槹");
				}
			}
		}
	}

}

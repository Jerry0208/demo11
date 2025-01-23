package com.example.demo11;

public class MyThread extends Thread {

	@Override
	public void run() {
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += i;
		}
		System.out.println("sum: " + sum);
	}

}

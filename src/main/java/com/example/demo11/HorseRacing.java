package com.example.demo11;

public class HorseRacing extends Thread {
	// 父類別 Thread 中已有定義 name 屬性 
//	private String name;

	public HorseRacing() {
		super();
	}

	public HorseRacing(String name) {
		super(name);
	}

	@Override
	public void run() {
		for(int i = 1; i <= 15; i++) {
//			System.out.println(name + "正在跑第" + i + "圈!!");
			try {
				sleep(2000); // 單位是毫秒，1秒 = 1000 毫秒
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.printf("%s 正在跑第 %d 圈!! \n", super.getName() , i); // super 關鍵字可以省略
		}
	}


}

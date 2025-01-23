package com.example.demo11;

public class HorseRacing2 implements Runnable {
	
	private String name;

	public HorseRacing2() {
		super();
	}

	public HorseRacing2(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 15; i++) {
//			System.out.println(name + "正在跑第" + i + "圈!!");
			try {
				Thread.sleep(2000); // 單位是毫秒，1秒 = 1000 毫秒
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.printf("%s 正在跑第 %d 圈!! \n", name, i); // super 關鍵字可以省略
		}
	}

}

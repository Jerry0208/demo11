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
//			System.out.println(name + "���b�]��" + i + "��!!");
			try {
				Thread.sleep(2000); // ���O�@��A1�� = 1000 �@��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.printf("%s ���b�]�� %d ��!! \n", name, i); // super ����r�i�H�ٲ�
		}
	}

}

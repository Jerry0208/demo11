package com.example.demo11;

public class HorseRacing extends Thread {
	// �����O Thread ���w���w�q name �ݩ� 
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
//			System.out.println(name + "���b�]��" + i + "��!!");
			try {
				sleep(2000); // ���O�@��A1�� = 1000 �@��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.printf("%s ���b�]�� %d ��!! \n", super.getName() , i); // super ����r�i�H�ٲ�
		}
	}


}

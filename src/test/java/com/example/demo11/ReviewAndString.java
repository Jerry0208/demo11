package com.example.demo11;

import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;

//�n���Ĥ@��
//@SpringBootTest
public class ReviewAndString {
//	@Test
//	public void review() {
//		// 8+1(�򥻸�ƫ��A + String)�i�H�b�����᭱�����
//		// ���
//		byte x = 1;
//		short y = 10;
//		int q = 1;
//		Integer w = new Integer(5);// class���w�]�Ȭ�null/NULL
//		System.out.println(w);
//		long n = 10000000000000L;
//		// �B�I��
//		float t = 5.5f;
//		double u = 5.5;
//		// ���L��
//		boolean s;
//		// �r��
//		char c;
//		// �r�ꬰClass (���O)
//		String str1 = "a";
//		String str2 = new String("a");
//		// java�j���O : ��ƫ��A����V�X�ϥ�
//	}

//	@Test
	public void stringTest() {
//		String str = "abc";
//		System.out.println(str.equals("abc"));// ==
//		System.out.println(str.equalsIgnoreCase("ABC"));// �����j�p�g
//		String str2 = new String("abc");
//		System.out.println(str.equals(str2));// flase ��̦s���O�����m���P,�ҥH��{���ӻ���̤��۵�

		// StringBuffer �r��w�İ� : �i�H�b�P�@�ӰO�����m����r���ק�A���|�C���ק�ɳ��|�s�W�@�ӰO�����m
		StringBuffer strBuf = new StringBuffer("new StringBuffer");
		strBuf.append("test").append("plus append");// �W�[�r�ꤺ�e
//		System.out.println(strBuf.toString());

		// ABCD����
//		System.out.println(strBuf.reverse().toString());
//		String str = "ABCD";
//		String[] stringArray = str.split("");// [A, B, C, D] ���ά����׬�4���r��}�C,���ޭȬ�:[0, 1, 2, 3]
//		String strReverse = "";// �Ŧr��
//		for (int i = stringArray.length - 1; i >= 0; i--) {
//			strReverse += stringArray[i];
//		}
//		System.out.println(strReverse);

		// if �� for �j��S���j�A��,�u�|����U�@�檺���e
//		int a = 5;
//		if(a >= 18) {
//			System.out.println("�~��: " + a);
//			System.out.println("�w���~");
//		}else 
//			System.out.println("�����~");
	}

}

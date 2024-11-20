package com.example.demo11;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class TryCatch {
	@Test
	public void test() {
//		List<String> list = null;
//		for (String str : list) {
//			System.out.println(str);
//		}

		String str = null;
		getLength(str);
//		getLength("A");
	}

	public void getLength(String str) {
		try {
			// �w���|�o�� Error ���{���X
			System.out.println(str.length());

		} catch (Exception e) {
			// Exception �O�Ҧ� Exception(�ҥ~�����~) ���������O
			// �N���~�z�L catch ������ΡA .getMessage() �L�X���~���e
			// �{���|�~�����A���|��������
			System.out.println(e.getMessage());
		}
		// ========================================================
		try {
			// �w���|�o�� Error ���{���X
			System.out.println(str.length());

		} catch (IndexOutOfBoundsException e) {
			// �|�����A�]�� IndexOutOfBoundsException �O ArithmeticException ���S�����O�A�ҥH�S��k��������~
			System.out.println(e.getMessage());
		} finally {
			// �̲פ@�w�|�Q����A���� try �B catch ���S���Q�����
			System.out.println("BBB");
		}
		// ==========================================================
		// �h�� catch ���d��
//		try {
//			// �w���|�o�� Error ���{���X
//			System.out.println(str.length());
//
//		} catch (ArithmeticException e) {
//			System.out.println(e.getMessage());
//		} catch (Exception e) {
//			// Exception �O�Ҧ� Exception(�ҥ~�����~) ���������O
//			// �N���~�z�L catch ������ΡA .getMessage() �L�X���~���e
//			// �{���|�~�����A���|��������
//			System.out.println(e.getMessage());
//		} finally {
//			// �̲פ@�w�|�Q����A���� try �B catch ���S���Q�����
//			System.out.println("AAA");
//		}

	}

	@Test
	public void test2() {
		// scan �ݩ� I/O ���A new �X�ӫ�|��ĳ�b���ϥή�(�{���X�̫�)�N������(close)�H�קK�귽�����O�A�Y�S�� close �A �{�����|�����A���h�N�O���O�귽�Ӥw�C
		// try-with-resources: �N new �X�Ӫ� I/O ���g�b try �᭱���p�A�������A
		// �{���X���} try-catch ���϶���|�۰ʰ��� close �N�귽�����A�p�A�������h�� I/O �� �� ; ���ΡC
		try (Scanner scan = new Scanner(System.in);) {
			String str = scan.next();
		} catch (Exception e) {

		}

	}
}

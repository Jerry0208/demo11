package com.example.demo11;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class Regular_Expression {
	public void test() {
//		���W��F��(Regular Expression) 
//		Bank.bankTest3();

//		���W��ܥܽd		
//		String str = "ABCDEA";
//		String newStr = str.replace("A", "Z");
//		String newStr1 = str.replaceAll("A", "Z");
//		System.out.println(newStr);
//		System.out.println(newStr1);
//		
//		String newStr2 = str.replaceAll("[A-C]", "Z");//[A-C]���W���
//		System.out.println(newStr2);

		// ������榡 : �Ʀr4��-�Ʀr3��-�Ʀr3��
		// \d��ܼƦr0~9�����N�@�ӼƦr (0|1|2|3|4|5||7|8|9)
		// \����Ÿ��L�k��W�s�b
		// \�bjava����ܸ���Ÿ�,�ΨӸ��榳�S��N�q���Ÿ� -> �����S��N�q���Ÿ��ܦ���ª��Ÿ�
//		System.out.println("\\");// �u�|�L�X�᭱���@��\,�]���e����\���᭱���Ÿ��ܦ��F��ª��Ÿ�
		System.out.println("��J�q�ܸ��X,�榡: xxxx-xxx-xxx");
		Scanner scanner = new Scanner(System.in);
		String strS = scanner.next();

		String str1 = "0912-345-678";
		String pattern = "\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d";
//		String pattern = "\\d{4}-\\d{3}-\\d{3}";// �Τj�A�� \\d{���Ʀ���}, ��F���e�P�W�@��ۦP
//		String pattern = "\\d{4}(-\\d{3}){2}";// �Τp�A���ذ_�Ӭ��@��(-\\d){���Ʀ���}, ��F���e�P�W�@��ۦP
//		boolean check = strS.matches(pattern);
//		if(check) {//���P�� check == true
//			System.out.println(strS + "�ŦX������X�榡!");
//		}else {
//			System.out.println(strS + "���ŦX������X�榡!");
//		}
		// ----------------------------------------------------------------
		// �W����strS.matches(pattern) �����G���ܼ� check ���^��
		// ���b���򪺵{���X���A�ܼ� check �u�ϥΤ@��
		// �ҥH�i�H�ϥΰΦW(���ݭn���ܼƦW�٨ӱ��p�⪺���G)���覡�ӧ�g
		if (strS.matches(pattern)) {// ���P�� strS.matches(pattern) == true
			System.out.println(strS + "�ŦX������X�榡!");
		} else {
			System.out.println(strS + "���ŦX������X�榡!");
		}

	}

	public void test2() {
		// ���ܮ榡 1: �Ʀr2�X-�Ʀr7�X
		// ���ܮ榡 2: (�Ʀr2�X)-�Ʀr7�X
		String pattern1 = "\\d{2}-\\d{7}";
		String pattern2 = "\\(\\d{2}\\)-\\d{7}";
		Scanner scanr = new Scanner(System.in);
		System.out.println("�п�J����,�榡 : �Ʀr2�X-�Ʀr7�X �άO (�Ʀr2�X)-�Ʀr7�X");
		String homeCall = scanr.next();
//		if(homeCall.matches(pattern1) || homeCall.matches(pattern2)) {
//			System.out.println(homeCall + "�ŦX���ܸ��X�榡");
//		}else {
//			System.out.println(homeCall + "���ŦX���ܮ榡!");
//		}
//		===================================================================
		// �X�� pattern1 �M pattern2
//		String pattern3 = "\\d{2}-\\d{7}|\\(\\d{2}\\)-\\d{7}";// |�������঳�Ů�,�|�Q�P�w�n���Ů�
		String pattern4 = "(\\d{2}|\\(\\d{2}\\))-\\d{7}";// �Τp�A����}�Y2�X, �������S�A���Φ��A�����i�H
		if (homeCall.matches(pattern4)) {
			System.out.println(homeCall + "�ŦX���ܸ��X�榡");
		} else {
			System.out.println(homeCall + "���ŦX���ܮ榡!");
		}
	}
//	public void test3() {
//		//���ܮ榡 �Ʀr2�X-�Ʀr7�X��8�X
//		String pattern1 = "\\d{2}-(\\d{7}|\\d{8})";
//		String pattern2 = "\\d{2}-\\d{7,8}";// \\d{7,8}���\\d�ܤ֥X�{7��,�ܦh�X�{8��
//		
//	}

//	@Test
	public void quiz1() {
		// �ϸ�2�X
		// �q�ܸ��X7~8�X
		// �ϽX�򸹽X����ت�{�覡 : 1. �ϸ����p�A���ᶡ�����X ��: (02)12345678
		// 2. �ϸ��S�p�A��,�ϸ��򸹽X��-�s���_�� ��: 06-1234567
		String pattern = "(\\(\\d{2}\\)|\\d{2}-)\\d{7,8}";
		String num1 = "(02)12345678";
		String num2 = "06-1234567";
		String num3 = "0912-123-456";
		if (num1.matches(pattern)) {
			System.out.println(num1 + "�ŦX���ܸ��X�榡");
		} else {
			System.out.println(num1 + "���ŦX���ܮ榡!");
		}
	}

	public void quiz2() {
		// �ϸ�2~4�X
		// �q�ܸ��X7~8�X
		// �ϽX�򸹽X����ت�{�覡 : 1. �ϸ��S�p�A��,�ϸ��򸹽X��-�s���_�� ��: 06-1234567
		String pattern = "0\\d{1,3}-\\d{7,8}";
		String num1 = "02-12345678";
		String num2 = "006-1234567";
		String num3 = "0912-123-456";
		String num4 = "123-1234567";
		if (num4.matches(pattern)) {
			System.out.println("�ŦX���ܸ��X�榡");
		} else {
			System.out.println("���ŦX���ܮ榡!");
		}
	}

	public void regex() {
//		char a = 65;
//		System.out.println(a);
		String pattern1 = "[A-z]"; // ASCII code���j�g�^��r����p�g�^��r���������@�ǯS��Ÿ�
		System.out.println("_".matches(pattern1));
		String pattern2 = "[A-CSW-Z]"; // �ŦX�r���� : A B C S W X Y Z �@8�Ӧr��
		System.out.println("Y".matches(pattern2));
		// [^]�j�M�d��H�~�����e
		// ^�}�Y $���� �� ^[A-Za-z]b$ �^��r���}�Y �p�gb����
		// .�U�βŸ�
	}

	public void quiz3() {
//		�����q�ܸ��X���
//		�ϥνd��Ÿ� []
//		�ϽX 0 �}�Y�A�`�@�|�� 2~4 �X, �ѤU3�X���o��0
//		�q�ܸ��X 7~8 �X
//		�ϽX�M���X�����H �V �s���A�Ҧp 02-12345678
		String pattern = "0[1-9]{1,3}-\\d{7,8}";
		String number = "025-12345678";
		String number2 = "0123-1234567";
		String number3 = "0912-123-456";
		System.out.println(number.matches(pattern));
		System.out.println(number2.matches(pattern));
		System.out.println(number3.matches(pattern));
	}

	@Test
	public void quiz4() {
//		�����Ҧr���ˬd(Scanner ��J)
//		10�X
//		�Ĥ@�Ӧr���^��r��(�j�p�g�ҥi)
//		�^��r���᭱���۪��Ĥ@�ӼƦr�u�|�O 1 �� 2
//		�ХΥ��W��F������
//
//		������A�ЦA�g�ӱư�6�����j�p�g�^��r��(A�BB�BD�BE�BF�BH)
//		����1�A���`����
//		����2�A���եίS��r�� \\w
		Scanner scanner = new Scanner(System.in);
		System.out.print("�п�J������ : ");
		String id = scanner.next();
		String pattern1 = "[[A-Za-z]&&[^ABDEFHabdefh]][12]\\d{8}";
		String pattern2 = "[\\w&&[^ABDEFHabdefh0-9_]][1-2]\\d{8}";// \\w ==> [A-Za-z0-9_]
		System.out.println(id.matches(pattern1));
//		if(id.matches(pattern)) {
//			System.out.println("��J���\");
//		}else {
//			System.out.println("��J���~");
//		}

	}

	@Test
	public void text3() {
		String str = "ABSIjwcnwodsenfpqa�A �n_@*";

		System.out.printf(this.countCharacter(str));

	}


	// �p��@���r���Ҧ��r�����X�{����
	public String countCharacter(String str) {
		// �����ҥH�^���ର�j�g�^��r��
		str = str.toUpperCase();
		// �N�r�ꤤ�Ҧ���r���Φ���@�r����J List �}�C��
		String[] listStr = str.split("");
		// �إ�LinkedHaskMap
		Map<String, Integer> map = new LinkedHashMap<>();

		// �z�L�j��v�@���A�p�G Map �w�g���o�@�r���A�h Value + 1
		// �S���h�s�W�� Map�AValue �� 1
		for (int i = 0; i <= listStr.length - 1; i++) {
			if (map.containsKey(listStr[i])) {
				map.put(listStr[i], map.get(listStr[i]) + 1);
			} else {
				map.put(listStr[i], 1);
			}
		}

		// �إߤ@�ӪŦr��
		String reqStr = "";
		// �z�L Entry �N��r : �ƶq �x�s�b reqStr ��
		for (Entry<String, Integer> item : map.entrySet()) {
			reqStr += item.getKey() + ":" + item.getValue() + ", ";
		}
		
		// �^��resStr
		return reqStr;

	}
}

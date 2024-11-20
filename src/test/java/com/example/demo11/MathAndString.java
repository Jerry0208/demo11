package com.example.demo11;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

//Math and String
public class MathAndString {
	@Test
	public void mathTest() {
		int x1 = Math.max(5, 3);// Math.max(�����1,�����2),��̤j��
		System.out.println(x1);
		int x2 = Math.max(Math.max(4, 3), x1);// ��2�ӭȥH�W
		System.out.println(x2);
		int x3 = Math.min(10, 5);// ��̤p��
		System.out.println(x3);
		int x4 = Math.abs(-5);// �����
		System.out.println(x4);
		int x5 = Math.round(4.5f);// �|�ˤ��J,round()double�^��long,float�^��int
		System.out.println(x5);
		int x6 = (int) Math.rint(5.4);// �h��
		System.out.println(x6);
		int x7 = (int) Math.rint(5.5);// ��̪񪺰���
		System.out.println(x7);
		double x8 = Math.ceil(5.5);// �L����i��
		System.out.println(x8);
		double x9 = Math.floor(5.5);// �L����h��
		System.out.println(x9);
		int x10 = (int) Math.sqrt(4);// �}�����
		System.out.println(x10);
		int x11 = (int) Math.cbrt(27);// �}�ߤ��
		System.out.println(x11);
		int x12 = (int) Math.pow(2, 3);// 2��3����
		System.out.println(x12);

	}

//	@Test
	public void stringTest() {
//		//����
//		String x1 = "12345";
//		int a = x1.length();
//		System.out.println(a);
//		
//		//�P�_���e
//		String x2 = "";//�Ŧr��
//		String x3 = " ";//�ťզr��
//		boolean y1 = x2.isEmpty();
//		boolean y2 = x3.isBlank(); //�ťիؤ]�Q��ť�
//		System.out.println(y1);
//		System.out.println(y2);
//		boolean y3 = StringUtils.hasLength(x2);//�P�_ null + isEmpty
//		boolean y4 = StringUtils.hasLength(x3);
//		System.out.println(y3);
//		System.out.println(y4);
//		boolean y5 = StringUtils.hasText(x2);//�P�_ null + isBlanck
//		boolean y6 = StringUtils.hasText(x3);
//		System.out.println(y5);
//		System.out.println(y6);

		// �j�M
		String s1 = "���@�x�����b��";
//		System.out.println(s1.contains("�@"));//�P�_�r�ꤤ�O�_�s�b�j�M���e
//		System.out.println(s1.charAt(3));//return �b���ަ�m�W���r��
//		System.out.println(s1.indexOf("��"));//�q index 0 �}�l�j�M return �j�M���e�Ĥ@���X�{����m�]index �ȡ^
//		System.out.println(s1.lastIndexOf("��"));//�P�e�z�\��ۦP�A�u�O�q�k��}�l��_
//		System.out.println(s1.indexOf("��", 4));//indexOf("�j�M���e", �_�l��m)�G�q�_�l��m�}�l�j�M
//		System.out.println(s1.lastIndexOf("��", 5));//lastIndexOf("�j�M���e", �_�l��m)�G�q�_�l��m�}�l�j�M
//		��䤣��j�M���e�ɡAindex �ȷ| return -1

		// ����
//		System.out.println(s1.substring(3));//return �_�l��m�H�᪺�����r��
//		System.out.println(s1.substring(3,5));//return �_�l��m�H��㵲����m���e�������r��
//		String s2 = " ���̭�������";
//		System.out.println(s2.trim());//�h���Y�M����space�A���L�k�h�������� space
//		System.out.println(s2.replace("��", "�S"));//replace(�Q�����e, �������e) �i�H�Φ���k�A��Ҧ� space �h��
//		System.out.println(s1.concat(s2));//return ��r��ϳs�����e

		// ����ഫ
//		String[] s3 = s1.split("��");//�|�N�Ȥ��α��A�Ϥ��Φ��_�����X�Ӧr��
//		System.out.println(Arrays.toString(s3));
//		String[] s4 = s1.split("");//�� empty String �h���ΡA�|�ܦ��@�ӭӦr
//		System.out.println(Arrays.toString(s4));
//		System.out.println(String.join("+", s4));//String.join(�s�����e, �r��}�C�W��)�G�N�r��}�C�����e�H��J���s�����e�����[�_�ӡA���|�����j
//		System.out.println(s1.toCharArray());//char ���A���}�C�i�H�������ܼƦW�٦L�X��Ӥ��e null ���a��h�|�L�X error block�A�Ө�L���A���u�O�L�X�O�����m
//		char[] c1 = new char[2];
//		s1.getChars(0,2,c1,0);//getChars(�_�I, ���I, �r���}�C�W��, �}�C�_�I)
//		System.out.println(c1);
//		System.out.println(String.valueOf(true));//�N�D�r�ꪺ�򥻸�ƫ��A���e�ন�r��
//		System.out.println(Integer.valueOf("12"));//�N�Ʀr�q String �ন Integer
//		System.out.println(Integer.parseInt("34"));//�N�Ʀr�q String �ন int

		// ������e��
		String st1 = "a";
		String st2 = st1;
		String st3 = new String(st1);
		String st4 = st3;
		String st5 = "A";
		String st6 = new String(st5);
		System.out.println(st1 == st2);
		System.out.println(st1 == st3);
		System.out.println(st3 == st4);
		System.out.println(st1.equals(st2));// equals(�r��)�G����r�ꪺ���e�ȬO�_�۵�
		System.out.println(st1.equals(st3));
		System.out.println(st1.equals(st5));
		System.out.println(st1.equalsIgnoreCase(st5));// equalsIgnoreCase(�r��)�G�N��Ӧr�곣�ഫ���j�g�i����
		System.out.println(st1.equalsIgnoreCase(st6));

	}

	@Test
	void test() {
		this.Stringquiz1("DDDCCCAAABBB");
//		this.Stringquiz2("DDDCCCAAABBB");
	}

	void Stringquiz1(String quiz) {
		char[] prepare;
		prepare = quiz.toCharArray();// ��String���C�Ӧr�����Φ�char���J�}�C��
		int countS[] = new int[4];// �s�@�@�Ӱ}�C�s��
		for (char check : prepare) {
//			if (check == 'A') {
//				countS[0]++;
//			}
//			if (check == 'B') {
//				countS[1]++;
//			}
//			if (check == 'C') {
//				countS[2]++;
//			}
//			if (check == 'D') {
//				countS[3]++;
//			}

			switch (check) {
			case 'A':
				countS[0]++;
				break;
			case 'B':
				countS[1]++;
				break;
			case 'C':
				countS[2]++;
				break;
			case 'D':
				countS[3]++;
				break;
			}

		}
		System.out.printf("�� %d��A %d��B %d��C %d��D", countS[0], countS[1], countS[2], countS[3]);
	}

	void Stringquiz2(String quiz) {
		int size = quiz.length();
		int[] count = { -1, -1, -1, -1 };
		int[] index = { 0, 0, 0, 0 };
		int[] quitCheck = { 0, 0, 0, 0 };
		int i = 0;
		int j = 0;
		while ((count[0] + count[1] + count[2] + count[3]) != size) {
			while (quitCheck[j] != -1) {
				quitCheck[j] = quiz.indexOf("A", index[i]);
				index[i] = quitCheck[j] + 1;
				count[i]++;
			}
			i++;
			j++;
			while (quitCheck[j] != -1) {
				quitCheck[j] = quiz.indexOf("B", index[i]);
				index[i] = quitCheck[j] + 1;
				count[i]++;
			}
			i++;
			j++;
			while (quitCheck[j] != -1) {
				quitCheck[j] = quiz.indexOf("C", index[i]);
				index[i] = quitCheck[j] + 1;
				count[i]++;
			}
			i++;
			j++;
			while (quitCheck[j] != -1) {
				quitCheck[j] = quiz.indexOf("D", index[i]);
				index[i] = quitCheck[j] + 1;
				count[i]++;
			}
		}
		System.out.printf("�� %dA %dB %dC %sD", count[0], count[1], count[2], count[3]);
	}

}

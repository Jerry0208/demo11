package com.example.demo11;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class Loop_If_Switch {
	@Test
	public void test() {
//		 System.out.println(loop(5)); //for�j��,�p��1��Y�ƪ��[�`
		// this.loop2(); //��hfor�j��,99���k��
		// System.out.println(this.loop3(100)); //while�j��,�p��1��Y�ƪ��[�`
		// this.loop4(); //��hwhile�j��,99���k��
		// System.out.println(this.loop5(100,1));; //�ϥ�do{}while()�p��A���Y�ƨ�Y�ƪ��[�`
		// System.out.println(this.grade(100)); //�ϥ�switch,�i�榨�Z���ŭp��
		// this.loop6(35, 138); //���ߦPŢ
		// System.out.println("������ : " + this.ticket(80));//�u�f�����p��t��
		// this.guessnumber();//�q1~99�����@�ӼƦr
	}

	/**
	 * �p��1��פ�Ȫ��`�M
	 * 
	 * @param end �פ��
	 * @return 1~�פ�Ȫ��`�M
	 */
	public int loop(int end) {
		int sum = 0;
		for (int i = 1; i <= end; i++) {
			sum += i;
		}
		return sum;
	}

	/**
	 * �Ψ��for�j�鰵�X�C�X99���k��
	 */
	public void loop2() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("  %d * %d = %2d", i, j, i * j);
			}
			System.out.println("");
		}
	}

	public int loop3(int end) {
		int i = 1;
		int sum = 0;
		while (i <= end) {
			sum += i;
			i++;
		}
		return sum;
	}

	public void loop4() {
		int i = 1;
		while (i <= 9) {
			int j = 1; // �C���p��e�A�Nj��l��
			while (j <= 9) {
				System.out.printf("%d * %d = %2d  ", i, j, i * j);
				j++;
			}
			System.out.println("");
			i++;
		}
	}

	/**
	 * �[�`�qstart��end���Ҧ���ƨæ^��
	 * 
	 * @param start ��l��
	 * @param end   �פ��
	 * @return �[�`��sum
	 */
	public int loop5(int start, int end) {
		int sum = 0;
		int i = start < end ? start : end; // �p�G��l�Ȥ�׵��Ȥp,�h�Hstart�}�l�A�_�h�qend�}�l
		int e = start > end ? start : end;// �p�G��l�Ȥ�׵��Ȥj,�h�Hstart���j��ѼƱ���A�_�h��end����������
		do {
			sum += i;
			i++;
		} while (i <= e);
		return sum;
	}

	public String grade(int score) {
		switch (score / 10) {
		case 10:
		case 9:
			return ("A");
		case 8:
			return ("B");
		case 7:
			return ("C");
		case 6:
			return ("D");
		default:
			return ("E");
		}
	}

	/**
	 * ���ߦPŢ���D�A�w�]����0���A�H�j��覡�@���@���[�W�h�A�p�����(2���})�M�ߤl(4���})�}���ƥزŦX����ɫh�^�Ǧ��X������ߤl
	 * 
	 * @param head �`�@���X�����ߦb�@�_
	 * @param leg  �`�@���X���}
	 */
	public void loop6(int head, int leg) {
		int chicken = 0;// �w�]����0��
		int rabbit;

		// �]���}���Ƽ�,�ҥH��}����Q2�㰣��,�h���D�L��
		if (leg % 2 == 1) {
			System.out.println("���D�L��");
			return;// ������k
		}

		while (chicken <= head) {// �������ƶq���`�Ƥ֮�
			rabbit = head - chicken;// ���]�ߤl���O�ƶq�� = �`�� - �����ƶq
			if (chicken != head) {// �������ƶq�������`��
				if (2 * chicken + 4 * rabbit == leg) { // �p�G�������߫h
					System.out.printf("����%2d��, �ߦ�%2d��\n", chicken, rabbit);// �^�����ߦPŢ���D
					break;
				}
			} else
				System.out.println("�p�⵲��,�L���׫h�L��");
			chicken++;
		}
	}

	/**
	 * �����p��t�ΡA�u�f���:6���H�U��80���H�W��2��F7~12����60~79����5��
	 * 
	 * @param age ��J�~��
	 * @return �H��J���~�֦^�Ǭ۹���������
	 */
	public int ticket(int age) {
		int price = 100;
		if (age <= 6 || age >= 80) {
			price = (int)(price * 0.2);
		} else if (age <= 12 || age >= 60) {
			price = (int)(price * 0.5);
		}
		return price;
	}
	
}

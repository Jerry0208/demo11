package com.example.demo11;

import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class GuessNumber {
	@Test
	public void guessnumber() {
		Scanner scanner = new Scanner(System.in);
		int min = 1, max = 99; // ��l�ó]�w�̤p�ȸ�̤j��
		int taket;
		taket = (int) (Math.random() * (max-1)) + (min-1); // ����1~99�ü�, Math.random()��(�϶��j�p) + �U���� �G�]�N�O�q�U���ȩ��W�@���X�Ӽ�

		System.out.print("�q�@��" + min + "~" + max + "����� : ");
		loop_1: while (true) {
			int gus = scanner.nextInt(); // ��J�@�Ӽ�
			if (gus == taket) { // �p�G�Ʀr�q��
				System.out.println("���ߧA����F!!"); // �h�����j��
				break loop_1;
			}
			loop_2: while (gus != taket) { // �p�G�q��
				if (gus >= min && gus <= max) { // �B�Ʀr�b�̤j�ȻP�̤p�Ȥ���
					if (gus > taket) { // �p�G:�q���Ʀr��ؼФj
						max = gus; // �h�̤j�ȧאּ��q���Ʀr
					} else { // �p�G:�q���Ʀr��ؼФp
						min = gus; // �h�̤p�ȧאּ��q���Ʀr
					}
					System.out.printf("�q��,�Ʀr�b%d~%d����\n", min, max); // �C�L�X�i�H�q���Ʀr�d��
					break loop_2; // �������j��,�^��~�j��,�q�U�@�ӼƦr
				} else { // �p�G�Ʀr���b�̤j�ȻP�̤p�Ȥ���
					System.out.printf("�п�J%d~%d�d�򤺪����\n", min, max); // �h���e�̤j�ȻP�̤p�ȦC�L�X��
					break loop_2; // �������j��,�^��~�j��,�q�U�@�ӼƦr
				}
			}
		}
	}

}

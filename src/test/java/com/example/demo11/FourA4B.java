package com.example.demo11;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class FourA4B {
	// �XA�XB
		@Test
		void guessnumber() {
			// �H������4��0~9���Ʀr �f�f�f�f
//			int[] num = new int[4];
//			num[0] = (int) (Math.random() * 9);
//			num[1] = (int) (Math.random() * 9);
//			num[2] = (int) (Math.random() * 9);
//			num[3] = (int) (Math.random() * 9);
			
			//�ͦ�0~9��4�Ӥ����ƪ��Ʀr
			Random ran = new Random();//Random �H���Ʋ��;�
			HashSet<Integer> hs = new HashSet<>();//HashSet ���۰ʧR�����ƪ��Ȫ��\��
			while (true) {
				int num = ran.nextInt(10);//�ͦ�1��0~9���Ʀr
				hs.add(num);//�N�Ʀr�[�JHashSet
				if (hs.size() == 4)//�p�G���4�ӼƦr�N���}�j��
					break;
			}
			int[] num = new int[hs.size()];//�s�W�@��int�}�C
			int a = 0;//�j���l��
			for (Integer number : hs) {//�ϥ�foreach�v�@���X�bHashSet�����Ʀr
				num[a++] = number;//��Jint�}�C��
			}
//			�L�X�}�C����4�ӼƦr
			for (int j : num) {
				System.out.printf("%d ",j);
			}

			Scanner scanner = new Scanner(System.in);
			loop1 : while (true) {
				System.out.println("�q4��0~9���Ʀr");
				int[] gus = new int[4]; //�s�W�Ʀr�}�C
				
				for(int i = 0; i < gus.length; i++) {
					gus[i] = scanner.nextInt();//���Ҧ��}�C��J�@�ӼƦr
					if (gus[i] < 0 || gus[i] > 9) {//�p�G�j��0 ~ 9�h��^�j��
						System.out.println("��J�Ʀr�d����~");//����
						continue loop1;//��^�j��,���s�}�l
				}
					
				}
				// �p�G��m�P�Ʀr�q��,�h�o1A�A�p�G�Ʀr�q��,�h�o1B
				int A = 0, B = 0;
				for (int i = 0; i <= 3; i++) {
					for (int j = 0; j <= 3; j++) {
						if (i == j && num[i] == gus[j]) {//�p�G��m�ۦP,�B�Ʀr�ۦP
							A++;//�o1A
						}
						if (num[i] == gus[j]) {//�p�G�Ʀr�ۦP
							B++;//�o1B
							break;//����Q�q�ۦP�Ʀr
						}
					}
				}

				System.out.printf("A : B\n%d : %d\n", A, B);

				if (A + B == 8) {
					System.out.println("���߯}��");
					break;
				}

			}

		}
}

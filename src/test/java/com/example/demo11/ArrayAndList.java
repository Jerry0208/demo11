package com.example.demo11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ArrayAndList {
	public void array() {
		// 4�ؤ��P���}�C�ŧi�覡
//		int[] a = new int[2];
//		int b[] = new int[3];
//		int[] c;
//		c = new int[1];
//		int[] d = {1,2,3,4,5,6,7,8,9,10};
//		a[0] = 1;
//		a[1] = 2;
//		b[0] = 3;
//		b[1] = 2;
//		b[2] = 1;
//		c[0] = 4;
// 		System.out.println(a.length);//�C�L�X�}�C����
//		Arrays.toString(c);//�N�}�C�ഫ���r��
//		System.out.println(c);
	}

	 @Test
	public void test() {
		int[] score = { 50, 65, 75, 85, 90 };
		this.classQuiz(score);
	}

	public void classQuiz(int[] score) {
		// System.out.println(score.toString());
		System.out.println("�ұo���f���ơG" + Arrays.toString(score));
		Arrays.sort(score);// �Ѥp��j�Ƨ�
		double average = 0;
		for (int i = 1; i < (score.length - 1); i++) {
			average += (double) score[i];
		}
		average = average / (score.length - 2);
		System.out.println("���Ĥ��ơG" + average);
	}

//	@Test
	public void list() {
		List<Integer> a = Arrays.asList(0, 1, 2);// �إ߲M��: List<��ƫ��A> �W�� = Array.asList(���1, ���2,......) �����שT�w�A�L�k�W�R
		List<Double> b = List.of(3.0, 4.0);// �إ߲M��: List<��ƫ��A> �W�� = List.of(���1, ���2,......) �����שT�w�A�L�k�W�R
		List<Integer> c = new ArrayList<>();// List<��ƫ��A> �W��= new ArrayList<>(); // �º�ŧi
		List<Double> d = new ArrayList<>(b);// List<��ƫ��A> �W��= new ArrayList<>(�M��W��); // �ŧi�P�ɵ��� ���̱`�ϥΡA���װʺA�W�R
		// System.out.println(d.size());//.size()��k : �^���M��j�p
//		c.add(8); //.add() : �W�[�x�s�@�Ӹ��
//		c.remove(1);//.remove() : ��֤@���x�s��ơA�A�����Ʀr��index��m
//		System.out.println(d.get(0));// .get() : ���o�M��Ӧ�m����Ƥ��e
//		System.out.println(d.indexOf(4));// .indexOf() : ���o�ȩҦb�����ަ�m
//		System.out.println(d.contains(5));// .contains() : booleam,�O�_�]�t
//		System.out.println(c);//�����C�X�C���Ҧ�����
//		for(int i : c) { //�M��
//			System.out.println(i);
//		}
//		d.forEach(item -> {// List�W��.forEach( �W�� �b�Y { �{�����e ���I:�S��k��ϰ��ܼ� } );
//			System.out.println(item);
//		});
//		for (int i = 0; i <= 3; i++) {
//			c.add(i);
//			System.out.println("��" + i + "�� : " + c);
//		}

	}

	@Test
	public void listuqiz() {
		List<Integer> randomNum = new ArrayList<>();// �إ�List����
		int check;
		while (randomNum.size() < 4) {// �p�G�S��4�ӼƦr
			check = (int) (Math.random() * 10);// �إߤ@��0~9���ü�
			if (!randomNum.contains(check)) {// �p�GList���S���ۦP�Ʀr
				randomNum.add(check);// �N��Ʀr�[�J
			}
		}
		// ��List���������HString���X
		String list = "";
		for (int i = 0; i < randomNum.size(); i++) {
			list += randomNum.get(i) + "";
		}
		;
		System.out.println(list);// �C�L�XList���e
	}
}

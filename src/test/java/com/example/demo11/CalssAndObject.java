package com.example.demo11;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class CalssAndObject {
	// ����ɦV�{���]�p( Object-oriented programming(OOP) ) :�ʸˡB�~�ӡB��H�B�h��
	@Test
	public void calssAndObject() {
		// class ���O : �O�ؼs�x�������A�ΨӴy�z�㦳�Y���ݩʩM��k ex: �ʪ�(�W�l�B�Y���B��ı)
		// Object ���� :���O�����(instance) ��: ��(�p�աB6���B�b�Y��)
		// �����ݩ�(Attributes)�P�欰(Method) �ҤH�� -> 1.�ݩ�:�W�l�B�~�֡B�ʧO
		// 2.�欰:�I�l�B�Y���B��ı
		// ����r new �s�W���(instance)
//			Dog myDog = new Dog();
//			//�]�w��Ҫ��ݩ�(�S��)
//			myDog.category = "���Ϥ�";
//			myDog.color = "�զ�";
//			myDog.name = "�p��";
//			myDog.age = 3;
//			System.out.println("�����~�جO" + myDog.category);
//			System.out.println("��⬰" + myDog.color);
//			System.out.println("�W�l�s" + myDog.name + "," + myDog.age + "��");
//			//�ϥΤ�k(�欰)
//			myDog.run();
//			myDog.run("�p��");
//			myDog.eat("�D�p��");
	}

	@Test
	public void bankTTest() {
		Bank bank = new Bank();
//			System.out.println(bank);// �|�L�X�O�����m
//			Bank bank1 = new Bank();
//			System.out.println(bank1);// �|�L�X�t�@�ӰO�����m
//			System.out.println(bank == bank1);// ����O�����m�ۤ��ۦP
//			Bank bank2 = bank;
//			System.out.println(bank == bank2);// ����O�����m�ۤ��ۦP
//			bank.setUser("orange");// �]�wbank���Τ�W
//			System.out.println(bank2.getUser());// �L�Xbank2���Τ�W,�Pbank�Τ�W�ۦP(��ܨ�̦@�Τ@�ӰO����Ŷ�)
		bank.setBranch("�x�n����");
		bank.setUser("0001");
//			System.out.println(bank.getBranch());
//			int amount = bank.getBalance();
//			System.out.println(amount);
//			bank.saving(100);
//			bank.withdraw(50);
		Bank bank1 = new Bank("TTA", "001", 100);// (����W,�Τ�W,�l�B)
		System.out.println("����W : " + bank1.getBranch());
		System.out.println("�Τ�W : " + bank1.getUser());
		System.out.println("�l�B : " + bank1.getBalance());

	}

	
}

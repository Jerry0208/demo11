package com.example.demo11;

import org.junit.jupiter.api.Test;

public class InheritanceAndPolymorphism {
	// �~�� (Inheritance) ����ɦV�{���]�w�����O�O�i�H�Q"�~��"��
	// �ت� :
	// 1. ��֭��ƪ��{���X
	// 2. �����O (super class) �����ݩʸ��k�l���O (child class) �]��
	// 3. �l���O�٥i�H���ۤv����k���ݩ�
	// ����r : B extends A �B B �~�� A �B B <-- A
	@Test
	public void animalTest() {
		// ���� main/java �� Animal
		Animal ani = new Animal();
		ani.setName("Egg");
		ani.eat();
		ani.sleep();
	}

	@Test
	public void animalTest2() {
		// ���� main/java �� Animal
		Animal ani = new Animal("Egg", 1);
		ani.eat();
		ani.sleep();
	}

	@Test
	public void bridTest() {
		// ���� main/java �� Bird �BAnimal
		Bird bird = new Bird();
		bird.setName("Lily");
		bird.eat();
		bird.sleep();
		bird.flying();
	}

	@Test
	public void bridTest2() {
		// ���� main/java �� Bird �BAnimal
		Bird bird = new Bird("Lily", 3);
		bird.eat();
		bird.sleep();
		bird.flying();
		bird.info();
		// ���� �O�_�~�� ���O �^�� blooean
		System.out.println(bird instanceof Animal);
	}

	@Test
	public void family() {
		// ���� main/java �� Father �BSon �B Daughter
		Father father = new Father("Bob");
		father.walk();
		;

		System.out.println("============");

		Son son = new Son("Week");
		son.walk();
		son.playball();

		System.out.println("============");

		Daughter daughter = new Daughter("Anna");
		daughter.walk();
		daughter.shopping();
	}

	@Test
	public void quiz1() {
		// ���� main/java �� NameId �B Bank2 �B PersonaInfo
		System.out.println("Bank2 is kind of NameId");
		Bank2 bank = new Bank2("TTA����", "001", "���p�W", 0);
		System.out.println("����W : " + bank.getBranchTitle());
		System.out.println("�Τ�W : " + bank.getName());
		System.out.println("�Τ�ID : " + bank.getId());
		System.out.println("�Τ�l�B : " + bank.getBalance());

		System.out.println("================");

		System.out.println("PersonaInfo is kind of NameId");
		PersonaInfo personaInfo = new PersonaInfo("002", "�L�p��", 25, "���P");
		System.out.println("ID : " + personaInfo.getId());
		System.out.println("�m�W : " + personaInfo.getName());
		System.out.println("�~�� : " + personaInfo.getAge());
		System.out.println("�~���� : " + personaInfo.getCity());

	}

	@Test
	public void overrideTest() {
		// ���� main/java �� Bird �BAnimal
		Bird bird = new Bird("Lily", 3);
		bird.info();
		bird.eat();
		bird.sleep();
		bird.flying();
	}

	@Test
	public void PolymorphismTest() {
		// �h��(Polymorphism)
		// ���� main/java �� Bird �BAnimal

		// ���M���^�Ӫ���ƫ��A�O�����O�A���]�� new �X�Ӫ�����O�l���O�A�ҥH����W�N�O�l���O
		Animal bird = new Bird("Lily", 3) {// �ΦW���O
			public void haveBaby() {
				class Egg {// ��k�������O�B�������O
					class Baby {// �������O

					}
				}
			}

		};
		// eat() �M sleep() ���檺�|�O�l���O�����s�w�q����@���e
		bird.eat();
		bird.sleep();
		// �H�U2�Ӥ�k�L�k�Q�I�s�A�]���S���Q�w�q�b�����O����
//		bird.info();
//		bird.flying();
		// ��X�H�W�A��s�إߥX�Ӫ��l���O��Ҩ䱵������ƫ��A�O�����O��
		// 1.�u��I�s�w�q�b�����O������k
		// 2.��l���O�����s�w�q�����O����k�ɡA���檺�ܬO�l���O����@���e
	}

	@Test
	public void mutiClass() {
		Bird bird = new Bird("Lily", 3) {
			public void haveBaby() {// �ΦW���O
				class Egg {// ��k�������O�B�������O

				}
			}

		};
		bird.flying();

		// ���s�w�q Flying() ��k
		// 1. �b�إ߷s����Үɪ��������s����@���e�A�Y�[�W�j�A��
		// 2. �j�A���n�g�b�����e���A�B�����@�w�n������
		// 3. ���s�w�q����@���e�N�Ȧ��b�o������
		// 4. @Override �i���i�L�A����ĳ�[
		Bird bird2 = new Bird("Lily", 3) {
			@Override
			public void flying() {
				System.out.println(getName() + "is Flying a heigh");
			}

		};
		bird2.flying();
	}
}

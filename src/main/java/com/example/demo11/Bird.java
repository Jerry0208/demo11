package com.example.demo11;

public class Bird extends Animal {
	// ����r : B extends A �B B �~�� A �B B <-- A , �~�� Animal ���w�����ݩʩM��k
	// 1. �ݩ� name �H�Φs���p���ݩʪ� getter/setter ��k
	// 2. eat, sleep ��k
	// �H�W�ݩʥH�Τ�k�b Animal �����A���ݭn�A�g�@�M

	// �غc��k
	public Bird() {
		// 1. �b�I�s�l���O���غc��k���e�A�|���I�s�����O���ط���k�A���ެO�w�]�غc��k�٬O�a���Ѽƪ��غc��k
		// 2. �Y�Ϯ����I�s�����O�� super() ��k�A�{���٬O�|����������O���غc��k
		super();
		System.out.println("�o�O�l���O");
	}

	// bird �� name �M age �~�Ӧۤ����O Animal�A�ҥH�a�� name �M age ���غc��k�Υh�I�s�����O���غc��k
	public Bird(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	// �i�H�z�L����r super �ӨϥΩw�q�b�����O�� public ��k
	// �ݩ� name ���v���O private�A�u��bAnimal���O���ϥ�
	public void flying() {
//		System.out.println(super.getName() + " is flying");
		// �ثe Java �������i�H�N����r super �ٲ�
		System.out.println(getName() + " is flying");
	}

	public void info() {
		// �]���ݫH age �v���� protected , �ҥH�l���O�i�H�����s�����ݩ�
		System.out.println("My name is " + getName());
		System.out.println(age + " years old");
	}
	
	// Override :
	// 1. �l���O�P�����O�ۦP��k��,�i�H���s�w�q(���P����@���e)�����O����k�A
	// 2. @Override �N�O�ΨӼаO�l���O���s�w�q�����O����k �G �ثe�� Java ���� �A ���Хܥi�ٲ��A��ĳ�[
	// 2.1 @ �O Annotation�A���� : �|�b�{���X�����ѰT���A�o�ǰT���|�b�sĶ�ɩΰ���ɳQ�B�z
	// 3. �l���O���s�w�q����k :
	// 3.1 ���v�����i������O�p
	// 3.2 �^�Ǹ�ƫ��A�ۦP
	// 3.3 ��k�W�٩M�p�A�������ѼƼƶq�P�C�ӰѼƪ���ƫ��A���n�@��
	// 3.4 �ߤ@���P�N�O�j�A��������@�ऺ�e
	// 4. static �B final ����Q���s�w�q
	@Override
	public void eat() {
		System.out.println(getName() + " is eating a lot");
	}

	@Override
	public void sleep() {
		System.out.println(getName() + " is sleeping a lot");
	}

}

package com.example.demo11;

import java.time.*;

public class Dog {
	// �ŧi�ݩ�(�S��)
	String category;// �~��

	String color;// �C��

	String name;// �W�l

	int age;// �~��

	// �w�q��k(�欰)
	//��k���h��(overload),�t�η|�۰��ѧO���a�ѼƸ�S�a�Ѽƪ���k,�M��h�]�۹����Ѽƪ����e
	public void run(String name) {
		System.out.println(name + "���b�]");
	}

	public Dog(String category, String color, String name, int age) {
		super();
		this.category = category;
		this.color = color;
		this.name = name;
		this.age = age;
	}

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void run() {
		System.out.println(name + "���b�]");
	}

	public void eat(String name) {
		// �L�X : �Q���`��ܷR�Y�ܦ��D�`��
		// this����r,�������O�����e��
		System.out.println(this.name + "�ܷR�Y�ܦ�" + name);
	}
}

package com.example.demo11;

import org.junit.jupiter.api.Test;

public class Constructor_Encapsulation {
	@Test
	public int factorial(int i) {//���j
		if (i == 1) {
			return 1;
		} else {
			return (i * factorial(i - 1));
		}

//		��k�j��ܽd
//		System.out.println(factorial(2));
		
	}
	
	//����غc(Constructor)�P�ʸ�(Encapsulation)
	//�@���k 
	//�榡 : �s���v�� ��k���^�ǭȸ�ƫ��A ��k�W��(�ѼƸ�ƫ��A �ѼƸ�ƦW��) { ��k����@���e }
	//�ݤ�k��@���覡 �b���O�W�٤W��ctrl���inplementation
	
	//���O��k���غc�覡(�P���O�P�W�B���a�^�ǭȪ���k) 
	//�w�]�غc��k(�ϥ�source -> generate constructors from superClass),�p�A�����S���Ѽ�
	//�榡 : ��k���s���v�� "���O"�W��() {}
	//*�`�N* �p�G���إߤp�A���a���Ѽƪ��ط���k,�w�]���ط��覡�S�g�N������ϥ�
	//�n�ߺD : �p�G�إ߱a���Ѽƪ��ط���k��,�P�ɫإߤ��a�Ѽƪ��غc��k(����Ʈw�ɨS���w�]�ط���k�ɷ|�X��)
	
	//���O�������s������    Class  package   subClass(�~��) world
	//	public			o		o		  o		 	  	o
	//	protected		o		o		  o
	//	no modifier		o		o
	//	private			o
	//�ʸ� : �]�i�٬���T����
	
	//Static : �R�A�άO����(�S��k�A���Q�ק�),�u�������O ��:Math.random() ���O�W��.��k�W��()
	//final : �إ߫ᤣ��A���,�`�ϥΦb�`�� �� : Math.PI ���O�W��.�ܼƦW��
}


package com.example.demo11;

public class Temperature {
	/**
	 * �p�⤽�� �ؤ� = ���*9/5+32
	 * 
	 * @param c Ū���ؤ�ū�
	 * @return f ���ū�
	 */
	public double temperatureCtoF(double c) { // �ū��ഫ C to F
		double f = c * 9 / 5 + 32;
		return f; // �^��F��
	}

	/**
	 * �p�⤽�� �ؤ� = (���-32)*5/9
	 * 
	 * @param f Ū�����ū�
	 * @return c �ؤ�ū�
	 */
	public double temperatureFtoc(double f) { // �ū��ഫ F to C
		double c = (f - 32) * 5 / 9;
		return c; // �^��C��
	}
}

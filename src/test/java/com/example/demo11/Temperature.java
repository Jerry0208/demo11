package com.example.demo11;

public class Temperature {
	/**
	 * 璸衡そΑ 地ん = 尼ん*9/5+32
	 * 
	 * @param c 弄地ん放
	 * @return f 尼ん放
	 */
	public double temperatureCtoF(double c) { // 放锣传 C to F
		double f = c * 9 / 5 + 32;
		return f; // 肚F
	}

	/**
	 * 璸衡そΑ 地ん = (尼ん-32)*5/9
	 * 
	 * @param f 弄尼ん放
	 * @return c 地ん放
	 */
	public double temperatureFtoc(double f) { // 放锣传 F to C
		double c = (f - 32) * 5 / 9;
		return c; // 肚C
	}
}

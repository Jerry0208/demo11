package com.example.demo11;

import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class GuessNumber {
	@Test
	public void guessnumber() {
		Scanner scanner = new Scanner(System.in);
		int min = 1, max = 99; // 初始並設定最小值跟最大值
		int taket;
		taket = (int) (Math.random() * (max-1)) + (min-1); // 產生1~99亂數, Math.random()＊(區間大小) + 下限值 ：也就是從下限值往上共有幾個數

		System.out.print("猜一個" + min + "~" + max + "的整數 : ");
		loop_1: while (true) {
			int gus = scanner.nextInt(); // 輸入一個數
			if (gus == taket) { // 如果數字猜對
				System.out.println("恭喜你答對了!!"); // 則結束迴圈
				break loop_1;
			}
			loop_2: while (gus != taket) { // 如果猜錯
				if (gus >= min && gus <= max) { // 且數字在最大值與最小值之間
					if (gus > taket) { // 如果:猜的數字比目標大
						max = gus; // 則最大值改為剛猜的數字
					} else { // 如果:猜的數字比目標小
						min = gus; // 則最小值改為剛猜的數字
					}
					System.out.printf("猜錯,數字在%d~%d之間\n", min, max); // 列印出可以猜的數字範圍
					break loop_2; // 脫離內迴圈,回到外迴圈,猜下一個數字
				} else { // 如果數字不在最大值與最小值之間
					System.out.printf("請輸入%d~%d範圍內的整數\n", min, max); // 則把當前最大值與最小值列印出來
					break loop_2; // 脫離內迴圈,回到外迴圈,猜下一個數字
				}
			}
		}
	}

}

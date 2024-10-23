package com.example.demo11;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class Loop_If_Switch {
	@Test
	public void test() {
//		 System.out.println(loop(5)); //for迴圈,計算1到某數的加總
		// this.loop2(); //兩層for迴圈,99乘法表
		// System.out.println(this.loop3(100)); //while迴圈,計算1到某數的加總
		// this.loop4(); //兩層while迴圈,99乘法表
		// System.out.println(this.loop5(100,1));; //使用do{}while()計算，有某數到某數的加總
		// System.out.println(this.grade(100)); //使用switch,進行成績分級計算
		// this.loop6(35, 138); //雞兔同籠
		// System.out.println("票價為 : " + this.ticket(80));//優惠票價計算系統
		// this.guessnumber();//猜1~99內的一個數字
	}

	/**
	 * 計算1到終止值的總和
	 * 
	 * @param end 終止值
	 * @return 1~終止值的總和
	 */
	public int loop(int end) {
		int sum = 0;
		for (int i = 1; i <= end; i++) {
			sum += i;
		}
		return sum;
	}

	/**
	 * 用兩個for迴圈做出列出99乘法表
	 */
	public void loop2() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("  %d * %d = %2d", i, j, i * j);
			}
			System.out.println("");
		}
	}

	public int loop3(int end) {
		int i = 1;
		int sum = 0;
		while (i <= end) {
			sum += i;
			i++;
		}
		return sum;
	}

	public void loop4() {
		int i = 1;
		while (i <= 9) {
			int j = 1; // 每次計算前，將j初始化
			while (j <= 9) {
				System.out.printf("%d * %d = %2d  ", i, j, i * j);
				j++;
			}
			System.out.println("");
			i++;
		}
	}

	/**
	 * 加總從start到end的所有整數並回傳
	 * 
	 * @param start 初始值
	 * @param end   終止值
	 * @return 加總值sum
	 */
	public int loop5(int start, int end) {
		int sum = 0;
		int i = start < end ? start : end; // 如果初始值比終結值小,則以start開始，否則從end開始
		int e = start > end ? start : end;// 如果初始值比終結值大,則以start為迴圈解數條件，否則為end為結束條件
		do {
			sum += i;
			i++;
		} while (i <= e);
		return sum;
	}

	public String grade(int score) {
		switch (score / 10) {
		case 10:
		case 9:
			return ("A");
		case 8:
			return ("B");
		case 7:
			return ("C");
		case 6:
			return ("D");
		default:
			return ("E");
		}
	}

	/**
	 * 雞兔同籠問題，預設雞為0隻，以迴圈方式一隻一隻加上去，計算當雞(2隻腳)和兔子(4隻腳)腳的數目符合條件時則回傳有幾隻雞跟兔子
	 * 
	 * @param head 總共有幾隻雞兔在一起
	 * @param leg  總共有幾隻腳
	 */
	public void loop6(int head, int leg) {
		int chicken = 0;// 預設雞為0隻
		int rabbit;

		// 因為腳為複數,所以當腳不能被2整除時,則此題無解
		if (leg % 2 == 1) {
			System.out.println("此題無解");
			return;// 結束方法
		}

		while (chicken <= head) {// 當雞的數量比總數少時
			rabbit = head - chicken;// 假設兔子的是數量為 = 總數 - 雞的數量
			if (chicken != head) {// 當雞的數量不等於總數
				if (2 * chicken + 4 * rabbit == leg) { // 如果公式成立則
					System.out.printf("雞有%2d隻, 兔有%2d值\n", chicken, rabbit);// 回答雞兔同籠問題
					break;
				}
			} else
				System.out.println("計算結束,無答案則無解");
			chicken++;
		}
	}

	/**
	 * 票價計算系統，優惠方案:6歲以下及80歲以上打2折；7~12歲及60~79歲打5折
	 * 
	 * @param age 輸入年齡
	 * @return 以輸入的年齡回傳相對應的票價
	 */
	public int ticket(int age) {
		int price = 100;
		if (age <= 6 || age >= 80) {
			price = (int)(price * 0.2);
		} else if (age <= 12 || age >= 60) {
			price = (int)(price * 0.5);
		}
		return price;
	}
	
}

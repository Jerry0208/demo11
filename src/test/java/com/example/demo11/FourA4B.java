package com.example.demo11;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class FourA4B {
	// 幾A幾B
		@Test
		void guessnumber() {
			// 隨機產生4個0~9的數字 口口口口
//			int[] num = new int[4];
//			num[0] = (int) (Math.random() * 9);
//			num[1] = (int) (Math.random() * 9);
//			num[2] = (int) (Math.random() * 9);
//			num[3] = (int) (Math.random() * 9);
			
			//生成0~9的4個不重複的數字
			Random ran = new Random();//Random 隨機數產生器
			HashSet<Integer> hs = new HashSet<>();//HashSet 有自動刪除重複的值的功能
			while (true) {
				int num = ran.nextInt(10);//生成1個0~9的數字
				hs.add(num);//將數字加入HashSet
				if (hs.size() == 4)//如果湊齊4個數字就離開迴圈
					break;
			}
			int[] num = new int[hs.size()];//新增一個int陣列
			int a = 0;//迴圈初始值
			for (Integer number : hs) {//使用foreach逐一取出在HashSet內的數字
				num[a++] = number;//放入int陣列內
			}
//			印出陣列內的4個數字
			for (int j : num) {
				System.out.printf("%d ",j);
			}

			Scanner scanner = new Scanner(System.in);
			loop1 : while (true) {
				System.out.println("猜4個0~9的數字");
				int[] gus = new int[4]; //新增數字陣列
				
				for(int i = 0; i < gus.length; i++) {
					gus[i] = scanner.nextInt();//為所有陣列輸入一個數字
					if (gus[i] < 0 || gus[i] > 9) {//如果大於0 ~ 9則返回迴圈
						System.out.println("輸入數字範圍錯誤");//報錯
						continue loop1;//返回迴圈,重新開始
				}
					
				}
				// 如果位置與數字猜對,則得1A，如果數字猜對,則得1B
				int A = 0, B = 0;
				for (int i = 0; i <= 3; i++) {
					for (int j = 0; j <= 3; j++) {
						if (i == j && num[i] == gus[j]) {//如果位置相同,且數字相同
							A++;//得1A
						}
						if (num[i] == gus[j]) {//如果數字相同
							B++;//得1B
							break;//防止被猜相同數字
						}
					}
				}

				System.out.printf("A : B\n%d : %d\n", A, B);

				if (A + B == 8) {
					System.out.println("恭喜破關");
					break;
				}

			}

		}
}

package com.example.demo11;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

//Math and String
public class MathAndString {
	@Test
	public void mathTest() {
		int x1 = Math.max(5, 3);// Math.max(比較值1,比較值2),找最大值
		System.out.println(x1);
		int x2 = Math.max(Math.max(4, 3), x1);// 比2個值以上
		System.out.println(x2);
		int x3 = Math.min(10, 5);// 找最小值
		System.out.println(x3);
		int x4 = Math.abs(-5);// 絕對值
		System.out.println(x4);
		int x5 = Math.round(4.5f);// 四捨五入,round()double回傳long,float回傳int
		System.out.println(x5);
		int x6 = (int) Math.rint(5.4);// 退位
		System.out.println(x6);
		int x7 = (int) Math.rint(5.5);// 找最近的偶數
		System.out.println(x7);
		double x8 = Math.ceil(5.5);// 無條件進位
		System.out.println(x8);
		double x9 = Math.floor(5.5);// 無條件退位
		System.out.println(x9);
		int x10 = (int) Math.sqrt(4);// 開平方根
		System.out.println(x10);
		int x11 = (int) Math.cbrt(27);// 開立方根
		System.out.println(x11);
		int x12 = (int) Math.pow(2, 3);// 2的3平方
		System.out.println(x12);

	}

//	@Test
	public void stringTest() {
//		//長度
//		String x1 = "12345";
//		int a = x1.length();
//		System.out.println(a);
//		
//		//判斷內容
//		String x2 = "";//空字串
//		String x3 = " ";//空白字串
//		boolean y1 = x2.isEmpty();
//		boolean y2 = x3.isBlank(); //空白建也被算空白
//		System.out.println(y1);
//		System.out.println(y2);
//		boolean y3 = StringUtils.hasLength(x2);//判斷 null + isEmpty
//		boolean y4 = StringUtils.hasLength(x3);
//		System.out.println(y3);
//		System.out.println(y4);
//		boolean y5 = StringUtils.hasText(x2);//判斷 null + isBlanck
//		boolean y6 = StringUtils.hasText(x3);
//		System.out.println(y5);
//		System.out.println(y6);

		// 搜尋
		String s1 = "有一台飛機在飛";
//		System.out.println(s1.contains("一"));//判斷字串中是否存在搜尋內容
//		System.out.println(s1.charAt(3));//return 在索引位置上的字元
//		System.out.println(s1.indexOf("飛"));//從 index 0 開始搜尋 return 搜尋內容第一次出現的位置（index 值）
//		System.out.println(s1.lastIndexOf("飛"));//與前述功能相同，只是從右邊開始找起
//		System.out.println(s1.indexOf("飛", 4));//indexOf("搜尋內容", 起始位置)：從起始位置開始搜尋
//		System.out.println(s1.lastIndexOf("飛", 5));//lastIndexOf("搜尋內容", 起始位置)：從起始位置開始搜尋
//		當找不到搜尋內容時，index 值會 return -1

		// 裁切
//		System.out.println(s1.substring(3));//return 起始位置以後的部分字串
//		System.out.println(s1.substring(3,5));//return 起始位置以後～結束位置之前的部分字串
//		String s2 = " 海裡面有海綿";
//		System.out.println(s2.trim());//去除頭和尾的space，但無法去除中間的 space
//		System.out.println(s2.replace("有", "沒"));//replace(被換內容, 換成內容) 可以用此方法，把所有 space 去除
//		System.out.println(s1.concat(s2));//return 原字串＋連接內容

		// 資料轉換
//		String[] s3 = s1.split("機");//會將值切割掉，使分割成斷裂的幾個字詞
//		System.out.println(Arrays.toString(s3));
//		String[] s4 = s1.split("");//用 empty String 去切割，會變成一個個字
//		System.out.println(Arrays.toString(s4));
//		System.out.println(String.join("+", s4));//String.join(連接內容, 字串陣列名稱)：將字串陣列的內容以輸入的連接內容直接加起來，不會有分隔
//		System.out.println(s1.toCharArray());//char 型態的陣列可以直接用變數名稱印出整個內容 null 的地方則會印出 error block，而其他型態都只是印出記憶體位置
//		char[] c1 = new char[2];
//		s1.getChars(0,2,c1,0);//getChars(起點, 終點, 字元陣列名稱, 陣列起點)
//		System.out.println(c1);
//		System.out.println(String.valueOf(true));//將非字串的基本資料型態內容轉成字串
//		System.out.println(Integer.valueOf("12"));//將數字從 String 轉成 Integer
//		System.out.println(Integer.parseInt("34"));//將數字從 String 轉成 int

		// 比較內容值
		String st1 = "a";
		String st2 = st1;
		String st3 = new String(st1);
		String st4 = st3;
		String st5 = "A";
		String st6 = new String(st5);
		System.out.println(st1 == st2);
		System.out.println(st1 == st3);
		System.out.println(st3 == st4);
		System.out.println(st1.equals(st2));// equals(字串)：比較字串的內容值是否相等
		System.out.println(st1.equals(st3));
		System.out.println(st1.equals(st5));
		System.out.println(st1.equalsIgnoreCase(st5));// equalsIgnoreCase(字串)：將兩個字串都轉換為大寫進行比較
		System.out.println(st1.equalsIgnoreCase(st6));

	}

	@Test
	void test() {
		this.Stringquiz1("DDDCCCAAABBB");
//		this.Stringquiz2("DDDCCCAAABBB");
	}

	void Stringquiz1(String quiz) {
		char[] prepare;
		prepare = quiz.toCharArray();// 把String內每個字母分割成char後放入陣列內
		int countS[] = new int[4];// 製作一個陣列存放
		for (char check : prepare) {
//			if (check == 'A') {
//				countS[0]++;
//			}
//			if (check == 'B') {
//				countS[1]++;
//			}
//			if (check == 'C') {
//				countS[2]++;
//			}
//			if (check == 'D') {
//				countS[3]++;
//			}

			switch (check) {
			case 'A':
				countS[0]++;
				break;
			case 'B':
				countS[1]++;
				break;
			case 'C':
				countS[2]++;
				break;
			case 'D':
				countS[3]++;
				break;
			}

		}
		System.out.printf("有 %d個A %d個B %d個C %d個D", countS[0], countS[1], countS[2], countS[3]);
	}

	void Stringquiz2(String quiz) {
		int size = quiz.length();
		int[] count = { -1, -1, -1, -1 };
		int[] index = { 0, 0, 0, 0 };
		int[] quitCheck = { 0, 0, 0, 0 };
		int i = 0;
		int j = 0;
		while ((count[0] + count[1] + count[2] + count[3]) != size) {
			while (quitCheck[j] != -1) {
				quitCheck[j] = quiz.indexOf("A", index[i]);
				index[i] = quitCheck[j] + 1;
				count[i]++;
			}
			i++;
			j++;
			while (quitCheck[j] != -1) {
				quitCheck[j] = quiz.indexOf("B", index[i]);
				index[i] = quitCheck[j] + 1;
				count[i]++;
			}
			i++;
			j++;
			while (quitCheck[j] != -1) {
				quitCheck[j] = quiz.indexOf("C", index[i]);
				index[i] = quitCheck[j] + 1;
				count[i]++;
			}
			i++;
			j++;
			while (quitCheck[j] != -1) {
				quitCheck[j] = quiz.indexOf("D", index[i]);
				index[i] = quitCheck[j] + 1;
				count[i]++;
			}
		}
		System.out.printf("有 %dA %dB %dC %sD", count[0], count[1], count[2], count[3]);
	}

}

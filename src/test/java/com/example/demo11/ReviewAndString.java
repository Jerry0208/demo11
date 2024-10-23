package com.example.demo11;

import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;

//南哥第一天
//@SpringBootTest
public class ReviewAndString {
//	@Test
//	public void review() {
//		// 8+1(基本資料型態 + String)可以在等號後面附於值
//		// 整數
//		byte x = 1;
//		short y = 10;
//		int q = 1;
//		Integer w = new Integer(5);// class的預設值為null/NULL
//		System.out.println(w);
//		long n = 10000000000000L;
//		// 浮點數
//		float t = 5.5f;
//		double u = 5.5;
//		// 布林值
//		boolean s;
//		// 字元
//		char c;
//		// 字串為Class (類別)
//		String str1 = "a";
//		String str2 = new String("a");
//		// java強型別 : 資料型態不能混合使用
//	}

//	@Test
	public void stringTest() {
//		String str = "abc";
//		System.out.println(str.equals("abc"));// ==
//		System.out.println(str.equalsIgnoreCase("ABC"));// 忽略大小寫
//		String str2 = new String("abc");
//		System.out.println(str.equals(str2));// flase 兩者存的記憶體位置不同,所以對程式來說兩者不相等

		// StringBuffer 字串緩衝區 : 可以在同一個記憶體位置做文字的修改，不會每次修改時都會新增一個記憶體位置
		StringBuffer strBuf = new StringBuffer("new StringBuffer");
		strBuf.append("test").append("plus append");// 增加字串內容
//		System.out.println(strBuf.toString());

		// ABCD反轉
//		System.out.println(strBuf.reverse().toString());
//		String str = "ABCD";
//		String[] stringArray = str.split("");// [A, B, C, D] 分割為長度為4的字串陣列,索引值為:[0, 1, 2, 3]
//		String strReverse = "";// 空字串
//		for (int i = stringArray.length - 1; i >= 0; i--) {
//			strReverse += stringArray[i];
//		}
//		System.out.println(strReverse);

		// if 跟 for 迴圈沒有大括號,只會執行下一行的內容
//		int a = 5;
//		if(a >= 18) {
//			System.out.println("年齡: " + a);
//			System.out.println("已成年");
//		}else 
//			System.out.println("未成年");
	}

}

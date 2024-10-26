package com.example.demo11;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class Regular_Expression {
	public void test() {
//		正規表達式(Regular Expression) 
//		Bank.bankTest3();

//		正規表示示範		
//		String str = "ABCDEA";
//		String newStr = str.replace("A", "Z");
//		String newStr1 = str.replaceAll("A", "Z");
//		System.out.println(newStr);
//		System.out.println(newStr1);
//		
//		String newStr2 = str.replaceAll("[A-C]", "Z");//[A-C]正規表示
//		System.out.println(newStr2);

		// 比對手機格式 : 數字4個-數字3個-數字3個
		// \d表示數字0~9的任意一個數字 (0|1|2|3|4|5||7|8|9)
		// \跳脫符號無法單獨存在
		// \在java中表示跳脫符號,用來跳脫有特殊意義的符號 -> 讓有特殊意義的符號變成單純的符號
//		System.out.println("\\");// 只會印出後面那一個\,因為前面的\讓後面的符號變成了單純的符號
		System.out.println("輸入電話號碼,格式: xxxx-xxx-xxx");
		Scanner scanner = new Scanner(System.in);
		String strS = scanner.next();

		String str1 = "0912-345-678";
		String pattern = "\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d";
//		String pattern = "\\d{4}-\\d{3}-\\d{3}";// 用大括號 \\d{重複次數}, 表達內容與上一行相同
//		String pattern = "\\d{4}(-\\d{3}){2}";// 用小括號框起來為一組(-\\d){重複次數}, 表達內容與上一行相同
//		boolean check = strS.matches(pattern);
//		if(check) {//等同於 check == true
//			System.out.println(strS + "符合手機號碼格式!");
//		}else {
//			System.out.println(strS + "不符合手機號碼格式!");
//		}
		// ----------------------------------------------------------------
		// 上面的strS.matches(pattern) 的結果用變數 check 接回來
		// 但在後續的程式碼中，變數 check 只使用一次
		// 所以可以使用匿名(不需要用變數名稱來接計算的結果)的方式來改寫
		if (strS.matches(pattern)) {// 等同於 strS.matches(pattern) == true
			System.out.println(strS + "符合手機號碼格式!");
		} else {
			System.out.println(strS + "不符合手機號碼格式!");
		}

	}

	public void test2() {
		// 市話格式 1: 數字2碼-數字7碼
		// 市話格式 2: (數字2碼)-數字7碼
		String pattern1 = "\\d{2}-\\d{7}";
		String pattern2 = "\\(\\d{2}\\)-\\d{7}";
		Scanner scanr = new Scanner(System.in);
		System.out.println("請輸入市話,格式 : 數字2碼-數字7碼 或是 (數字2碼)-數字7碼");
		String homeCall = scanr.next();
//		if(homeCall.matches(pattern1) || homeCall.matches(pattern2)) {
//			System.out.println(homeCall + "符合市話號碼格式");
//		}else {
//			System.out.println(homeCall + "不符合市話格式!");
//		}
//		===================================================================
		// 合併 pattern1 和 pattern2
//		String pattern3 = "\\d{2}-\\d{7}|\\(\\d{2}\\)-\\d{7}";// |中間不能有空格,會被判定要有空格
		String pattern4 = "(\\d{2}|\\(\\d{2}\\))-\\d{7}";// 用小括號把開頭2碼, 分類成沒括號或有括號都可以
		if (homeCall.matches(pattern4)) {
			System.out.println(homeCall + "符合市話號碼格式");
		} else {
			System.out.println(homeCall + "不符合市話格式!");
		}
	}
//	public void test3() {
//		//市話格式 數字2碼-數字7碼或8碼
//		String pattern1 = "\\d{2}-(\\d{7}|\\d{8})";
//		String pattern2 = "\\d{2}-\\d{7,8}";// \\d{7,8}表示\\d至少出現7次,至多出現8次
//		
//	}

//	@Test
	public void quiz1() {
		// 區號2碼
		// 電話號碼7~8碼
		// 區碼跟號碼有兩種表現方式 : 1. 區號有小括號後間接號碼 例: (02)12345678
		// 2. 區號沒小括號,區號跟號碼用-連接起來 例: 06-1234567
		String pattern = "(\\(\\d{2}\\)|\\d{2}-)\\d{7,8}";
		String num1 = "(02)12345678";
		String num2 = "06-1234567";
		String num3 = "0912-123-456";
		if (num1.matches(pattern)) {
			System.out.println(num1 + "符合市話號碼格式");
		} else {
			System.out.println(num1 + "不符合市話格式!");
		}
	}

	public void quiz2() {
		// 區號2~4碼
		// 電話號碼7~8碼
		// 區碼跟號碼有兩種表現方式 : 1. 區號沒小括號,區號跟號碼用-連接起來 例: 06-1234567
		String pattern = "0\\d{1,3}-\\d{7,8}";
		String num1 = "02-12345678";
		String num2 = "006-1234567";
		String num3 = "0912-123-456";
		String num4 = "123-1234567";
		if (num4.matches(pattern)) {
			System.out.println("符合市話號碼格式");
		} else {
			System.out.println("不符合市話格式!");
		}
	}

	public void regex() {
//		char a = 65;
//		System.out.println(a);
		String pattern1 = "[A-z]"; // ASCII code中大寫英文字母到小寫英文字母中間有一些特殊符號
		System.out.println("_".matches(pattern1));
		String pattern2 = "[A-CSW-Z]"; // 符合字母有 : A B C S W X Y Z 共8個字母
		System.out.println("Y".matches(pattern2));
		// [^]搜尋範圍以外的內容
		// ^開頭 $結尾 例 ^[A-Za-z]b$ 英文字母開頭 小寫b結尾
		// .萬用符號
	}

	public void quiz3() {
//		市內電話號碼比對
//		使用範圍符號 []
//		區碼 0 開頭，總共會有 2~4 碼, 剩下3碼不得為0
//		電話號碼 7~8 碼
//		區碼和號碼中間以 – 連接，例如 02-12345678
		String pattern = "0[1-9]{1,3}-\\d{7,8}";
		String number = "025-12345678";
		String number2 = "0123-1234567";
		String number3 = "0912-123-456";
		System.out.println(number.matches(pattern));
		System.out.println(number2.matches(pattern));
		System.out.println(number3.matches(pattern));
	}

	@Test
	public void quiz4() {
//		身份證字號檢查(Scanner 輸入)
//		10碼
//		第一個字為英文字母(大小寫皆可)
//		英文字母後面接著的第一個數字只會是 1 或 2
//		請用正規表達式完成
//
//		完成後，請再寫個排除6都的大小寫英文字母(A、B、D、E、F、H)
//		版本1，正常版本
//		版本2，嘗試用特殊字元 \\w
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入身分證 : ");
		String id = scanner.next();
		String pattern1 = "[[A-Za-z]&&[^ABDEFHabdefh]][12]\\d{8}";
		String pattern2 = "[\\w&&[^ABDEFHabdefh0-9_]][1-2]\\d{8}";// \\w ==> [A-Za-z0-9_]
		System.out.println(id.matches(pattern1));
//		if(id.matches(pattern)) {
//			System.out.println("輸入成功");
//		}else {
//			System.out.println("輸入錯誤");
//		}

	}

	@Test
	public void text3() {
		String str = "ABSIjwcnwodsenfpqa你 好_@*";

		System.out.printf(this.countCharacter(str));

	}


	// 計算一串文字中所有字母的出現次數
	public String countCharacter(String str) {
		// 先講所以英文轉為大寫英文字母
		str = str.toUpperCase();
		// 將字串中所有文字分割成單一字母放入 List 陣列內
		String[] listStr = str.split("");
		// 建立LinkedHaskMap
		Map<String, Integer> map = new LinkedHashMap<>();

		// 透過迴圈逐一比對，如果 Map 已經有這一字母，則 Value + 1
		// 沒有則新增至 Map，Value 為 1
		for (int i = 0; i <= listStr.length - 1; i++) {
			if (map.containsKey(listStr[i])) {
				map.put(listStr[i], map.get(listStr[i]) + 1);
			} else {
				map.put(listStr[i], 1);
			}
		}

		// 建立一個空字串
		String reqStr = "";
		// 透過 Entry 將文字 : 數量 儲存在 reqStr 內
		for (Entry<String, Integer> item : map.entrySet()) {
			reqStr += item.getKey() + ":" + item.getValue() + ", ";
		}
		
		// 回傳resStr
		return reqStr;

	}
}

package com.example.demo11;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class TryCatch {
	@Test
	public void test() {
//		List<String> list = null;
//		for (String str : list) {
//			System.out.println(str);
//		}

		String str = null;
		getLength(str);
//		getLength("A");
	}

	public void getLength(String str) {
		try {
			// 預期會發生 Error 的程式碼
			System.out.println(str.length());

		} catch (Exception e) {
			// Exception 是所有 Exception(例外類錯誤) 類的父類別
			// 將錯誤透過 catch 接取後用， .getMessage() 印出錯誤內容
			// 程式會繼續執行，不會報錯停止
			System.out.println(e.getMessage());
		}
		// ========================================================
		try {
			// 預期會發生 Error 的程式碼
			System.out.println(str.length());

		} catch (IndexOutOfBoundsException e) {
			// 會報錯，因為 IndexOutOfBoundsException 是 ArithmeticException 的兄弟類別，所以沒辦法捕捉到錯誤
			System.out.println(e.getMessage());
		} finally {
			// 最終一定會被執行，不管 try 、 catch 有沒有被執行到
			System.out.println("BBB");
		}
		// ==========================================================
		// 多個 catch 的範例
//		try {
//			// 預期會發生 Error 的程式碼
//			System.out.println(str.length());
//
//		} catch (ArithmeticException e) {
//			System.out.println(e.getMessage());
//		} catch (Exception e) {
//			// Exception 是所有 Exception(例外類錯誤) 類的父類別
//			// 將錯誤透過 catch 接取後用， .getMessage() 印出錯誤內容
//			// 程式會繼續執行，不會報錯停止
//			System.out.println(e.getMessage());
//		} finally {
//			// 最終一定會被執行，不管 try 、 catch 有沒有被執行到
//			System.out.println("AAA");
//		}

	}

	@Test
	public void test2() {
		// scan 屬於 I/O 類， new 出來後會建議在不使用時(程式碼最後)將其關閉(close)以避免資源的浪費，若沒有 close ， 程式不會報錯，頂多就是浪費資源而已。
		// try-with-resources: 將 new 出來的 I/O 類寫在 try 後面的小括號內中，
		// 程式碼離開 try-catch 的區塊後會自動執行 close 將資源關閉，小括號中有多個 I/O 類 用 ; 分割。
		try (Scanner scan = new Scanner(System.in);) {
			String str = scan.next();
		} catch (Exception e) {

		}

	}
}

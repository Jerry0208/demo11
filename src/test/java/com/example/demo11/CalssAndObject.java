package com.example.demo11;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class CalssAndObject {
	// 物件導向程式設計( Object-oriented programming(OOP) ) :封裝、繼承、抽象、多型
	@Test
	public void calssAndObject() {
		// class 類別 : 是種廣泛的概念，用來描述具有某些屬性和方法 ex: 動物(名子、吃飯、睡覺)
		// Object 物件 :類別的實例(instance) 例: 狗(小白、6歲、在吃飯)
		// 物件的屬性(Attributes)與行為(Method) 例人類 -> 1.屬性:名子、年齡、性別
		// 2.行為:呼吸、吃飯、睡覺
		// 關鍵字 new 新增實例(instance)
//			Dog myDog = new Dog();
//			//設定實例的屬性(特性)
//			myDog.category = "牧羊犬";
//			myDog.color = "白色";
//			myDog.name = "小白";
//			myDog.age = 3;
//			System.out.println("狗的品種是" + myDog.category);
//			System.out.println("毛色為" + myDog.color);
//			System.out.println("名子叫" + myDog.name + "," + myDog.age + "歲");
//			//使用方法(行為)
//			myDog.run();
//			myDog.run("小黑");
//			myDog.eat("胖小白");
	}

	@Test
	public void bankTTest() {
		Bank bank = new Bank();
//			System.out.println(bank);// 會印出記憶體位置
//			Bank bank1 = new Bank();
//			System.out.println(bank1);// 會印出另一個記憶體位置
//			System.out.println(bank == bank1);// 比較記憶體位置相不相同
//			Bank bank2 = bank;
//			System.out.println(bank == bank2);// 比較記憶體位置相不相同
//			bank.setUser("orange");// 設定bank的用戶名
//			System.out.println(bank2.getUser());// 印出bank2的用戶名,與bank用戶名相同(表示兩者共用一個記憶體空間)
		bank.setBranch("台南分行");
		bank.setUser("0001");
//			System.out.println(bank.getBranch());
//			int amount = bank.getBalance();
//			System.out.println(amount);
//			bank.saving(100);
//			bank.withdraw(50);
		Bank bank1 = new Bank("TTA", "001", 100);// (分行名,用戶名,餘額)
		System.out.println("分行名 : " + bank1.getBranch());
		System.out.println("用戶名 : " + bank1.getUser());
		System.out.println("餘額 : " + bank1.getBalance());

	}

	
}

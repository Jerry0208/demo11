package com.example.demo11;

import org.junit.jupiter.api.Test;

public class InheritanceAndPolymorphism {
	// 繼承 (Inheritance) 物件導向程式設定中類別是可以被"繼承"的
	// 目的 :
	// 1. 減少重複的程式碼
	// 2. 父類別 (super class) 有的屬性跟方法子類別 (child class) 也有
	// 3. 子類別還可以有自己的方法跟屬性
	// 關鍵字 : B extends A 、 B 繼承 A 、 B <-- A
	@Test
	public void animalTest() {
		// 對應 main/java 的 Animal
		Animal ani = new Animal();
		ani.setName("Egg");
		ani.eat();
		ani.sleep();
	}

	@Test
	public void animalTest2() {
		// 對應 main/java 的 Animal
		Animal ani = new Animal("Egg", 1);
		ani.eat();
		ani.sleep();
	}

	@Test
	public void bridTest() {
		// 對應 main/java 的 Bird 、Animal
		Bird bird = new Bird();
		bird.setName("Lily");
		bird.eat();
		bird.sleep();
		bird.flying();
	}

	@Test
	public void bridTest2() {
		// 對應 main/java 的 Bird 、Animal
		Bird bird = new Bird("Lily", 3);
		bird.eat();
		bird.sleep();
		bird.flying();
		bird.info();
		// 實體 是否繼承 類別 回傳 blooean
		System.out.println(bird instanceof Animal);
	}

	@Test
	public void family() {
		// 對應 main/java 的 Father 、Son 、 Daughter
		Father father = new Father("Bob");
		father.walk();
		;

		System.out.println("============");

		Son son = new Son("Week");
		son.walk();
		son.playball();

		System.out.println("============");

		Daughter daughter = new Daughter("Anna");
		daughter.walk();
		daughter.shopping();
	}

	@Test
	public void quiz1() {
		// 對應 main/java 的 NameId 、 Bank2 、 PersonaInfo
		System.out.println("Bank2 is kind of NameId");
		Bank2 bank = new Bank2("TTA分行", "001", "王小名", 0);
		System.out.println("分行名 : " + bank.getBranchTitle());
		System.out.println("用戶名 : " + bank.getName());
		System.out.println("用戶ID : " + bank.getId());
		System.out.println("用戶餘額 : " + bank.getBalance());

		System.out.println("================");

		System.out.println("PersonaInfo is kind of NameId");
		PersonaInfo personaInfo = new PersonaInfo("002", "林小美", 25, "火星");
		System.out.println("ID : " + personaInfo.getId());
		System.out.println("姓名 : " + personaInfo.getName());
		System.out.println("年齡 : " + personaInfo.getAge());
		System.out.println("居住城市 : " + personaInfo.getCity());

	}

	@Test
	public void overrideTest() {
		// 對應 main/java 的 Bird 、Animal
		Bird bird = new Bird("Lily", 3);
		bird.info();
		bird.eat();
		bird.sleep();
		bird.flying();
	}

	@Test
	public void PolymorphismTest() {
		// 多形(Polymorphism)
		// 對應 main/java 的 Bird 、Animal

		// 雖然接回來的資料型態是父類別，但因為 new 出來的實體是子類別，所以本質上就是子類別
		Animal bird = new Bird("Lily", 3) {// 匿名類別
			public void haveBaby() {
				class Egg {// 方法內部類別、內部類別
					class Baby {// 內部類別

					}
				}
			}

		};
		// eat() 和 sleep() 執行的會是子類別中重新定義的實作內容
		bird.eat();
		bird.sleep();
		// 以下2個方法無法被呼叫，因為沒有被定義在父類別內中
//		bird.info();
//		bird.flying();
		// 綜合以上，當新建立出來的子類別實例其接收的資料型態是父類別時
		// 1.只能呼叫定義在父類別中的方法
		// 2.當子類別有重新定義父類別的方法時，執行的話是子類別的實作內容
	}

	@Test
	public void mutiClass() {
		Bird bird = new Bird("Lily", 3) {
			public void haveBaby() {// 匿名類別
				class Egg {// 方法內部類別、內部類別

				}
			}

		};
		bird.flying();

		// 重新定義 Flying() 方法
		// 1. 在建立新的實例時直接給予新的實作內容，即加上大括號
		// 2. 大括號要寫在分號前面，且結尾一定要有分號
		// 3. 重新定義的實作內容就僅此在這次執行
		// 4. @Override 可有可無，但建議加
		Bird bird2 = new Bird("Lily", 3) {
			@Override
			public void flying() {
				System.out.println(getName() + "is Flying a heigh");
			}

		};
		bird2.flying();
	}
}

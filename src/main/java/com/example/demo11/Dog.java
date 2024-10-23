package com.example.demo11;

import java.time.*;

public class Dog {
	// 宣告屬性(特性)
	String category;// 品種

	String color;// 顏色

	String name;// 名子

	int age;// 年齡

	// 定義方法(行為)
	//方法的多載(overload),系統會自動識別有帶參數跟沒帶參數的方法,然後去跑相對應參數的內容
	public void run(String name) {
		System.out.println(name + "正在跑");
	}

	public Dog(String category, String color, String name, int age) {
		super();
		this.category = category;
		this.color = color;
		this.name = name;
		this.age = age;
	}

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void run() {
		System.out.println(name + "正在跑");
	}

	public void eat(String name) {
		// 印出 : 霸氣的總柴很愛吃變成胖總柴
		// this關鍵字,指本類別的內容物
		System.out.println(this.name + "很愛吃變成" + name);
	}
}

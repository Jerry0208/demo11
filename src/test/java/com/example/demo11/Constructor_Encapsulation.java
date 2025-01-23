package com.example.demo11;

import org.junit.jupiter.api.Test;

public class Constructor_Encapsulation {
	@Test
	public int factorial(int i) {//遞迴
		if (i == 1) {
			return 1;
		} else {
			return (i * factorial(i - 1));
		}

//		方法迴圈示範
//		System.out.println(factorial(2));
		
	}
	
	//物件建構(Constructor)與封裝(Encapsulation)
	//一般方法 
	//格式 : 存取權限 方法的回傳值資料型態 方法名稱(參數資料型態 參數資料名稱) { 方法的實作內容 }
	//看方法實作的方式 在類別名稱上案ctrl後選inplementation
	
	//類別方法的建構方式(與類別同名且不帶回傳值的方法) 
	//預設建構方法(使用source -> generate constructors from superClass),小括號內沒有參數
	//格式 : 方法的存取權限 "類別"名稱() {}
	//*注意* 如果有建立小括號帶有參數的建溝方法,預設的建溝方式沒寫就不能夠使用
	//好習慣 : 如果建立帶有參數的建溝方法時,同時建立不帶參數的建構方法(接資料庫時沒有預設建溝方法時會出錯)
	
	//類別成員的存取控制    Class  package   subClass(繼承) world
	//	public			o		o		  o		 	  	o
	//	protected		o		o		  o
	//	no modifier		o		o
	//	private			o
	//封裝 : 也可稱為資訊隱藏
	
	//Static : 靜態或是全域(沒辦法再次被修改),工具類類別 例:Math.random() 類別名稱.方法名稱()
	//final : 建立後不能再更改,常使用在常數 例 : Math.PI 類別名稱.變數名稱
}


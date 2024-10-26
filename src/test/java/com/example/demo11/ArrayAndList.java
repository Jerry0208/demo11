package com.example.demo11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ArrayAndList {
	public void array() {
		// 4種不同的陣列宣告方式
//		int[] a = new int[2];
//		int b[] = new int[3];
//		int[] c;
//		c = new int[1];
//		int[] d = {1,2,3,4,5,6,7,8,9,10};
//		a[0] = 1;
//		a[1] = 2;
//		b[0] = 3;
//		b[1] = 2;
//		b[2] = 1;
//		c[0] = 4;
// 		System.out.println(a.length);//列印出陣列長度
//		Arrays.toString(c);//將陣列轉換為字串
//		System.out.println(c);
	}

	 @Test
	public void test() {
		int[] score = { 50, 65, 75, 85, 90 };
		this.classQuiz(score);
	}

	public void classQuiz(int[] score) {
		// System.out.println(score.toString());
		System.out.println("所得評審分數：" + Arrays.toString(score));
		Arrays.sort(score);// 由小到大排序
		double average = 0;
		for (int i = 1; i < (score.length - 1); i++) {
			average += (double) score[i];
		}
		average = average / (score.length - 2);
		System.out.println("有效分數：" + average);
	}

//	@Test
	public void list() {
		List<Integer> a = Arrays.asList(0, 1, 2);// 建立清單: List<資料型態> 名稱 = Array.asList(資料1, 資料2,......) ★長度固定，無法增刪
		List<Double> b = List.of(3.0, 4.0);// 建立清單: List<資料型態> 名稱 = List.of(資料1, 資料2,......) ★長度固定，無法增刪
		List<Integer> c = new ArrayList<>();// List<資料型態> 名稱= new ArrayList<>(); // 純粹宣告
		List<Double> d = new ArrayList<>(b);// List<資料型態> 名稱= new ArrayList<>(清單名稱); // 宣告同時給值 ★最常使用，長度動態增刪
		// System.out.println(d.size());//.size()方法 : 回應清單大小
//		c.add(8); //.add() : 增加儲存一個資料
//		c.remove(1);//.remove() : 減少一個儲存資料，括號內數字為index位置
//		System.out.println(d.get(0));// .get() : 取得清單該位置的資料內容
//		System.out.println(d.indexOf(4));// .indexOf() : 取得值所在的索引位置
//		System.out.println(d.contains(5));// .contains() : booleam,是否包含
//		System.out.println(c);//直接列出列表內所有元素
//		for(int i : c) { //遍歷
//			System.out.println(i);
//		}
//		d.forEach(item -> {// List名稱.forEach( 名稱 箭頭 { 程式內容 缺點:沒辦法放區域變數 } );
//			System.out.println(item);
//		});
//		for (int i = 0; i <= 3; i++) {
//			c.add(i);
//			System.out.println("第" + i + "次 : " + c);
//		}

	}

	@Test
	public void listuqiz() {
		List<Integer> randomNum = new ArrayList<>();// 建立List物件
		int check;
		while (randomNum.size() < 4) {// 如果沒滿4個數字
			check = (int) (Math.random() * 10);// 建立一個0~9的亂數
			if (!randomNum.contains(check)) {// 如果List內沒有相同數字
				randomNum.add(check);// 就把數字加入
			}
		}
		// 把List內的元素以String取出
		String list = "";
		for (int i = 0; i < randomNum.size(); i++) {
			list += randomNum.get(i) + "";
		}
		;
		System.out.println(list);// 列印出List內容
	}
}

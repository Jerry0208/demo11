package com.example.demo11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

public class CollectionTest {

	@Test
	public void listTest1() {
		Bank bank = new Bank();
		String[] str;
		// List 是介面 (interface) 只能用來定義方法而已,並無任何實作內容:所以無法使用 new 建立實例
		// ArrayList 是用來實現定義在 List 中方法的實作類別
		List<Bank> list = new ArrayList<>();
		// List <>(角括號)中的資料型態不能放8種基本資料型態,只能放類別(Class)
		// List 特色 : 1. 允許元素重複 2. 內部資料保持一定順序(以插入(新增))的順序)
		List<Integer> intlist = new ArrayList<>();
		intlist.add(1);
		intlist.add(1);
		intlist.add(2);
		intlist.add(3);
		intlist.add(2, 5);

		for (Integer item : intlist) {
			System.out.println(item);
		}
		System.out.println("==============================================");
		intlist.remove(2);
		for (Integer item : intlist) {
			System.out.println(item);
		}

	}

	@Test
	public void listTest2() {
		ArrayList<String> list = new ArrayList<>();
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(2, 5);
		for (int i = 0; i < intList.size(); i++) {
			if (intList.get(i) == 1) {
				intList.remove(intList.get(i));
			}
			System.out.println(intList.get(i));
		}
//		System.out.println("==========================================="); 
//		for(Integer item : intList)  { //在foreach(語法糖)內對List新增或刪除會造成程式出錯
//			if(item == 2) {
//				intList.remove(item);
//			}
//			System.out.println(item);
//		}

	}

	@Test
	public void list3Test() {
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(2, 5);
		Iterator<Integer> itr = intList.iterator();// hasNext() 和 next()
		System.out.println(itr.hasNext());
	}

	public void list4Test() {
		List<String> strList = new LinkedList<>();
		strList.add("A");
		strList.add("B");
		strList.add("C");
		strList.add("A");
		System.out.println(strList);
	}

	@Test
	public void hashSetTest() {
		// HashSet
		// 1.不允許重複元素(相同元素只會保留一個)
		// 2.不會依照新增的順序排列(無序)
		Set<String> strSet = new HashSet<>(); // ctrl + shift + O 可以快速import
		strSet.add("A");
		strSet.add("C");
		strSet.add("A");
		strSet.add("B");
		strSet.add("F");
		strSet.add("D");
		strSet.add("E");
		strSet.add("B");

		// 印出內容
		for (String item : strSet) {
			System.out.println(item);
		}
	}

	@Test
	public void linkedHashSetTest() {
		// LinkedHashSet
		// 1.不允許重複元素(相同元素只會保留一個)
		// 2.會依照新增的順序排列(有序)
		Set<String> strSet = new LinkedHashSet<>(); // ctrl + shift + O 可以快速import
		strSet.add("A");
		strSet.add("C");
		strSet.add("A");
		strSet.add("B");
		strSet.add("F");
		strSet.add("D");
		strSet.add("E");
		strSet.add("B");

		// 印出內容
		for (String item : strSet) {
			System.out.println(item);
		}
	}

	@Test
	public void treeSetTest() {
		// treeSet
		// 1. 不允許重複元素(相同元素只會保留一個)
		// 2. 由小到大排序(文字依照ASCII code去排序)
		Set<String> strSet = new TreeSet<>(); // ctrl + shift + O 可以快速import
		strSet.add("A");
		strSet.add("C");
		strSet.add("A");
		strSet.add("B");
		strSet.add("F");
		strSet.add("D");
		strSet.add("E");
		strSet.add("B");

		// 印出內容
		for (String item : strSet) {
			System.out.println(item);
		}
	}

	@Test
	public void quiz1() {
//		問題:	
//		 隨機產生 5 個 1~10 不重複的數字
//		  一定要產生 5 個數字
//		  印出最大和最小的數字
//		  印出由小排到大所有數字
//		  印出由大排到小所有數字

		Set<Integer> num = new TreeSet<>();

		// 由小到大

		// 方法1: 使用TreeSet
		while (num.size() < 5) {
			num.add((int) ((Math.random() * 10) + 1));
		}

		for (int item : num) {
			System.out.println(item);
		}

		System.out.println("=============================================");
		// 由大到小

		// 方法1: 轉成List
		List<Integer> item = new ArrayList<>(num);
		for (int i = (num.size() - 1); i >= 0; i--) {
			System.out.println(item.get(i));
		}

		// 方法2: 使用.toArray()
//		Object[] item2 = num.toArray();
//		for (int i = (num.size() - 1); i >= 0; i--) {
//			System.out.println(item2.get(i));
//		}

		// 方法3: 使用Collections.reverse() 反轉內容
//		Collections.reverse(item);
//		System.out.println(item);

		// 方法4: 使用descendingSet() 反轉
	}

	@Test
	public void mapTest() {
		// Map<key 的資料型態, value 的資料型態>
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		// 使用 get(key值) 通過 key 將對應的 value 取出
		String str = map.get(2);
		System.out.println(str);
		// 遍歷: 使用 foreach 將 map 中的 key-value 取出
		// 將 map 轉成 entrySet , item 就是包含了 key 和 value , 可以使用 getKey 和 getValue 取值
		for (Entry<Integer, String> item : map.entrySet()) {
			System.out.println("key  : " + item.getKey());
			System.out.println("value: " + item.getValue());
		}
		System.out.println("=============================");
		// 將 map 轉成 keySet , 每個 item 就表示一個 key , 透過 get(item) 將對應的 value 取出
		for (Integer item : map.keySet()) {
			System.out.println("key  : " + item);
			System.out.println("value: " + map.get(item));
		}

		// 原本 map 中 , 已存在 key = 1 以及對應的 value = A
		// 現在在相同1的位置放入 D , key=1 其相對應的 value 會變成 D(key相同,對應的value後蓋前)
		map.put(1, "E");
		// 不同的 key , 可以有相同或不同的對應 value
		map.put(5, "E");
		map.put(0, "E");
		// containsKey 是否有此 key 值
		System.out.println(map.containsKey(1));
		// containsValue 是否是這個 Value 值
		System.out.println(map.containsValue("E"));

		System.out.println("=============================");
		for (Entry<Integer, String> item : map.entrySet()) {
			System.out.println("key  : " + item.getKey());
			System.out.println("value: " + item.getValue());
		}
	}

	@Test
	public void mapTest2() {
		// key-value 是 1對1
		Map<Integer, String> map = new HashMap<>();
		// key-value 是 1對多
		Map<Integer, String[]> map2 = new HashMap<>();
		Map<Integer, List<String>> map3 = new HashMap<>();
		Map<Integer, Set<String>> map4 = new HashMap<>();
		Map<Integer, Map<Integer, String>> map5 = new HashMap<>();
	}

	@Test
	public void test3() {
		// isEmpty() : 詢問集合或是 Map 其 size 是否為 0(空的)
		List<String> list = new ArrayList<>();
		System.out.println("list是否沒有內容物: " + list.isEmpty());

		Set<String> set = new HashSet<>();
		System.out.println("set是否沒有內容物: " + set.isEmpty());

		Map<Integer, String> map = new HashMap<>();
		System.out.println("map是否沒有內容物: " + map.isEmpty());

		// =============
		List<String> list2 = null;
		// 因為 list2 是 null , 所以無法使用 null 透過 .方法() 來執行程式 , 會報錯
		// 下行程式碼會報 NullPointerException(空指針錯誤)
		System.out.println("list2是否沒有內容物: " + list2.isEmpty());
	}

	@Test
	public void quiz() {
//		兩數之和
//		 給定一個整數組 nums 和一個整數目標值 target，請在該數組中找出和為目標
//		值的兩個數字，並返回該兩數之 index
//		 相同位置的數值不能相加
//		 使用 Map 的 containsKey(key)
//		 例如:
//		 nums = [2, 7, 11, 15]；target = 9
//		 輸出結果為 [0, 1]；因為 2+7 = 9，2 和 7 在 nums 中的 index 分別為 0 和 1

		// 構想 : 目標 - 元素 = 剩餘值 , 在其餘元素中找到相對應的剩餘值
		// 1.將陣列內的元素取出後 , 放入 TreeMap 的 key 內 , value 為流水號 0 ~ n
		// 2.紀錄目前元素位置，如果當前元素 - 目標後取的到剩餘值使用 containsValue 如果為 ture 就並紀錄位置 , 回傳兩個紀錄的位置
		// 3.前往下一個元素後重複第 2步驟

		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		Map<Integer, Integer> map = new HashMap<>();
		int[] anser = new int[2];

		for (int i = 0; (i < nums.length); i++) {
			map.put(i, nums[i]);
		}

		for (Integer item1 : map.keySet()) {
			for (Integer item2 : map.keySet()) {
				if ((map.get(item1) + map.get(item2) == target && item1 != item2)) {
					anser[0] = item1;
					anser[1] = item2;
					System.out.println(Arrays.toString(anser));
					return;
				}
			}
		}

		System.out.println("沒有能相加為: " + target + " 的兩個數字");
	}

	@Test
	public void quiz2() {
//		兩數之和
//		 給定一個整數組 nums 和一個整數目標值 target，請在該數組中找出和為目標
//		值的兩個數字，並返回該兩數之 index
//		 相同位置的數值不能相加
//		 使用 Map 的 containsKey(key)
//		 例如:
//		 nums = [2, 7, 11, 15]；target = 9
//		 輸出結果為 [0, 1]；因為 2+7 = 9，2 和 7 在 nums 中的 index 分別為 0 和 1

		int[] nums = { 2, 7, 11, 15, 2 };
		int target = 2;
		Map<Integer, Integer> map = new HashMap<>();
		int[] anser = new int[2];

		for (int i = 0; (i < nums.length); i++) {
			map.put(nums[i], i);
		}

		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement) && map.get(complement) != i) {
				anser[0] = i;
				anser[1] = map.get(complement);
				System.out.println(Arrays.toString(anser));
			}
		}
	}

	@Test
	public void quiz3() {
//		兩數之和
//		 給定一個整數組 nums 和一個整數目標值 target，請在該數組中找出和為目標
//		值的兩個數字，並返回該兩數之 index
//		 相同位置的數值不能相加
//		 使用 Map 的 containsKey(key)
//		 例如:
//		 nums = [2, 7, 11, 15]；target = 9
//		 輸出結果為 [0, 1]；因為 2+7 = 9，2 和 7 在 nums 中的 index 分別為 0 和 1

		int[] nums = { 2, 7, 11, 15, 2 };
		int target = 9;
		Map<Integer, Integer> map = new HashMap<>();
		int[] anser = new int[2];

		for (int i = 0; (i < nums.length); i++) {
			int complement = target - nums[i]; // 要找的數字 = 目標數字 - 當前陣列數字
			if (map.containsKey(complement)) { // 如果 map 內有 "要找的數字"
				anser[0] = i;
				anser[1] = map.get(complement);
				System.out.println(Arrays.toString(anser));
				return;
			}
			map.put(nums[i], i);				// 如果沒有匹配就把 ( 當前陣列數字, 當前陣列位置 ) 放入 map 內  
		}
		System.out.println("沒有正確答案");
	}
}

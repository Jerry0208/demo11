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
		// List �O���� (interface) �u��Ψөw�q��k�Ӥw,�õL�����@���e:�ҥH�L�k�ϥ� new �إ߹��
		// ArrayList �O�Ψӹ�{�w�q�b List ����k����@���O
		List<Bank> list = new ArrayList<>();
		// List <>(���A��)������ƫ��A�����8�ذ򥻸�ƫ��A,�u������O(Class)
		// List �S�� : 1. ���\�������� 2. ������ƫO���@�w����(�H���J(�s�W))������)
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
//		for(Integer item : intList)  { //�bforeach(�y�k�})����List�s�W�ΧR���|�y���{���X��
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
		Iterator<Integer> itr = intList.iterator();// hasNext() �M next()
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
		// 1.�����\���Ƥ���(�ۦP�����u�|�O�d�@��)
		// 2.���|�̷ӷs�W�����ǱƦC(�L��)
		Set<String> strSet = new HashSet<>(); // ctrl + shift + O �i�H�ֳtimport
		strSet.add("A");
		strSet.add("C");
		strSet.add("A");
		strSet.add("B");
		strSet.add("F");
		strSet.add("D");
		strSet.add("E");
		strSet.add("B");

		// �L�X���e
		for (String item : strSet) {
			System.out.println(item);
		}
	}

	@Test
	public void linkedHashSetTest() {
		// LinkedHashSet
		// 1.�����\���Ƥ���(�ۦP�����u�|�O�d�@��)
		// 2.�|�̷ӷs�W�����ǱƦC(����)
		Set<String> strSet = new LinkedHashSet<>(); // ctrl + shift + O �i�H�ֳtimport
		strSet.add("A");
		strSet.add("C");
		strSet.add("A");
		strSet.add("B");
		strSet.add("F");
		strSet.add("D");
		strSet.add("E");
		strSet.add("B");

		// �L�X���e
		for (String item : strSet) {
			System.out.println(item);
		}
	}

	@Test
	public void treeSetTest() {
		// treeSet
		// 1. �����\���Ƥ���(�ۦP�����u�|�O�d�@��)
		// 2. �Ѥp��j�Ƨ�(��r�̷�ASCII code�h�Ƨ�)
		Set<String> strSet = new TreeSet<>(); // ctrl + shift + O �i�H�ֳtimport
		strSet.add("A");
		strSet.add("C");
		strSet.add("A");
		strSet.add("B");
		strSet.add("F");
		strSet.add("D");
		strSet.add("E");
		strSet.add("B");

		// �L�X���e
		for (String item : strSet) {
			System.out.println(item);
		}
	}

	@Test
	public void quiz1() {
//		���D:	
//		 �H������ 5 �� 1~10 �����ƪ��Ʀr
//		  �@�w�n���� 5 �ӼƦr
//		  �L�X�̤j�M�̤p���Ʀr
//		  �L�X�Ѥp�ƨ�j�Ҧ��Ʀr
//		  �L�X�Ѥj�ƨ�p�Ҧ��Ʀr

		Set<Integer> num = new TreeSet<>();

		// �Ѥp��j

		// ��k1: �ϥ�TreeSet
		while (num.size() < 5) {
			num.add((int) ((Math.random() * 10) + 1));
		}

		for (int item : num) {
			System.out.println(item);
		}

		System.out.println("=============================================");
		// �Ѥj��p

		// ��k1: �নList
		List<Integer> item = new ArrayList<>(num);
		for (int i = (num.size() - 1); i >= 0; i--) {
			System.out.println(item.get(i));
		}

		// ��k2: �ϥ�.toArray()
//		Object[] item2 = num.toArray();
//		for (int i = (num.size() - 1); i >= 0; i--) {
//			System.out.println(item2.get(i));
//		}

		// ��k3: �ϥ�Collections.reverse() ���ऺ�e
//		Collections.reverse(item);
//		System.out.println(item);

		// ��k4: �ϥ�descendingSet() ����
	}

	@Test
	public void mapTest() {
		// Map<key ����ƫ��A, value ����ƫ��A>
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		// �ϥ� get(key��) �q�L key �N������ value ���X
		String str = map.get(2);
		System.out.println(str);
		// �M��: �ϥ� foreach �N map ���� key-value ���X
		// �N map �ন entrySet , item �N�O�]�t�F key �M value , �i�H�ϥ� getKey �M getValue ����
		for (Entry<Integer, String> item : map.entrySet()) {
			System.out.println("key  : " + item.getKey());
			System.out.println("value: " + item.getValue());
		}
		System.out.println("=============================");
		// �N map �ন keySet , �C�� item �N��ܤ@�� key , �z�L get(item) �N������ value ���X
		for (Integer item : map.keySet()) {
			System.out.println("key  : " + item);
			System.out.println("value: " + map.get(item));
		}

		// �쥻 map �� , �w�s�b key = 1 �H�ι����� value = A
		// �{�b�b�ۦP1����m��J D , key=1 ��۹����� value �|�ܦ� D(key�ۦP,������value��\�e)
		map.put(1, "E");
		// ���P�� key , �i�H���ۦP�Τ��P������ value
		map.put(5, "E");
		map.put(0, "E");
		// containsKey �O�_���� key ��
		System.out.println(map.containsKey(1));
		// containsValue �O�_�O�o�� Value ��
		System.out.println(map.containsValue("E"));

		System.out.println("=============================");
		for (Entry<Integer, String> item : map.entrySet()) {
			System.out.println("key  : " + item.getKey());
			System.out.println("value: " + item.getValue());
		}
	}

	@Test
	public void mapTest2() {
		// key-value �O 1��1
		Map<Integer, String> map = new HashMap<>();
		// key-value �O 1��h
		Map<Integer, String[]> map2 = new HashMap<>();
		Map<Integer, List<String>> map3 = new HashMap<>();
		Map<Integer, Set<String>> map4 = new HashMap<>();
		Map<Integer, Map<Integer, String>> map5 = new HashMap<>();
	}

	@Test
	public void test3() {
		// isEmpty() : �߰ݶ��X�άO Map �� size �O�_�� 0(�Ū�)
		List<String> list = new ArrayList<>();
		System.out.println("list�O�_�S�����e��: " + list.isEmpty());

		Set<String> set = new HashSet<>();
		System.out.println("set�O�_�S�����e��: " + set.isEmpty());

		Map<Integer, String> map = new HashMap<>();
		System.out.println("map�O�_�S�����e��: " + map.isEmpty());

		// =============
		List<String> list2 = null;
		// �]�� list2 �O null , �ҥH�L�k�ϥ� null �z�L .��k() �Ӱ���{�� , �|����
		// �U��{���X�|�� NullPointerException(�ū��w���~)
		System.out.println("list2�O�_�S�����e��: " + list2.isEmpty());
	}

	@Test
	public void quiz() {
//		��Ƥ��M
//		 ���w�@�Ӿ�Ʋ� nums �M�@�Ӿ�ƥؼЭ� target�A�Цb�ӼƲդ���X�M���ؼ�
//		�Ȫ���ӼƦr�A�ê�^�Ө�Ƥ� index
//		 �ۦP��m���ƭȤ���ۥ[
//		 �ϥ� Map �� containsKey(key)
//		 �Ҧp:
//		 nums = [2, 7, 11, 15]�Ftarget = 9
//		 ��X���G�� [0, 1]�F�]�� 2+7 = 9�A2 �M 7 �b nums ���� index ���O�� 0 �M 1

		// �c�Q : �ؼ� - ���� = �Ѿl�� , �b��l���������۹������Ѿl��
		// 1.�N�}�C�����������X�� , ��J TreeMap �� key �� , value ���y���� 0 ~ n
		// 2.�����ثe������m�A�p�G��e���� - �ؼЫ������Ѿl�Ȩϥ� containsValue �p�G�� ture �N�ì�����m , �^�Ǩ�Ӭ�������m
		// 3.�e���U�@�Ӥ����᭫�Ʋ� 2�B�J

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

		System.out.println("�S����ۥ[��: " + target + " ����ӼƦr");
	}

	@Test
	public void quiz2() {
//		��Ƥ��M
//		 ���w�@�Ӿ�Ʋ� nums �M�@�Ӿ�ƥؼЭ� target�A�Цb�ӼƲդ���X�M���ؼ�
//		�Ȫ���ӼƦr�A�ê�^�Ө�Ƥ� index
//		 �ۦP��m���ƭȤ���ۥ[
//		 �ϥ� Map �� containsKey(key)
//		 �Ҧp:
//		 nums = [2, 7, 11, 15]�Ftarget = 9
//		 ��X���G�� [0, 1]�F�]�� 2+7 = 9�A2 �M 7 �b nums ���� index ���O�� 0 �M 1

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
//		��Ƥ��M
//		 ���w�@�Ӿ�Ʋ� nums �M�@�Ӿ�ƥؼЭ� target�A�Цb�ӼƲդ���X�M���ؼ�
//		�Ȫ���ӼƦr�A�ê�^�Ө�Ƥ� index
//		 �ۦP��m���ƭȤ���ۥ[
//		 �ϥ� Map �� containsKey(key)
//		 �Ҧp:
//		 nums = [2, 7, 11, 15]�Ftarget = 9
//		 ��X���G�� [0, 1]�F�]�� 2+7 = 9�A2 �M 7 �b nums ���� index ���O�� 0 �M 1

		int[] nums = { 2, 7, 11, 15, 2 };
		int target = 9;
		Map<Integer, Integer> map = new HashMap<>();
		int[] anser = new int[2];

		for (int i = 0; (i < nums.length); i++) {
			int complement = target - nums[i]; // �n�䪺�Ʀr = �ؼмƦr - ��e�}�C�Ʀr
			if (map.containsKey(complement)) { // �p�G map ���� "�n�䪺�Ʀr"
				anser[0] = i;
				anser[1] = map.get(complement);
				System.out.println(Arrays.toString(anser));
				return;
			}
			map.put(nums[i], i);				// �p�G�S���ǰt�N�� ( ��e�}�C�Ʀr, ��e�}�C��m ) ��J map ��  
		}
		System.out.println("�S�����T����");
	}
}

package org.duohuo.enhance;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 增强for 循环
 * @author apple
 *
 */
public class demo4 {
	//遍历数组
	public static void printArray(int[] a){
		for(int temp:a){
			System.out.println(temp);
		}
	}
	
	//遍历list集合
	public static void printList(List<String> list){
		for(String temp:list){
			System.out.println(temp);
		}
	}
	
	//遍历map集合
	public static void printMap(Map<Integer,String> map){
		Set<Map.Entry<Integer, String>> set = map.entrySet();
		for(Map.Entry<Integer, String> temp : set){
			Integer key = temp.getKey();
			String value = temp.getValue();
			System.out.println(key+"="+value);
		}
	}
	
	public static void main(String[] args) {
//		printArray(new int[] {1,2,3});
		
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		printList(list);
		
		Map<Integer,String> map = new LinkedHashMap<Integer,String>();
		map.put(1, "aaa");
		map.put(2, "bbb");
		map.put(3, "ccc");
		printMap(map);
		
	}
}

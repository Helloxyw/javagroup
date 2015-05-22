package org.duohuo.enhance;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class demo6 {
	/**
	 * 输出任意集合数据的方法,通配符
	 */
	public static void printCollection(Collection<?> coll){
		for(Object temp:coll){
			System.out.println(temp);
		}
	}
	
	public static void printCollection2(Collection<? extends Number> coll){
		for(Object temp:coll){
			System.out.println(temp);
		}
	}
	
	public static void main(String[] args) {
//		 List<String> list= new ArrayList<String>();
//		 list.add("a");
//		 list.add("b");
//		 list.add("c");
//		 printCollection(list);
		List<Number> list= new ArrayList<Number>();
		list.add(1);
		list.add(2);
		list.add(3);
		printCollection2(list);
		
	}
	
}

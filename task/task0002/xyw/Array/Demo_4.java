package com.Array;

import java.util.ArrayList;
import java.util.Collections;

/*	ArrayList 
	动态数组，array的复杂版本
 	动态的增加和减少元素
	实现了ICollection和IList接口
	灵活的设置数组的大小

 */

public class Demo_4 {
	public static void main(String[] args) {
		ArrayList arraylist=new ArrayList();  
		arraylist.add("A");					   
		arraylist.add("B");
		arraylist.add("C");
		arraylist.add("D");
		arraylist.add("E");
		System.out.println("Before Reverse Order: " + arraylist);
		Collections.reverse(arraylist);
		System.out.println("After Reverse Order: " + arraylist);
		
	}

}

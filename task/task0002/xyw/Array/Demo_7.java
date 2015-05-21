package com.Array;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;


public class Demo_7 {
	public static void main(String[] args) {
		String a[]={"A","E","I"};
		String b[]={"O","U"};
		List list=new ArrayList(Arrays.asList(a));
		list.addAll(Arrays.asList(b));
		Object []c=list.toArray();
		System.out.println(Arrays.toString(c));
	}
}

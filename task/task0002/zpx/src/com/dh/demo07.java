package com.dh;

import java.util.*;

public class demo07 {

	public static void main(String[] args) {
	      String a[] = { "A", "E", "I" };
	      String b[] = { "B", "U" };
	      List list = new ArrayList(Arrays.asList(a));
	      list.addAll(Arrays.asList(b));
	      Object[] c = list.toArray();
	      System.out.println(Arrays.toString(c));

	}

}

package com.Array;

import java.util.ArrayList;

public class Demo_11 {
	public static void main(String[] args) {
		ArrayList objArray=new ArrayList();
		objArray.clear();
		objArray.add(0,"0th element");
		objArray.add(1,"1th element");
		objArray.add(2,"2th element");
		System.out.println("Array before removing an element"+objArray);
		objArray.remove(1);
		objArray.remove("0th element");
		System.out.println("Array after removing an element"+objArray);
	}

}

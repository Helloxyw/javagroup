package com.Array;

import java.util.Arrays;

public class Demo_15 {
	public static void main(String[] args) {
		int []ary={1,2,3,4,5,6};
		int []ary1={1,2,3,4,5,6};
		int []ary2={1,2,3,4};
		System.out.println("Is array1 equals array2??"+Arrays.equals(ary,ary1));
		System.out.println("Is array1 equals array3??"+Arrays.equals(ary,ary2));
		
	}

}

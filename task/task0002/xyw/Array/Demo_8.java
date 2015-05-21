package com.Array;

import java.util.Arrays;

public class Demo_8 {
	public static void main(String[] args) {
		int array[]=new int[6];
		Arrays.fill(array,100);
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
		System.out.println();
		Arrays.fill(array,3,6,60);
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}

}

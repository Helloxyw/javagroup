package com;

public class SearchlastString {
	public static void main(String[] args) {
		String strOrig="Hello world ,Hello Reader";
		int lastIndex=strOrig.lastIndexOf("Hello");
		if(lastIndex==-1){
			System.out.println("Hello not found1");
		}else{
			System.out.println("Last ocurrence of Hello is at index "+lastIndex);
		}
	}

}

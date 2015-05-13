package org.duohuo.string;

public class RemoveCharacter {
	public static void main(String args[]) {
	      String str = "this is Java";
	      System.out.println(removeCharAt(str, 3));
	   }
	
	//将原来的字符串分成2个字符串，再进行拼接
	   public static String removeCharAt(String s, int pos) {
	      return s.substring(0, pos) + s.substring(pos + 1);
	   }
}


/*
thi is Java
*/
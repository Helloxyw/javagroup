package com;

public class Demo03 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
	      String str = "this is Java";
	      System.out.println(removeCharAt(str, 3));
	   }
	   public static String removeCharAt(String s, int pos) {
	      return s.substring(0, pos) + s.substring(pos + 1);
	   }
	}


package com;

public class Demo01 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
	      String str = "Hello World";
	      String anotherString = "hello world";
	      Object objStr = str;

	      System.out.println( str.compareTo(anotherString) );
	      System.out.println( str.compareToIgnoreCase(anotherString) );
	      System.out.println( str.compareTo(objStr.toString()));
	}

}

package com;

public class Compare{
	   public static void main(String args[]){
	      String str = "Hello World";
	      String anotherString = "hello world";
	      Object objStr = str;

	      System.out.println( str.compareTo(anotherString) );
	      //���Դ�Сд
	      System.out.println( str.compareToIgnoreCase(anotherString) );
	      System.out.println( str.compareTo(objStr.toString()));
	   }
	}

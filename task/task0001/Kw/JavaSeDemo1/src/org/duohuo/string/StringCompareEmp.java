package org.duohuo.string;

public class StringCompareEmp{
	   public static void main(String args[]){
	      String str = "Hello World";
	      String anotherString = "hello world";
	      Object objStr = str;

	      //ASCII码中，大小写字母相差32
	      System.out.println( str.compareTo(anotherString) );
	      //忽略大小写
	      System.out.println( str.compareToIgnoreCase(anotherString) );
	      //将对象类型转换成字符串类型
	      System.out.println( str.compareTo(objStr.toString()));
	   }
	}


/*
-32
0
0
*/
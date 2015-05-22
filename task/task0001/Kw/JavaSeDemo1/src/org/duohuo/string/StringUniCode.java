package org.duohuo.string;

public class StringUniCode{
	   public static void main(String[] args){
	      String test_string="Welcome to TutorialsPoint";
	      System.out.println("String under test is = "+test_string);
	      System.out.println("Unicode code point at" 
	      +" position 5 in the string is = "
	      +  test_string.codePointBefore(5));
	   }
	}

/*
String under test is = Welcome to TutorialsPoint
Unicode code point at position 5 in the string is = 111
*/
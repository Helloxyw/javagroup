package org.duohuo.string;

public class StringReplaceEmp{
	   public static void main(String args[]){
	      String str="Hello World";
	      System.out.println( str.replace( 'H','W' ) );
	      System.out.println( str.replaceFirst("He", "Wa") );
	      System.out.println( str.replaceAll("He", "Ha") );
	   }
	}

/*
Wello World
Wallo World
Hallo World
*/

package com;

public class Demo02 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
	      String strOrig = "Hello world ,Hello Reader";
	      int lastIndex = strOrig.lastIndexOf("Hello");
	      if(lastIndex == - 1){
	         System.out.println("Hello not found");
	      }else{
	         System.out.println("Last occurrence of Hello  is at index "+ lastIndex);
	      }
	}

}

package com.dh;

import java.util.ArrayList;

public class demo14 {

	public static void main(String[] args) {
	      ArrayList objArray = new ArrayList();
	      ArrayList objArray2 = new ArrayList();
	      objArray2.add(0,"common1");
	      objArray2.add(1,"common2");
	      objArray2.add(2,"notcommon");
	      objArray2.add(3,"notcommon1");
	      objArray.add(0,"common1");
	      objArray.add(1,"common2");
	      System.out.println("Array elements of array1"+objArray);
	      System.out.println("Array elements of array2"+objArray2);
	      System.out.println("Array 1 contains String common2?? "
	      +objArray.contains("common1"));
	      System.out.println("Array 2 contains Array1?? "
	      +objArray2.contains(objArray) );
	      //here may equals to containsAll 

	}

}

package com.zpf.org;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.*;
/*public class Arryexam {
	public static void main(String args[]) throws Exception {
	      int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
	      Arrays.sort(array);
	      printArray("Sorted array", array);
	      int index = Arrays.binarySearch(array, 2);
	      System.out.println("Found 2 @ " + index);
	   }
	   private static void printArray(String message, int array[]) {
	      System.out.println(message
	      + ": [length: " + array.length + "]");
	      for (int i = 0; i < array.length; i++) {
	         if(i != 0){
	            System.out.print(", ");
	         }
	         System.out.print(array[i]);                     
	      }
	      System.out.println();
	   }//从小到大排序
}

public class Arryexam {
	   public static void main(String args[]) throws Exception {
	      int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
	      Arrays.sort(array);
	      printArray("Sorted array", array);
	      int index = Arrays.binarySearch(array, 1);
	      System.out.println("Didn't find 1 @ "
	      + index);
	      int newIndex = -index - 1;
	      array = insertElement(array, 1, newIndex);
	      printArray("With 1 added", array);
	   }
	   private static void printArray(String message, int array[]) {
	      System.out.println(message
	      + ": [length: " + array.length + "]");
	      for (int i = 0; i < array.length; i++) {
	         if (i != 0){
	            System.out.print(", ");
	         }
	         System.out.print(array[i]);         
	      }
	      System.out.println();
	   }
	   private static int[] insertElement(int original[],
	   int element, int index) {
	      int length = original.length;
	      int destination[] = new int[length + 1];
	      System.arraycopy(original, 0, destination, 0, index);
	      destination[index] = element;
	      System.arraycopy(original, index, destination, index
	      + 1, length - index);
	      return destination;
	   }
	}//先从小到大排序，再插入一个，按顺序插入
public class Arryexam {
	   public static void main(String args[]) {
	      String[][] data = new String[2][5];
	      System.out.println("Dimension 1: " + data.length);
	      System.out.println("Dimension 2: " + data[0].length);
	   }//输出数组的长与宽
	}
public class Arryexam {
	   public static void main(String[] args) {
	      ArrayList arrayList = new ArrayList();
	      arrayList.add("A");
	      arrayList.add("B");
	      arrayList.add("C");
	      arrayList.add("D");
	      arrayList.add("E");
	      System.out.println("Before Reverse Order: " + arrayList);
	      Collections.reverse(arrayList);
	      System.out.println("After Reverse Order: " + arrayList);
	   }//按字典顺序从后往前排序
	}
public class Arryexam {
	   public static void main(String[] args){
	      String[] greeting = new String[3];
	      greeting[0] = "This is the greeting";
	      greeting[1] = "for all the readers from";
	      greeting[2] = "Java Source .";
	      for (int i = 0; i < greeting.length; i++){
	         System.out.println(greeting[i]);
	      }
	   }
	}//输出字符串数组

public class Arryexam {
	   public static void main(String[] args) {
	      Integer[] numbers = { 8, 2, 7, 1, 4, 9, 5};
	      int min = (int) Collections.min(Arrays.asList(numbers));
	      int max = (int) Collections.max(Arrays.asList(numbers));
	      System.out.println("Min number: " + min);
	      System.out.println("Max number: " + max);
	   }
	}//检索数组中最大与最小
	
public class Arryexam {
	   public static void main(String args[]) {
	      String a[] = { "A", "E", "I" };
	      String b[] = { "O", "U" };
	      List list = new ArrayList(Arrays.asList(a));
	      list.addAll(Arrays.asList(b));
	      Object[] c = list.toArray();
	      System.out.println(Arrays.toString(c));
	   }
	}//将两个字符数组合并
	
public class Arryexam {
	   public static void main(String args[]) {
	      int array[] = new int[6];
	      Arrays.fill(array, 100);
	      for (int i=0, n=array.length; i < n; i++) {
	         System.out.println(array[i]);
	      }
	      System.out.println();
	      Arrays.fill(array, 3, 6, 50);
	      for (int i=0, n=array.length; i< n; i++) {
	         System.out.println(array[i]);
	      }
	   }
	}//从后往前数极为改变
	
public class Arryexam {
	   public static void main(String[] args) {
	      String[] names = new String[] { "A", "B", "C" };
	      String[] extended = new String[5];
	      extended[3] = "D";
	      extended[4] = "E";
	      System.arraycopy(names, 0, extended, 0, names.length);
	      for (String str : extended){
	         System.out.println(str);
	      }
	   }
	}//往数组中新增
	
public class Arryexam {
	   public static void main(String[] args)  {
	      ArrayList objArray = new ArrayList();
	      objArray.clear();
	      objArray.add(0,"0th element");
	      objArray.add(1,"1st element");
	      objArray.add(2,"2nd element");
	      System.out.println("Array before removing an element"+objArray);
	      objArray.remove(1);
	      objArray.remove("0th element");
	      System.out.println("Array after removing an element"+objArray);
	   }
	}//添加与删除
	
public class Arryexam {
	   public static void main(String[] args)  {
	      ArrayList objArray = new ArrayList();
	      ArrayList objArray2 = new ArrayList();
	      objArray2.add(0,"common1");
	      objArray2.add(1,"common2");
	      objArray2.add(2,"notcommon");
	      objArray2.add(3,"notcommon1");
	      objArray.add(0,"common1");
	      objArray.add(1,"common2");
	      objArray.add(2,"notcommon2");
	      System.out.println("Array elements of array1" +objArray);
	      System.out.println("Array elements of array2" +objArray2);
	      objArray.removeAll(objArray2);
	      System.out.println("Array1 after removing array2 from array1"+objArray);
	   }
	}//移除另一个
	
public class Arryexam {
	   public static void main(String[] args)  {
	      ArrayList objArray = new ArrayList();
	      ArrayList objArray2 = new ArrayList();
	      objArray2.add(0,"common1");
	      objArray2.add(1,"common2");
	      objArray2.add(2,"notcommon");
	      objArray2.add(3,"notcommon1");
	      objArray.add(0,"common1");
	      objArray.add(1,"common2");
	      objArray.add(2,"notcommon2");
	      System.out.println("Array elements of array1"+objArray);
	      System.out.println("Array elements of array2"+objArray2);
	      objArray.retainAll(objArray2);
	      System.out.println("Array1 after retaining common elements of array2 & array1"+objArray);
	   }
	}//如何找到共同来自两个数组的元素并将它们存储在一个数组中

public class Arryexamn {
	   public static void main(String[] args)  {
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
	      System.out.println("Array 2 contains Array1?? "+objArray2.contains(objArray) );
	   }
	}//搜索一个字符数组	
	
public class Arryexamn {
	   public static void main(String[] args) throws Exception {
	      int[] ary = {1,2,3,4,5,6};
	      int[] ary1 = {1,2,3,4,5,6};
	      int[] ary2 = {1,2,3,4};
	      System.out.println("Is array 1 equal to array 2?? "+Arrays.equals(ary, ary1));
	      System.out.println("Is array 1 equal to array 3?? "+Arrays.equals(ary, ary2));
	   }
	}//比较两个数组是否相等
	*/
public class Arryexamn {
	   public static void main(String[] args) throws Exception {
	      int[] ary = {1,2,3,4,5,6};
	      int[] ary1 = {1,2,3,4,5,6};
	      int[] ary2 = {1,2,3,4};
	      System.out.println("Is array 1 equal to array 2?? "
	      +Arrays.equals(ary, ary1));
	      System.out.println("Is array 1 equal to array 3?? "
	      +Arrays.equals(ary, ary2));
	   }
	}//比较两数组
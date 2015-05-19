package org.duohuo.enhance;
/**
 * Integer类
 * @author apple
 *
 */
public class demo3 {
	public static void getMethod(){
		//创建类对象
		Integer i1 = new Integer(12);
//		int i2 = i1.intValue();
		int i2 = i1; //自动拆箱
		System.out.println(i2+1);
		//转换成字符串
		String str1 = i1.toString();
		System.out.println(str1+1);
	}
	public static void main(String[] args) {
		getMethod();
	}
}

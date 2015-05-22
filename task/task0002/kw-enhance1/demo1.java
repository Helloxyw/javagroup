package org.duohuo.enhance;

import static java.lang.Math.random;
import static java.lang.Math.ceil;
import static java.lang.Math.PI;
import static java.lang.System.out;
public class demo1 {
	//求一个任意半径的圆形的面积
	public static void getArea(){
		//半径
		double r = ceil(random()*10);
		//算面积
		double area = 0.0;
		area = PI*r*r;
		//打印面积
		out.println("半径为"+r+"的圆的面积是："+area);
	}
	public static void main(String[] args) {
		
		getArea();	
	
	}
	
}

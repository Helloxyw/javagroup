package org.duohuo.enhance;

/**
 * 求任意整相加
 * @author apple
 *
 */
public class demo2 {
	public static long getsum(int... is){
		long sum = 0;
		for (int i = 0; i < is.length; i++) {
			sum += is[i];
		}
		return sum;
		
	}
	public static void main(String[] args) {
		System.out.println(getsum(1,2,3));
	}
}

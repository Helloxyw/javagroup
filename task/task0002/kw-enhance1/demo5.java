package org.duohuo.enhance;

public class demo5 {
	/**
	 * 该方法返回任意数据类型的数据
	 * @param t
	 * @return
	 */
	public static <T> T returnType(T t){
		return t;
	}
	public static void main(String[] args) {
		returnType(7);
		System.out.println(returnType(7) instanceof Integer);
	}
}

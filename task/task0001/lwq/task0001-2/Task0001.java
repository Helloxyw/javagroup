package com.dh.task0001;

public class Task0001 {
	public static void main(String[] args) {
		//比较字符串
		String str = "abcd";
		String anotherStr = "aBcD";
		Object obj = str;
		
		/*System.out.println(str.compareTo(anotherStr));//'b'-'B'
		System.out.println(str.compareTo("Cabd"));
		System.out.println(str.compareTo("abcde"));
		System.out.println(str.compareTo("abc"));
		System.out.println(str.compareToIgnoreCase(anotherStr));
		System.out.println(str.compareTo(obj.toString()));
		*/
		/**compareTo()方法总结：
		*	有不同，'b'-'B'
		*	不同    'a'-'C'
		*	"abcd".length()-"abcde".length()
		*
		*/

		//获得子字符串在字符串中的位置
		/*String str2 = "abcdcd ecd";
		System.out.println(str2.indexOf("cd"));
		System.out.println("acbddcsd".indexOf("cd"));
		System.out.println(str2.lastIndexOf("cd"));
		System.out.println("acbddcsd".lastIndexOf("cd"));
		/**
		 *lastIndexOf()& indexOf()....没有返回-1，有返回索引
		 */
		
		//remove a char from a unique character
		//1.substring() method.
		/*System.out.println("abcde".substring(2));
		System.out.println("abcde".substring(1, 3));
		//2.remove a 	specific char from string by substring() method/function
		System.out.println("abcde".substring(0, 1) + "abcde".substring(2));
		*/
		
		//replace() method for replacing string or char
		/*System.out.println("ababcdcdefe".replace('a', 'b'));//replace all char 'a'
		System.out.println("ababcdcdefe".replace("ab", "gh"));//replace all sunstring "ab"
		System.out.println("ababcdcdefe".replaceFirst("ab", "gh"));
		System.out.println("ababcdcdefe".replaceAll("a", "pdf"));*/
		
		//reverse string
		/*StringBuffer sb = new StringBuffer("abcdef");
		String reverse = sb.reverse().toString();
		System.out.println(reverse);*/
		
		//indexOf() return index of substring in string
		/*System.out.println("abcdef".indexOf("ef"));
		System.out.println("abcdef".indexOf("fd"));*/
		
		//splite() method 
		//System.out.println("ab-cd-ef".sp);
	}
}
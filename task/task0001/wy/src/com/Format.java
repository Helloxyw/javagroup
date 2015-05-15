package com;

import java.util.*;
public class Format {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double e = Math.E;
	      System.out.format("%f%n", e);
	      System.out.format(Locale.GERMANY, "%-10.4f%n%n", e);
	}

}

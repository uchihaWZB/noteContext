package com.itcast.cn;

public class demom {

	public static void main(String[] args) {
			int a=35;
			
			System.out.println(convert(a));
	}

	public static String convert(int a) {
		String b = a + "";
		double result = 0;
		for (int i = 0; i < b.length(); i++) {
			int c = Integer.parseInt(String.valueOf(b.charAt(i)));
			result = result + Math.pow(7, b.length() - 1 - i) * c;
		}

		return String.valueOf(result);
	}

}

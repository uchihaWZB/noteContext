package com.itcast.cn;

public class demo10 {

	public static void main(String[] args) {
		String s = "aBxyZ";
		change(s);

	}

	private static void change(String s) {
		char tmp;
		StringBuffer sb= new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'z') {
				tmp = 'a';
			} else if (s.charAt(i) == 'Z') {
				tmp = 'A';
			} else {
				tmp = (char) (s.charAt(i) + 1);
			}
			sb.append(tmp);
		}
		System.out.println(sb);
	}
}

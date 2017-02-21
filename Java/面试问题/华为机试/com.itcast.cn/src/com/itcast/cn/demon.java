package com.itcast.cn;

public class demon {

	public static void main(String[] args) {
		String a="hello    world   skks";
		String b=a.replaceAll(" +", " ");
		System.out.println(b);
		String s = "asdasdassd";
		System.out.println(s.replaceAll("[ad]", ""));
		
	}

}

package com.itcast.cn;

import java.util.HashMap;
import java.util.Map;

public class demo6 {

	public static void main(String[] args) {
		String a = "aaabbbccc";
		count(a);
	}

	private static void count(String a) {
		String reg = "[a-z]{1,}";
		if (a.matches(reg)) {
			HashMap<Character, Integer> hm = new HashMap<>();
			char[] c = a.toCharArray();

			for (int i = 0; i < c.length; i++) {
				if (!hm.containsKey(c[i])) {
					hm.put(c[i], 1);
				} else {
					hm.put(c[i], hm.get(c[i]) + 1);
				}
			}
			for(Map.Entry me:hm.entrySet()){
				System.out.println(me.getKey()+":"+me.getValue());
			}

		}
	}
}

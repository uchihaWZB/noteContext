package com.itcast.cn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class demo13 {

	public static void main(String[] args) {
		String s = "aaassssddd";
		delete(s);
		delete2(s);
	}

	private static void delete2(String s) {
		StringBuilder sb = new StringBuilder();
		HashMap<Character, Integer> hm = new HashMap<>();
		int flag;
		for (int i = 0; i < s.length(); i++) {
			if (!hm.containsKey(s.charAt(i))) {
				hm.put(s.charAt(i), 1);
			} else {
				hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
			}
		}

		List<Map.Entry<Character, Integer>> entry = new ArrayList<>(
				hm.entrySet());
		Collections.sort(entry,
				new Comparator<Map.Entry<Character, Integer>>() {

					@Override
					public int compare(Entry<Character, Integer> o1,
							Entry<Character, Integer> o2) {
						// …˝–Ú≈≈¡–
						return o1.getValue().compareTo(o2.getValue());
					}

				});
		sb.append(entry.get(0).getKey());
		for (int i = 0; i < entry.size() - 1; i++) {

			if (entry.get(i).getValue() == entry.get(i + 1).getValue()) {
				sb.append(entry.get(i+1));
				
			}else break;
		}
		String reg="["+sb.toString()+"]";
		System.out.println(s.replaceAll(reg, ""));
	}

	private static void delete(String s) {
		StringBuffer sb = new StringBuffer();
		StringBuffer result = new StringBuffer();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (!hm.containsKey(s.charAt(i))) {
				hm.put(s.charAt(i), 1);
			} else {
				hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
			}
		}
		char[] c = s.toCharArray();
		int min = hm.get(s.charAt(0));
		for (Map.Entry me : hm.entrySet()) {
			if ((int) me.getValue() < min) {
				min = (int) me.getValue();
			}
		}
		for (Map.Entry me : hm.entrySet()) {
			if ((int) me.getValue() == min) {
				sb.append(me.getKey());
			}
		}
		// System.out.println(sb);
		// String reg = "[" + sb.toString() + "]";
		// System.out.println(s.replaceAll(reg, ""));
	}
}

package com.itcast.cn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class demo19 {
	public static void main(String[] args) {
		String s = "ababs";
		find(s);
	}

	private static void find(String s) {
		Map<String, Integer> m = new HashMap<String, Integer>();
		StringBuilder sb = new StringBuilder();
		char[] arr = s.toCharArray();
		// i������Ҫ�Ҵ�1-4���ַ� j����ÿ���ַ����±�
		for (int i = 0; i < s.length() - 1; i++) {
			// ��Ҫ�鼸�����ֵ���� ��i=1 ��Ҫ��0,1 1,2 2,3
			int times = s.length() - i;
			// ���ĳ���
			int d = i + 1;
			for (int j = 0; j < times; j++) {
				sb.setLength(0);
				for (int k = j; k < d + j; k++) {
					sb.append(arr[k] + "");
				}
				if (m.containsKey(sb.toString())) {
					m.put(sb.toString(), m.get(sb.toString()) + 1);
				} else {
					m.put(sb.toString(), 1);
				}
			}

		}
		ArrayList<Entry<String, Integer>> al = new ArrayList<>(m.entrySet());
		Collections.sort(al, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1,
					Entry<String, Integer> o2) {
				return (Integer.valueOf(o1.getKey().length())).compareTo(o2
						.getKey().length());
			}
		});
		for (Map.Entry<String, Integer> me : m.entrySet()) {
			// System.out.println(me.getKey());
		}
		for (int i = 0; i < al.size(); i++) {
			System.out.print(al.get(i).getKey()+"  ");
		}
	}
}

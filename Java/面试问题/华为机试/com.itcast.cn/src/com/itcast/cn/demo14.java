package com.itcast.cn;

import java.util.ArrayList;
import java.util.Arrays;

public class demo14 {

	public static void main(String[] args) {
		int[] arr = { 2,3, 4, 8 };
		int[] newarr = get(arr);
		System.out.println(Arrays.toString(newarr));
	}

	private static int[] get(int[] arr) {
		int i = arr.length;
		ArrayList<Integer> al = new ArrayList<>();
		for (int a : arr) {
			int tmp = a;
			boolean flag;
			if (a < 2) {
				flag = false;
			} else {
				flag = true;
			}
			while (tmp >= 2) {
				if (tmp % 2 == 0) {
					tmp = tmp / 2;
				} else {
					flag = false;
					break;
				}
			}
			if (flag) {
				al.add(a);
			} else {
				i--;
			}
		}
		int[] res = new int[i];
		for (int j = 0; j < al.size(); j++) {
			res[j] = al.get(j);
		}
		return res;
	}

}

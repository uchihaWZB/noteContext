package com.itcast.cn;

import java.util.ArrayList;

public class demo11 {

	public static void main(String[] args) {
		String a = "abcabca";
		String b = "abcdabcdabcdabcd";
		String c = "abcabc";
		String d = "abcdab";
		System.out.println(match(a));
		System.out.println(match(b));
		System.out.println(match(c));
		System.out.println(match(d));
		
	}

	private static boolean match(String a) {
		int len = a.length();
		boolean result = true;
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 2; i <= len / 2; i++) {
			if (len % i == 0) {
				al.add(i);
			}
		}
//		如果长度是质数直接返回false
		if (al.size() == 0) {
			return false;
		}
//		如果不是质数 则遍历所有的约数
		for (int i = 0; i < al.size(); i++) {
			// j是总共有几组的重复 al.get(i)是每一组有几个
			result = true;
			int d = al.get(i);
			int j = len / al.get(i);
			// 假设6个数字母需要 上面得到的数i是2的时候 j是3需要检查0 2 4位置上面的字符是否一致 也就是需要检查两次
//			一次循环有一次失败就为false 然后进入下一轮循环 知道检查一次循环所有都为真
			for (int k = 0; k < j - 1; k++) {
				//
				for (int n = k * d; n < (k + 1) * d; n++) {
					if (a.charAt(n) != a.charAt(n + d)) {
						result = false;
						break;
					}
				}
				if(result){
//					遍历完所有的如果都符合就是重复单元组成的
					if(k==j-2) return true;
				}else break;

			}

		}
		return result;
	}

}

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
//		�������������ֱ�ӷ���false
		if (al.size() == 0) {
			return false;
		}
//		����������� ��������е�Լ��
		for (int i = 0; i < al.size(); i++) {
			// j���ܹ��м�����ظ� al.get(i)��ÿһ���м���
			result = true;
			int d = al.get(i);
			int j = len / al.get(i);
			// ����6������ĸ��Ҫ ����õ�����i��2��ʱ�� j��3��Ҫ���0 2 4λ��������ַ��Ƿ�һ�� Ҳ������Ҫ�������
//			һ��ѭ����һ��ʧ�ܾ�Ϊfalse Ȼ�������һ��ѭ�� ֪�����һ��ѭ�����ж�Ϊ��
			for (int k = 0; k < j - 1; k++) {
				//
				for (int n = k * d; n < (k + 1) * d; n++) {
					if (a.charAt(n) != a.charAt(n + d)) {
						result = false;
						break;
					}
				}
				if(result){
//					���������е���������Ͼ����ظ���Ԫ��ɵ�
					if(k==j-2) return true;
				}else break;

			}

		}
		return result;
	}

}

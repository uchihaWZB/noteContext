package com.itcast.cn;

public class demo18 {
	public static void main(String[] args) {
		String s="if(a.equals(a))";
		boolean b=match(s);
		System.out.println(b);
	}

	private static boolean match(String s) {
		char[] arr = s.toCharArray();
		int left=0;
		int right=0;
		for(char c:arr){
			if(c=='('){
				left++;
			}
			if(c==')'){
				right++;
			}
		}
		if(left!=right){
		return false;
		}else{
			return true;
		}
	}
}

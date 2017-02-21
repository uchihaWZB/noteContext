package com.itcast.cn;

public class demo1 {

	public static void main(String[] args) {
		String a="abcjsjsz";
		System.out.println(change(a));

	}

	private static String change(String a) {
		StringBuffer b=new StringBuffer();
		for(int i=0;i<a.length();i++){
		char tmp=(char)(a.charAt(i)+5);
		if(tmp>'z'){
			tmp=(char) (tmp-'z'+'a'-1);
		}
		
		b=b.append(tmp);
		}
		return b.toString();
	}

}

package com.itcast.cn;

public class demo4 {
	
	public static void main(String[] args) {
	int a=23332;
	boolean b=huiwen(a);
	System.out.println(b);
	}

	private static boolean huiwen(int a) {
		String b=String.valueOf(a);
		if(b.length()==1) return false;
		for(int i=0;i<b.length()/2;i++){
			if(b.charAt(i)!=b.charAt(b.length()-i-1)){
				return false;
			}
		}
		return true;
		
	}
}

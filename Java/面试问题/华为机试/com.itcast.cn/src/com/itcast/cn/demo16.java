package com.itcast.cn;

import java.util.Arrays;

public class demo16 {
	public static void main(String[] args) {
		int a=6;
		System.out.println(Arrays.toString(count(a)));
	}
	private static int[] count(int a) {
		int []arr ={0,0};
		char[] carr = Integer.toBinaryString(a).toCharArray();
		for(char c:carr){
			if(Integer.parseInt(c+"")==0){
				arr[0]++;
			}else{
				arr[1]++;
			}
		}
		return arr;
	}
	
	
}

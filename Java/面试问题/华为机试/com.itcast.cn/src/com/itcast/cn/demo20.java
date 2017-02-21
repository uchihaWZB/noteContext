package com.itcast.cn;

import java.util.Scanner;

public class demo20 {

	public static void main(String[] args) {
		String s="abc";
		Scanner sc=new Scanner(System.in);
		int i = sc.nextInt();
		String res=change(s,i);
		System.out.println(res);
	}

	private static String change(String s,int i) {
		char[] ca = s.toCharArray();
		StringBuilder sb= new StringBuilder();
		char temp;
		for(int j=0;j<i;j++){
			temp=ca[s.length()-1];
			for(int k=s.length()-2;k>=0;k--){
//				ΩªªªŒª÷√
				ca[k+1]=ca[k];
			}
			ca[0]=temp;
		}
		for(char c:ca){
			sb.append(c);
		}
		return sb.toString();
	}
	
}

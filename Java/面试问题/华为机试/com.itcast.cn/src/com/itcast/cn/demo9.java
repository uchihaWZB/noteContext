package com.itcast.cn;

import java.util.Scanner;

public class demo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console=new Scanner(System.in);
		String s=console.nextLine();
		String reg="[\\,\\.0-9]";
		
		String []m=s.split(reg);
		int maxnum=0;int maxindex=0;
		for(int i=0;i<m.length;i++){
			if(m[i].length()>maxnum){
				maxnum=m[i].length();
				maxindex=i;
				}
		}
		System.out.println(maxnum+"  "+m[maxindex]);
	}

}

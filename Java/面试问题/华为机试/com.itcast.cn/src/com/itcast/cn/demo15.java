package com.itcast.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class demo15 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s = sc.nextLine().trim();
		String[] sub = s.split(" +");
		String reg="[0-9]";
		boolean flag=true;
		System.out.println(Arrays.toString(sub));
		for(String temp:sub){
			if(!temp.matches(reg)){
				flag=false;
				System.out.println("input error");
			};
		}
		if(flag){
		circleOut(Integer.parseInt(sub[0]),Integer.parseInt(sub[1]));
		}
	}

	private static void circleOut(int data1, int data2) {
		int head=data2-1;
		int count=0;
		int j=0;
//		temp代表剩余人数
		int temp=data1;
		ArrayList<Integer> al=new ArrayList<>();
		ArrayList<Integer> res=new ArrayList<>();
		for(int i=0;i<data1;i++){
			al.add(i+1);
		}
		
		for	(count=0;count<data1;count++){
			head=(head+2)%al.size();
			res.add(al.remove(head));
			
		}
		for(int tt:res){
			System.out.println(tt);
		}
	
	}
}

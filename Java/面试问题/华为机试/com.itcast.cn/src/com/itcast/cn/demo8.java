package com.itcast.cn;

import java.util.ArrayList;

public class demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int [][]arrs={{5,6,1,16},{7,3,9}};
			findmin(arrs);
	}

	private static void findmin(int[][] arrs) {
		ArrayList<Integer> arr= new ArrayList<>();
		
		for(int i=0;i<arrs.length;i++){
			int min=arrs[i][0];
			for(int j=0;j<arrs[i].length;j++){
				if(arrs[i][j]<min){
					min=arrs[i][j];
				}
				
			}
			arr.add(min);
		}
		for(int i=0;i<arr.size();i++){
			System.out.println(arr.get(i));
			}
	}

}

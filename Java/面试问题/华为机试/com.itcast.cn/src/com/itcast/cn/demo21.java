package com.itcast.cn;

import java.util.ArrayList;

public class demo21 {

	public static void main(String[] args) {
		int [][]a={{4,3,32,5},{1,2,3,4},{9,6,5,4}};
		reverseRandom(a);
	}

	private static void reverseRandom(int[][] a) {
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length/2;j++){
				int tmp=a[i][j];
				a[i][j]=a[i][a[i].length-i-1];
				a[i][a[i].length-i-1]=tmp;
				}
		}
		ArrayList<Integer> al =new ArrayList<>();
		ArrayList<Integer> al2 =new ArrayList<>();
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				al.add(a[i][j]);
				}
		}
		int len=al.size();
		for(int i=0;i<len;i++){
			int r=(int)(Math.random()*al.size());
			al2.add(al.remove(r));
		}
		for(int i=0;i<len;i++){
			System.out.print(al2.get(i)+" ");
			if((i+1)%4==0){
				System.out.print("\n");
			}
		}
	}

}

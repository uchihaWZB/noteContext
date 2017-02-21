package com.itcast.cn;

public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a={1,2,3,4,1000};
		avgcount(a);
	}

	private static void avgcount(int[] a) {
		int sum=0;
		int small=0;
		int large=0;
		double avg=0;
		for(int i=0;i<a.length;i++){
			sum = sum + a[i];
		}
		avg = (double) sum/5;
		for(int i=0;i<a.length;i++){
			if(a[i]<avg){
				small++;
				
			}else{
				large++;
			}
		}
		System.out.println("average="+avg);
		System.out.println("small="+small);
		System.out.println("large="+large);
	}

	
}

package com.itcast.cn;


public class demo3 {

	public static void main(String[] args) {
		int []a={1,2,3,2,5,23,100,9,84};
		sort(a);
		
	}

	private static void sort(int[] a) {
		int temp;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]<a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int k=0;k<2;k++){
		System.out.println(a[k]);
		}
	}

}

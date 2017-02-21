package com.itcast.cn;

public class demo7 {

	public static void main(String[] args) {
		String s1 = "125555555590808080212";
		String s2 = "2929905066322325225";
		add2(s1,s2);
	}

	private static void add2(String s1, String s2) {
		String test;int tmp;boolean flag=true;
		StringBuffer sb=new StringBuffer();
		if(s1.length()<=s2.length()){
			test=s1;
			s1=s2;
			s2=test;
		}
//		²¹Áã
		while(s1.length()-s2.length()>0){
			s2="0"+s2;
			System.out.println(s1.length()-s2.length());
		}
		char[] c1=s1.toCharArray();
		char c2[]=s2.toCharArray();
		
		System.out.println(s1);
		System.out.println(s2);
		for(int i=s1.length()-1;i>=0;i--){
					if(flag){
					tmp=convert(c1[i])+convert(c2[i]);
					}else{
						tmp=convert(c1[i])+convert(c2[i])+1;
					}
					if(tmp>=10){
						tmp=tmp-10;
						flag=false;
					}else{
						flag=true;
					}
				sb.append(tmp);
				}
			test=sb.toString();	
		for(int i=test.length()-1;i>=0;i--){
			System.out.print(test.charAt(i));
		}
		
		
		
	}
	private static int convert(char c){
		return Integer.parseInt(String.valueOf(c));
	}
}

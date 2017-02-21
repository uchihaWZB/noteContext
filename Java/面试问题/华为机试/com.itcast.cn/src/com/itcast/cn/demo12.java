package com.itcast.cn;

public class demo12 {

	public static void main(String[] args) {
		String s = "yiersansanliu";
		translate(s);
	}

	public static void translate(String s) {
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(i+1<s.length()&&c=='y'&&s.charAt(i+1)=='i'){
				i++;
				sb.append("1");
			}else if(i+1<s.length()&&c=='e'&&s.charAt(i+1)=='r'){
				i++;
				sb.append("2");
			}else if(i+2<s.length()&&c=='s'&&s.charAt(i+1)=='a'&&s.charAt(i+2)=='n'){
				i=i+2;
				sb.append("3");
			}else if(i+1<s.length()&&c=='s'&&s.charAt(i+1)=='i'){
				i++;
				sb.append("4");
			}else if(i+1<s.length()&&c=='w'&&s.charAt(i+1)=='u'){
				i++;
				sb.append("5");
			}else if(i+1<s.length()&&i+2<s.length()&&c=='l'&&s.charAt(i+1)=='i'&&s.charAt(i+2)=='u'){
				i=i+2;
				sb.append("6");
			}else if(i+1<s.length()&&c=='q'&&s.charAt(i+1)=='i'){
				i++;
				sb.append("7");
			}else if(i+1<s.length()&&c=='b'&&s.charAt(i+1)=='a'){
				i++;
				sb.append("8");
			}else if(i+2<s.length()&&c=='j'&&s.charAt(i+1)=='i'&&s.charAt(i+1)=='u'){
				i+=2;
				sb.append("9");
			}else{
				sb=null;
				break;
			}
		}
		System.out.println(sb==null?"ÊäÈë·Ç·¨×Ö·û":sb);
	}
}

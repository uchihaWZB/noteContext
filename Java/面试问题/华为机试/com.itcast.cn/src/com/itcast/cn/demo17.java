package com.itcast.cn;

public class demo17 {

	public static void main(String[] args) {
		String s = "101";
		reverse(s);
		
	}

	private static void reverse(String s) {
		char[] c = s.toCharArray();
		StringBuilder sb= new StringBuilder();
		for (int i = 0; i < c.length; i++) {
			if(c[i]=='0'){
				sb.append("1");
			}else{
				sb.append("0");
			}
		}
//		n����ת��Ϊʮ���� ���÷���Integer.valueOf(String,����)��
		int sf= Integer.valueOf(sb.toString(), 2);
		System.out.println(sf);
	}

}

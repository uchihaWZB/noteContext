package com.itcast.cn;

public class demo5 {
//	ע����������������������ǿתʱһ����(int)(Math.random*����)����(int)Math.random*3 ��Ϊ����ֻ�����0

	public static void main(String[] args) {
		int count=1;
		for(int i=0;i<50;i++){
			
			System.out.print(ran()+" ");
			if(count%4==0){
				System.out.print("\n");
			}
			count++;
		}
	}

	private static String ran() {
		StringBuffer sb= new StringBuffer();
//		�������һ��4-10λ
		int length=4+(int)(Math.random()*7);
//		����λ�������ַ�����ƴ��
		for(int i=0;i<length;i++){
			int shuorzi=(int)(Math.random()*3);
			switch(shuorzi){
			case 0:
				int shuzi=(int)(Math.random()*10);
				sb.append(shuzi);
				break;
			case 1:
				char xiaozimu=(char)('a'+(int)(Math.random()*26));
				sb.append(xiaozimu);
				break;
			case 2:	
				char dazimu=(char)('A'+(int)(Math.random()*26));
				sb.append(dazimu);
				break;
			}
		}
		return sb.toString();
	}

}

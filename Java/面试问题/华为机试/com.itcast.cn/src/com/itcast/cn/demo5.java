package com.itcast.cn;

public class demo5 {
//	注意随机数产生器的随机数在强转时一定是(int)(Math.random*区间)不是(int)Math.random*3 因为后者只会产生0

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
//		随机产生一个4-10位
		int length=4+(int)(Math.random()*7);
//		根据位数产生字符并且拼接
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

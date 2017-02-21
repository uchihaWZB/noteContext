package com.itcast.cn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashmapDemo {

	public static void main(String[] args) {
		String s="asdasdasda";
		StringBuilder sb = new StringBuilder();
		HashMap<Character,Integer> hm = new HashMap();
		int min;
		char[] c = s.toCharArray();
		for(char ca:c){
			if(hm.containsKey(ca)){
				hm.put(ca,1+hm.get(ca));
			}else{
				hm.put(ca, 1);
			}
		}
		System.out.println("ÅÅÐòÇ°-------");
		min=hm.get(c[0]);
		for(Map.Entry me:hm.entrySet()){
			if(min>(int)me.getValue()) min=(int)me.getValue();
			System.out.println(me.getKey()+":"+me.getValue());
		}
		
		for(Map.Entry me:hm.entrySet()){
			if(min==(int)me.getValue()) sb.append(me.getKey());
		}
		String reg="["+sb.toString()+"]";
		System.out.println(s.replaceAll(reg, ""));
		System.out.println("ÅÅÐòºó-------");
		List<Map.Entry<Character,Integer>> list=new ArrayList(hm.entrySet());
		Collections.sort(list,new Comparator<Map.Entry<Character , Integer>>() {

			@Override
			public int compare(Entry<Character, Integer> o1,
					Entry<Character, Integer> o2) {
//				ÉýÐò
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).getKey()+":"+list.get(i).getValue());
		}
		
	}

}

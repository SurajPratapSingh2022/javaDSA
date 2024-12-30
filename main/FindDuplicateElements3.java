package com.dsa.main;
//hash table: find duplicate element
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
public class FindDuplicateElements3 {
	public static void main(String[] args) {
		int[]arr= {3,5,4,3,2,2,1,3,2};
		Map<Integer,Integer> hm=new HashMap<>();
		for(int no:arr) {
			Integer count = hm.get(no);
			if(count==null)
				hm.put(no,1);
			else {
				count=count+1;
				hm.put(no,count);
			}
		}
		System.out.print("duplicate elements are: ");
		Set<Map.Entry<Integer,Integer>> es=hm.entrySet();
		for(Map.Entry<Integer,Integer> me:es) {
			if(me.getValue()>1)
				System.out.print(me.getKey()+" ");
		}
	}
}

package com.dsa.main;
//set interface: find duplicate element
import java.util.Set;
import java.util.HashSet;
public class FindDuplicateElements2 {
	public static void main(String[] args) {
		int []arr= {3,5,4,3,2,2,1};
		System.out.println("duplicate elments are: ");
		Set<Integer> s=new HashSet<>();
		for(int no:arr) {
			boolean b=s.add(no);
			if(b==false)
				System.out.print(no+" ");
		}
	}
}

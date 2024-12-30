package com.dsa.main;
//string linear search array
public class LinearSearchString {
	public static void main(String[] args) {
		String []arr = {"deepak","rohit","rahul","deepansh","vironika","amit"};
		String item="rahul";
		int temp=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals(item)) {
				System.out.println("item present in "+i+"index position");
				temp=temp+1;
			}
		}
		if(temp==0)
			System.out.println("item not present in the list");
	}
}

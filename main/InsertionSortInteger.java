package com.dsa.main;
//Integer insertion sort array
public class InsertionSortInteger {
	public static void main(String[] args) {
		int []a = {5,1,6,2,4,3};
		int temp,j;
		for(int i=1; i<a.length; i++) {
			temp=a[i];
			j=1;
			while(j>0 && a[j-1]>temp) {
				a[j]=a[j-1];
				j=j-1;
			}
			a[j]=temp;
		}
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}
	}
}

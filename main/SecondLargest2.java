package com.dsa.main;
//case 2: second largest & smallest
public class SecondLargest2 {
	public static void main(String[] args) {
		int []a= {6,8,2,4,3,1,5,7,9};
		int largest=Integer.MIN_VALUE;
		int second_largest=Integer.MIN_VALUE;
//		int largest=Integer.MAX_VALUE;			//for max
//		int second_largest=Integer.MAX_VALUE; 	//for max
		for(int i=0; i<a.length; i++) {
//			if(a[i]<largest)	//for max
			if(a[i]>largest) {
				second_largest=largest;
				largest=a[i];
			}
//			else if(a[i] < second_largest && a[i] != largest) //for max
			else if(a[i] > second_largest && a[i] != largest)
				second_largest=a[i];
		}
//		if(second_largest==Integer.MAX_VALUE)	//for max
		if(second_largest==Integer.MIN_VALUE)
			System.out.println("there is no second largest element in the list");
		else
			System.out.println("second largest value is "+second_largest);
	}
}

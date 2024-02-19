package com.Array;

public class Demo {
	public static void main(String[] args) {
		// ARRAY DECLARATION
		int[]a;
		
		// ARRAY CREATION 
		a=new int[5];
		
		//PRINTING ARRAY ELEMENTS
		//System.out.println(a[0]);
		//System.out.println(a[1]);
		
		//ARRAY DECLARATION AND CREATION
		int[]a1=new int[5];
		//ARRAY INITIALIZATION
		/*a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;*/
		//PRINTING THE ELEMENTS WHICH ARE PRESENT IN A ARRAY
		/*System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);*/
		
		// ARRAY DECLARATION AND INITIALIZATION
		String s[]= {"one","two","three","four","five"};
		System.out.println("The length of array is: "+a.length);
		
		// USING FOR-EACH LOOP
		/*for(String ele:s)
			System.out.println(ele);*/
		
		// USING FOR LOOP
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		
		// REVERSE THE ARRAY USING FOR LOOP
		for(int i=s.length-1;i>=0;i--) {
			System.out.println(s[i]);
		}
		
		
		
		
		
		
		
		
	}

}

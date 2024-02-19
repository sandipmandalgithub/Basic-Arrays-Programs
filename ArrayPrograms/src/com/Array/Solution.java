package com.Array;

public class Solution {

	public static void main(String[] args) {
		String[] subjects= {"java","sql","apti","web"};
		for(int i=0;i<subjects.length;i++) {
			System.out.println(subjects[i]);
		}
		
		System.out.println("--------------------------------------");
		
		for(int i=subjects.length-1;i>=0;i--) {
			System.out.println(subjects[i]);
		}

	}

}

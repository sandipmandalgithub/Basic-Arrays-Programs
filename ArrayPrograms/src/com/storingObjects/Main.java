package com.storingObjects;
public class Main {
// DEVELOP A JAVA PROGRAM TO STORE 4 HOTEL INSTANCES INSIDES AN ARRAY AND PRINT THE NAMES
// OF THE HOTEL WHOSE RATINGS IS BETWEEN 4.2-4.7.

	public static void main(String[] args) {
		Hotel h1=new Hotel("TAJ",5.0);
		Hotel h2=new Hotel("SUNCITY",3.0);
		Hotel h3=new Hotel("WIND",4.5);
		Hotel h4=new Hotel("BREEZE",4.6);
		
		Hotel[] ht= {h1,h2,h3,h4};
		System.out.println("Hotel names whose ratings between 4.2-4.7");
		System.out.println("...........................");
	
		for(int i=0;i<ht.length;i++) {
			if(ht[i].rating>=4.2&&ht[i].rating<=4.7) {
			System.out.println("NAME :"+ht[i].name);
		}

	}

}
}

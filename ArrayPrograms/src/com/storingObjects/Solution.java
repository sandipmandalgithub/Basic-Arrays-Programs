package com.storingObjects;

//  A CLASS CAN BE BEHAVE AS A DATATYPE,IF A CLASS IS BEHAVING AS A DATATYPE,
// WE REFER IT AS NON PRIMITIVE DATA TYPE.
// DEFAULT VALUE OF "NON PRIMITIVE DATA TYPE IS NULL".

public class Solution {
	public static void main(String[] args) {
		Student s1=new Student(20, "SANDIP");
		Student s2=new Student(21, "MANIK");
		Student s3=new Student(22, "RAM");
		
		Student[]std= {s1,s2,s3};
		for(int i=0;i<std.length;i++) {
			System.out.println("AGE: "+std[i].age+" NAME: "+std[i].name);
		}
		
		}
		
		
	}



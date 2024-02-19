package com.storingObjects;
//DEVELOP A JAVA PROGRAM TO STORE 3 EMPLOYEE INSTANCES INSIDES AN ARRAY AND PRINT THE NAMES AND 
// SALARY IN BELOW FORMAT---EMP ID OF TOM IS 100 & SALARY IS 2.5LPA.

public class Test {

	public static void main(String[] args) {
		Employee e1=new Employee(100,"TOM",2.5);
		Employee e2=new Employee(101,"SANDIP",3.5);
		Employee e3=new Employee(102,"MANIK",4.5);


		Employee[] emp= {e1,e2,e3};

		for(int i=0;i<emp.length;i++) {
			System.out.println("EMP ID OF "+emp[i].name+" IS "+emp[i].id+" & SALARY IS "+emp[i].salary+"LPA. ");
		}	

	}

}



package com.java.examples;

public class Employee {
		
			String name;
			String desig;
			double sal;
			
			Employee(String name,String desig,double sal){
				this.name=name;
				this.desig=desig;
				this.sal=sal;
			}
			public void printDetails() {
				System.out.println("Name: "+name+"\n"+"Desig: "+desig+"\n"+"Salary: "+sal);
	        }

}



package com.java.examples;

import java.util.Scanner;
		// TODO Auto-generated method stubpackage com.java.examples;

public class HelloWorld {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60,70};
		String names[] = {"hari","sunil","kishore","karthik"};		
		for(int i=0;i<10;i++)
			System.out.println(i);
		
		for(int x: a)
			System.out.println("Hi "+x);
		for(String n:names)
			System.out.println("Hello "+n);

	}

}

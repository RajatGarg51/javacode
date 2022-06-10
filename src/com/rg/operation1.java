package com.rg;

import java.util.Scanner;

public class operation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your choice");
		System.out.println("1 for average of two numbers");

		Scanner sc = new Scanner(System.in);

		if(!sc.hasNextInt()) {
			System.out.println("Invalid input");
			System.exit(0);
		}
		int i = sc.nextInt();

		if(i==1) {
			System.out.println("Enter first number");
			if(!sc.hasNextInt()) {
				System.out.println("Not a integer");
				System.exit(0);
			}			
			int num1 = sc.nextInt();	

			System.out.println("Enter second number");
			if(!sc.hasNextInt()) {
				System.out.println("Not a integer");
				System.exit(0);
			}			
			int num2 = sc.nextInt();	

			avg(num1,num2);
		}

		sc.close();
	}

	static void avg(int a, int b){
		int avg = (a+b)/2;
		System.out.println("avg....." + avg);
	}

}

package com.rg;

public class operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your choice");
		System.out.println("1 for average of two numbers");
		
		int length = args.length;
		System.out.println(length);
		
		if(length != 3) {
			System.out.println("Insufficient input");
			System.exit(0);
		}
		
		int i = Integer.parseInt(args[0]);
		int a = Integer.parseInt(args[1]);
		int b = Integer.parseInt(args[2]);
		System.out.println(a);
		System.out.println(b);
		if(i==1) {
			avg(a,b);
		}
		

	}
	
	static void avg(int a, int b){
		int avg = (a+b)/2;
		System.out.println("avg....." + avg);
	}

}

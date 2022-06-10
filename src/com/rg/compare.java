package com.rg;

public class compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Comparing two numbers.....");

		int length = args.length;
		System.out.println("Input length "+length);

		if(length != 2) {
			System.out.println("Insufficient input");
			System.exit(0);
		}

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		System.out.println("first number "+a);
		System.out.println("second number "+b);

		if(a>b)
			System.out.println("Greater number : "+a);
		System.out.println("Greater number : "+b);

	}

}

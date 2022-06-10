package com.rg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class menu {

	public static void main(String[] args) {

		System.out.println("Mood Restaurant");
		Product product1 =  new Product(1, "Dosa", 50);
		Product product2 =  new Product(2, "Samosa", 10);
		Product product3 =  new Product(3, "Wada", 15);
		Product product4 =  new Product(4, "Upma", 20);
		Product product5 =  new Product(5, "Poha", 25);
		Product product6 =  new Product(6, "Jalebi", 30);
		Product product7 =  new Product(7, "Halwa", 35);
		Product product8 =  new Product(8, "Lassi", 40);
		Product product9 =  new Product(9, "Juice", 45);
		Product product10 =  new Product(10, "Bread", 55);

		List<Product> productList = new ArrayList<>();
		productList.add(product1);
		productList.add(product2);
		productList.add(product3);
		productList.add(product4);
		productList.add(product5);
		productList.add(product6);
		productList.add(product7);
		productList.add(product8);
		productList.add(product9);
		productList.add(product10);

		List<bill> billList = new ArrayList<>();
		bill bl;
		Product find = null;

		System.out.println("Would you like to order : Press 1 ");
		Scanner sc=new Scanner(System.in);
		if(!sc.hasNextInt()) {
			System.out.println("Invalid input");
			System.exit(0);
		}
		int i=sc.nextInt();
		if(i != 1) {
			System.out.println("Thank You !!!");
			System.exit(0);
		}
		int y = 1;
		int x = 0;
		while(y == 1) {

			System.out.println("Select the menu");
			for (Product p : productList) { 
				System.out.println(p);
			}

			x=sc.nextInt();
			
			for (Product p : productList) { 
				if(p.getCode() == x)
					find = new Product(p.getCode(), p.getName(), p.getPrice());
			}

			bl =new bill(find.getCode(), find.getName(), 1, find.getPrice());

			billList.add(bl);

			System.out.println("Would you like to order more : Press 1 or Press 2");
			y=sc.nextInt();
			System.out.println("Your input "+y);

		}
		System.out.println("Bill");
		int total = 0;
		for (bill p : billList) { 
			System.out.println(p);
			total = total + p.getAmount();
		}
		
		System.out.println("Total amount : "+total+"/-");
		sc.close();

	}

}

class Product{
	int code;
	String name;
	int price;

	public Product(int code, String name, int price) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
	}

	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [code=" + code + ", name=" + name + ", price=" + price + "]";
	}
}

class bill{
	int code;
	String name;
	int qty;
	int amount;
	public bill(int code, String name, int qty, int amount) {
		super();
		this.code = code;
		this.name = name;
		this.qty = qty;
		this.amount = amount;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "bill [code=" + code + ", name=" + name + ", qty=" + qty + ", amount=" + amount + "]";
	}

}

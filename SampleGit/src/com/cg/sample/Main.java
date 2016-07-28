package com.cg.sample;

public class Main {

	public static void main(String[] args) {
		
		displayGreeting();
		DisplayItems displayItems = new DisplayItems();
		displayItems.display();
	}

	private static void displayGreeting() {
		System.out.println("Hello World!!");
		
	}
	
	
}

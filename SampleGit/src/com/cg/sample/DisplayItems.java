package com.cg.sample;

/**
 * 
 * Display items class
 *
 */
public class DisplayItems {

	int [] items ={-1,0,1,2,3};
	
	public void display(){
		
		for (int i= 0; i<items.length;i++){
			System.out.println("item number" +i);
			System.out.println("Displaying.."+items[i]);
		
		}
	}
}

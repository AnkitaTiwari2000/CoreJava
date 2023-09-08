package BasicApp;

import java.util.Scanner;

public class Jeans extends Clothing{

	private String waistSize;

	public Jeans(String brand, double price, String waistSize) {
		super(brand, price);
		this.waistSize = waistSize;
	}

	

	public void displayInfo() {
		System.out.println("Brand :"+brand);
		System.out.println("price : Rs"+price);
		System.out.println("size   :"+ waistSize);
	}
	
}

package BasicApp;

import java.util.Scanner;

public class Kurti extends Clothing{
private String material;

public Kurti(String brand, double price, String material) {
	super(brand, price);
	this.material = material;
}

public String getMaterial() {
	return material;
}

public void displayInfo() {
	System.out.println("Brand :"+brand);
	System.out.println("price : Rs"+price);
	System.out.println("size   :"+ material);
}


}

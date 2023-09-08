package BasicApp;

import java.util.Scanner;

public class ControllerForClothing {
	
	static Clothing[]cart=new Clothing[5];
	 int itemCount=0;
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	 
	System.out.println("Welcome to Clothing Store !");
	while(true) {
		
	System.out.println("Select an Option......");
	System.out.println("1: Select Top");
	System.out.println("2: Select Jeans");
	System.out.println("3: Select Kurti");
	System.out.println("4: View Cart");
	System.out.println("5: Exit");
	int num=sc.nextInt();
	if(num==1) {
		System.out.println("enter the number of item you want to select");
	int numitems=sc.nextInt();
	sc.nextLine();
	for(int i=0;i<numitems;i++) {
		System.out.println("Enter the brand:");
		String brand=sc.next();
		System.out.println("Enter Price:");
		double price=sc.nextDouble();
		System.out.println("Enter Size:");
		String size=sc.next();
		Top top=new Top(brand,price,size);
		addItemToCart(top);
	}
		
	}
	else if(num==2) {System.out.println("enter the number of item you want to select");
	int numitems=sc.nextInt();
	sc.nextLine();
	for(int i=0;i<numitems;i++) {
		System.out.println("Enter the brand:");
		String brand=sc.next();
		System.out.println("Enter Price:");
		double price=sc.nextDouble();
		System.out.println("Enter waistSize:");
		String waistsize=sc.next();
		Jeans jeans=new Jeans(brand,price,waistsize);
		addItemToCart(jeans);
	}
	}
	else if(num==3) {
		System.out.println("enter the number of item you want to select");
		int numitems=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<numitems;i++) {
		System.out.println("Enter the brand:");
		String brand=sc.next();
		System.out.println("Enter Price:");
		double price=sc.nextDouble();
		System.out.println("Enter waistSize:");
		String material=sc.next();
		Kurti kurti=new Kurti(brand,price,material);
		addItemToCart(kurti);
	}
	}
	else if(num==4) {
		viewCart();
		
	}
	else if(num==5) {
		System.out.println("thankyou for Shopping !");
	}
	else {
		System.out.println("you enter somthing wrong!....");
	}}
	
	//display info
	
	
	
	}


 static void  addItemToCart(Clothing item) {
	int  itemCount =0 ;
	if(itemCount<5) {
		cart[itemCount]=item;
		itemCount++;
		System.out.println("item Added to cart");
	}
	
	
}



private static  void viewCart() {
	int itemCount=0;
	// TODO Auto-generated method stub
	System.out.println("item in the cart");
	for(int i=0;i<itemCount;i++) {
	int n=i+1;
	System.out.println("item"+(i+1)+" :");
	//System.out.println(cart[i]);
	}

}
}
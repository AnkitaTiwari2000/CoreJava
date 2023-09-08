package Array;

import java.util.Scanner;

public class Top extends Clothing {
	
	
	
public static void main(String[] args) {
	Clothing c[]=new Top[3];
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<3;i++) {
	System.out.println("enter the brand");
	String brand=sc.nextLine();
	System.out.println("enter the color ");
	String color=sc.next();
	System.out.println("enter the size ");
	int size=sc.nextInt();
	}
	for(int i=0;i<3;i++) {
		System.out.println("Brand :"+c[i].brand+"Color "+);
	}
	
}

}

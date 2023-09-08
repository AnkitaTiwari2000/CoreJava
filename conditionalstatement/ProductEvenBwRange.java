package conditionalstatement;

import java.util.Scanner;

public class ProductEvenBwRange {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the starting of the range");
	int r1=sc.nextInt();
	System.out.println("enter the ending of the range");
	int r2=sc.nextInt();
	int product=1;
	while(r1<r2) {
		if(r1%2==0) {
		product=r1*product;
		//System.out.println(product);
		}
		r1++;
	}
	System.out.println(product);
}
}

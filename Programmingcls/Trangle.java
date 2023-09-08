package Programmingcls;

import java.util.Scanner;

public class Trangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three value");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if((a==b)&&(b==c)) {
			System.out.println("equivalateral");
		}
		else if((a==b)||(b==c)||(c==a)) {
			System.out.println("Isosceles");
		}
		else {
			System.out.println("Scaler");
		}
	}

}

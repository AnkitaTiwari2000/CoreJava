package Oop;

import java.util.*;

public class Details {
 static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		BankUsingEncap b1=new BankUsingEncap("Noida","nishu",11110008,50000);
		System.out.println("For deposite press 1  for withdraw press 2");
		int num=sc.nextInt();	

if(num ==1) {
		b1.deposite();
		
}
else if( num==2) {
	b1.withdraw();
	
}
		
else {
	System.out.println("Thanks for connecting");
}

	}

}

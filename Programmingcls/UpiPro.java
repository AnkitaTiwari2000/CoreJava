package Programmingcls;

import java.util.Scanner;

public class UpiPro {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int balance=5000;
		System.out.println("enter the amount");
		int amount=sc.nextInt();
		
		if(amount>0)
		{
			System.out.println("enter the pin");
			int pin=sc.nextInt();
			if(pin==1010) {
			
			if(amount<=balance) {
				System.out.println("transaction sucess"+" "+amount);
				System.out.println("Remaining balance is "+" "+(balance-amount));
			}
			else {
				System.out.println("insufficient balance");
			}
			}
			else {
				System.out.println("wrong pin");
			}
			
		}
		else {
			System.out.println("enter amount can not be zero");
		}
		
		
		
		
			
		
		
	}

}

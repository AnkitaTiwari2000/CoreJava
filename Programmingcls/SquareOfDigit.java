package Programmingcls;

import java.util.Scanner;

public class SquareOfDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int r,even=0,sum=0;
		int count=0;
		while(n>0) {
			r=n%10;
				if(n%2==0) {
				
					even++;
					sum=sum+r*r;
					//System.out.println("Square of even digit"+r*r);
				}
				else {
					System.out.println("CUBE OF digit"+r*r*r);
					
					count++;
				}
				n=n/10;
			
		}
		System.out.println(sum);	
		
		
		
	}

}

package Oop;

import java.util.Scanner;

public class MainForInsta {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instagram i1=new Instagram();
	
System.out.println("For login press 1 ");
		int num=sc.nextInt();	

if(num ==1) {
		i1.login();
		
}

		
else {
	System.out.println("Thanks for connecting");


}}}



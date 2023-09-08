package Programmingcls;

import java.util.Scanner;

public class Swap2No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=10;
		int b=20;
		System.out.println("first no is"+" "+a+"Second no is"+""+b);
		
		/*int temp=a;
		a=b;
		b=temp;
		System.out.println("first ="+a);
		System.out.println("Second ="+b);
		
		*/
		//without using temp
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("first ="+a);
		System.out.println("Second ="+b);
		

	}

}

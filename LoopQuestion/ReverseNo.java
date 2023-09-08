package LoopQuestion;

import java.util.Scanner;

public class ReverseNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		int reverse=0;
		int remainder=0;
		int temp=a;
		while(temp>0) {
			remainder=temp%10;
			reverse=reverse*10+remainder;
			temp=temp/10;
		}
		System.out.println("Reverse of "+a+"is"+reverse);
	}

}

package LoopQuestion;

import java.util.Scanner;

public class CountOfPosNegZero {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(true) {
		int num;
		int countp=0;
		int countn=0;
		int countz=0;
		char ch=0;
		do {
			System.out.println("enter the number");
			num=sc.nextInt();
			if(num>0) {
				countp++;
			}
			else if(num<0){
				countn++;
			}
			else {
				countz++;
			}
			System.out.println("do you want to continue y/n?");
			ch=sc.next().charAt(0);
		}while(ch=='y'|| ch=='Y');
		
		System.out.println("positive num"+countp);
		System.out.println("negative num"+countn);
		System.out.println("zero num"+countz);
		System.out.println("do you want to continue press 1 or press 0 for exit?");
		int c=sc.nextInt();
		if(c==0) {
			System.out.println("thanks");
			break;
		}
		
	}
	}
}

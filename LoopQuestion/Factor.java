package LoopQuestion;

import java.util.Scanner;

public class Factor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int st=4;
		int en=16;
		//int i=1;
		
		while(st<=en)
		do {
			
			if(n%st==0) {
				System.out.println(st);
			}
			st++;
		}while(st<n);
	}
	}



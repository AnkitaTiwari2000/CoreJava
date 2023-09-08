package LoopQuestion;

import java.util.Scanner;

public class ProductOfEven {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the start range");
		int st=sc.nextInt();
		System.out.println("enter the end range");
		int en=sc.nextInt();
		int pd=1;
		do {if(st%2==0){
		pd=pd*st;
		}
		st++;	
		}while(st<en);
		System.out.println(pd);
	}

}

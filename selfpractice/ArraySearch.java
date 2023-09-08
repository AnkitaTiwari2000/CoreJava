package selfpractice;

import java.util.Scanner;

public class ArraySearch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num[]=new int[5];
		//input
		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
		}
		//search
		System.out.println("enter no you want to search");
		int x=sc.nextInt();
		for(int i=0;i<num.length;i++) {
			if(num[i]==x) 
			{
				System.out.println("number is"+num[i]+"find at"+i+"position");
			}
			
		}
		
	}

}

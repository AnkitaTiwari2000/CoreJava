package selfpractice;

import java.util.Scanner;

public class MinMax {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number[]=new int[5];
		
		for(int i=0;i<number.length;i++) {
			 number[i]=sc.nextInt();
			 
		}
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<number.length;i++) {
			 if(number[i]<min) {
				 min=number[i];
			 }
			 if(number[i]>max) {
				 max=number[i];
			 }
		}
			 System.out.println("largest number is"+max);
			 System.out.println("smallest number is"+min);
		
		
		
		
		
		
		
		
		
		
	}

}

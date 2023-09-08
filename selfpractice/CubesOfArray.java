package selfpractice;

import java.util.Scanner;

public class CubesOfArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 5 array");
		int cube[]=new int[5];
		int arr[]=new int[5];
		//input
		for(int i=0;i<cube.length;i++) {
			 arr[i]= sc.nextInt();
		}
		System.out.println("cube of number");
		for(int i=0;i<cube.length;i++) {
			
			cube[i]=arr[i]*arr[i]*arr[i];
			  System.out.println(cube[i]);
		}
	}

}

package Array;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of row");
		int rows=sc.nextInt();
		System.out.println("enter the number of col");
		int cols=sc.nextInt();
		int arr[][]=new int[rows][cols];
		//input
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				 arr[i][j]=sc.nextInt();
			}
		}
		//output
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}

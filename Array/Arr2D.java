package Array;

import java.util.Scanner;

public class Arr2D {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("enter the size of row");
		int rows=sc.nextInt();
		System.out.println("enter the size of cols");
		int cols=sc.nextInt();

		int Num[][]=new int[rows][cols];
		//input rows
		for(int i=0;i<rows;i++) 
		{
			//columns
			for(int j=0;j<cols;j++) {
				Num[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<rows;i++) 
		{
			for(int j=0;j<cols;j++) {
				System.out.print(Num[i][j]+" ");
			}
			System.out.println();
		}
	}

}

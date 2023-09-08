
package selfpractice;

import java.util.Scanner;

public class Array2D {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of row");
		int rows=sc.nextInt();
		System.out.println("enter the size of cols");
		int cols=sc.nextInt();
		
		int Num[][]=new int[rows][cols];
		//input rows
		for(int i=0;i<rows;i++) {
			//columns
			for(int j=0;j<cols;j++) {
				Num[i][j]=sc.nextInt();
				
			}}
		int x=sc.nextInt();
		//output
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(Num[i][j]==x) {
				System.out.println("x found at location ("+i+","+j+")");
				}
			}
		
		}
		
	}

}

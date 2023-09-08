package Programmingcls;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int arr[][]= {{10,12,9,},{13,5}};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rows and cols");
		int arr[][]=new int[2][3];
		//input
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
			arr[i][j]=sc.nextInt();
			}
		}
		
		//output
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}

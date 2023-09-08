package selfpractice;

import java.util.Scanner;

public class ArrayProgram1 {
	public static void main(String[] args) {
		//int marks[]=new int[3];
		//marks[0]=45;
		//marks[1]=78;
		//marks[2]=98;
		//System.out.println(marks[3]);
		/*int marks[]= {45,67,89};
		for(int i=0;i<3;i++) {
			System.out.println(marks[i]);
		 */



		Scanner sc=new Scanner(System.in);
		System.out.println("Size of the array");
		int size=sc.nextInt();
	

		System.out.println("enter array as a input"+"where size ="+size);
		int number[]=new int[size];
         //for taking input by user
		for(int i=0;i<size;i++) {
			number[i]=sc.nextInt();
		}
		//for searching number
		//int x =sc.nextInt();
		//output
		for(int i=size-1;i<=0;i--) {

			/*if(number[i]==x) {
					System.out.println("x found at index"+i);

			}*/
			System.out.println(number[i]);
		}
	}}



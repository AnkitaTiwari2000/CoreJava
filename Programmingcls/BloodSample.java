package Programmingcls;

import java.util.Scanner;

public class BloodSample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		int age=sc.nextInt();
		//System.out.println("enter the weight");
		//int weight =sc.nextInt();
		if(age>18) {
			System.out.println("enter the weight");
			int weight =sc.nextInt();
			if(weight>55) {
				System.out.println("you are eligible");
			}
			else {
				System.out.println("not selected due to weight");
			}
		}
		else {
			System.out.println("not eligible due to age");
		}
	}

}

package BasicProgram;

import java.util.Scanner;

public class Vote {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Age");
		int age=sc.nextInt();
		
		if(age>=21) {
			System.out.println(" he can vote");
		}
		else{
		System.out.println("he can not vote");
			}
	}

}

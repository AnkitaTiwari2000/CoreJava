package BasicProgram;

import java.util.Scanner;

public class ReadData {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the two number");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		if(n1>n2) {
			System.out.println(" n1 is largest"+"largest number is" +n1);
		}
		else {
			System.out.println(" n2 is largest"+" largest no is " +n2);
		}
		
	}

}

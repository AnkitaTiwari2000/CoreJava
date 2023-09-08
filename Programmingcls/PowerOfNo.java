package Programmingcls;

import java.util.Scanner;

public class PowerOfNo {
	public static void powerProgram(){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the base no");
		int base=sc.nextInt();
		System.out.println("enter the exponent no");
		int exponent=sc.nextInt();
		long result=1;
		while(exponent!=0) {
			result=result*base;
			--exponent ;
		
	}
		System.out.println(result);
	}
	public static void main(String[] args) {
		
	powerProgram();
		
	}

}

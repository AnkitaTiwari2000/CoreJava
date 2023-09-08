package BasicProgram;

import java.util.Scanner;

public class CompairToData {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the two number");
		int num1= sc.nextInt();
		int num2=sc.nextInt();
		if(num1==num2) {
			System.out.println(num1+"and"+ num2+  "are equal");
		}
		else {
			System.out.println(num1+"and"+ num2+  "are  not equal");
		
		}
	}

}

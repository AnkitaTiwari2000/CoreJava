package conditionalstatement;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("enter first Number");
		int a=sc.nextInt();
		System.out.println("enter second Number");
		int b=sc.nextInt();
		
		System.out.println("press + for Addition");
		System.out.println("press - for Subtraction");
		System.out.println("press + for Multiplication");
		System.out.println("press + for Divide");
		char m=sc.next().charAt(0);
		switch(m) {
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			System.out.println(a/b);
			break;
			default:
				System.out.println("We can't found right key");
				
		}
		System.out.println("press 0 for break and 1 for break");
		int res=sc.nextInt();
		if(res==0) {
			System.out.println("thank you");
			break;
		}
		
		
	}
	}
} 


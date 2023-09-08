package conditionalstatement;

import java.util.Scanner;

public class AtoZ {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(true) {
		System.out.println("enter the number");
		int num=sc.nextInt();
		int i=1;
		//int n=1;
		
		
		while(i<=10) {
			
         System.out.println(num+"X"+i+"="+i*num);
			i++;
			}
		System.out.println("press 1 for continue or press 0 for stop");
		int n=sc.nextInt();
	if(n==0) {
		{
			System.out.println("thank you");
			break;
			
			
		}
	}
		}
	}
}
	
		
	
	 



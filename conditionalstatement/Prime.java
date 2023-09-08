package conditionalstatement;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;int i=2;
		while(i<=num/2) {
			
			if(num%i==0) {
				//System.out.println(count);
				count++;
			}
			++i;
		}
			if(count==0) {
				System.out.println("yes it is prime no");
			}
			else{
		System.out.println("it is not prime");
			}
		
	}

}

package BasicProgram;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);{
			/*System.out.println("odd no from 1 to 20 :");
			for(int i=1;i<=20;i++) {
				if(i%2!=0) {
					System.out.println(i);
					//i++;
				}
			
			}
			*/
			int count ;
			int sum=0;
			
		System.out.println("first 100 prime no is:");
		
		
		
		
		for(int i=1;i<=200;i++) {
			count=0;
			for(int j=2;j<=i/2;j++)
			 {
				if(i%j==0) {
					//sum+=i;
					count++;
					break;
				}
			}
			
			if(count==0 && i!=1) {
				//System.out.print(i+" ");
				sum =sum+i;
			
			}
			
			
		}
		System.out.println(sum);
		
			
			
			
		}
	}

}

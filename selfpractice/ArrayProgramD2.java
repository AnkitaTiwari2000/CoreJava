package selfpractice;

import java.util.Scanner;

public class ArrayProgramD2 {
	public static void main(String[] args) {
		int sum=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the 4 number");
		int num[]=new int[4];
		
		// input
		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
		}
		
		//output for reverse
		/*for(int i=num.length-1;i>=0;i--) {
			System.out.print(num[i]+" ");
		}*/
		// output for even value
		
		for(int i=0;i<num.length;i++) {
			if(num[i]%2!=0) {
				sum +=num[i];
				
			}
			}
			System.out.println(sum);
		
		
		
		
		
		
		
		
		
	}

}

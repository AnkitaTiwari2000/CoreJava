package selfpractice;

import java.util.Scanner;

public class FindSumAvgMinMax {
	
	public static void main(String[] args) {
		int sum=0;
		double average;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the 4 number");
		int num[]=new int[4];
		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
		}
          for(int i=0;i<num.length;i++) {
        	  sum+=num[i];
        	
        	  
          }
          average=(double)sum /num.length; 
          System.out.print(sum+" ");
          System.out.println(average);
}
}
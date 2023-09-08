package Programmingcls;

import java.util.Scanner;

public class CountEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int count=0;
        int even=0,zero=0;
        while(n>0) {
        	int a=n%10;
        	if(a==0) {
        		zero++;
        	}
        	else if(a%2==0) {
        		even++;
        	}
        	
        	else {
        	count++;
        	}
        	n/=10;
        }
        System.out.println(even);
        System.out.println(zero);
       
	}

}

package TestProgram;

import java.util.Scanner;

public class PerfectNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		for(int j=1;j<=500;j++ ) {
			int n=j;int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		if(sum==n) {
			System.out.println(n);
		}
		
	}

	}

}

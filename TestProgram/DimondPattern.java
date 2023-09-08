package TestProgram;

import java.util.Scanner;

public class DimondPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numebr");
		int n=sc.nextInt();
		patternP(n);
			}
			
			public static void patternP(int n) {
				int p=1;int q=n;
				for(int i=1;i<=n;i++) {
					for(int j=1;j<q;j++) {
				
						System.out.print("  ");
					
						
					}
					for(int j=1;j<=p;j++) {
						System.out.print("* ");
					}
					if(i<n/2+1) {
					p=p+2;
					q--;
					}
					else {
						p-=2;
						q++;
					}
					System.out.println();
				}


	}

}

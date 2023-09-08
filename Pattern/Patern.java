package Pattern;

import java.util.Scanner;

public class Patern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the numebr");
int n=sc.nextInt();
patternP(n);
	}
	
	public static void patternP(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==(n/2+1)||i==(n/2+1)||i==1&&j>n/2+1||i==n&&j<n/2+1||j==n&&i>n/2+1||j==1&&i<n/2+1	) {
				System.out.print("*  ");
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
	
	

}

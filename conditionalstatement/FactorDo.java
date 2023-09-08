package conditionalstatement;

import java.util.Scanner;

public class FactorDo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i =1;int count=0;
		do { 
			if(num%i==0) {
			System.out.println(i);
			count++;
			}
			i++;
		}while(i<=num);
		System.out.println(count);
	}

}


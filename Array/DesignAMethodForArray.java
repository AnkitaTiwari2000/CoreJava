package Array;

import java.util.Scanner;

public class DesignAMethodForArray {
	
	public static void m1() {
		Scanner sc=new Scanner(System.in);
		int num[]=new int[4];
		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
		}
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
		
	}

}

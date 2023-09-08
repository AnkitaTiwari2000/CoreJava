package Array;

import java.util.Scanner;

public class Student5Read {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	Student5 []st=new Student5[5];
	System.out.println("enter the 5 name you want to enter");
	for(int i=0;i<5;i++) {
		
		String name=sc.nextLine();
		st[i]=new Student5(name);
		//System.out.println("Object Created");
	}
	for(int i=0;i<5;i++) {
		System.out.print("["+st[i].name+"]");
	}

	}

}

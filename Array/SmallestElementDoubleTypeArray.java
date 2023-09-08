package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestElementDoubleTypeArray {
	

	
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the size : ");
		int size=sc.nextInt();
		Student []st=new Student[size];
	for(int i=0;i<size;i++) {
		System.out.println("if you want to create object fill some details:");
		System.out.println("enter id : ");
		int id=sc.nextInt();
		System.out.println("enter Phone Number :");
		long phone=sc.nextLong();
		sc.nextLine();
		System.out.println("enter name: ");
		String name=sc.nextLine();
		st[i]=new Student(name ,id ,phone);
		System.out.println("Object Created");
	}
//System.out.println(Arrays.toString(st));
	//for output
	for(int i=0;i<st.length;i++) {
		System.out.println("["+st[i].name+" ,"+st[i].id+" ,"+st[i].phone+" ]");
	}
	
	
	
	}
}

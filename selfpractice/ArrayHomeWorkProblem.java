package selfpractice;

import java.util.Scanner;

public class ArrayHomeWorkProblem {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	//System.out.println("enter  name");
	int size=sc.nextInt();
	String name[]=new String[size];
	
	//input
	for(int i=0;i<size;i++) {
		name[i]=sc.nextLine();
	}
	//output
	
	for(int i=0;i<name.length;i++) {
		
		System.out.println("name"+(i+1)+"is:"+name[i]);
	}
	
}
}

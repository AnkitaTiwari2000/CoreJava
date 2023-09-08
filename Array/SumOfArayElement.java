package Array;

import java.util.Scanner;

public class SumOfArayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int sum=0;
System.out.println("enter the size of the array");
int size=sc.nextInt();
System.out.println("enter the array according to size.....");
int num[]=new int[size];

//input
for(int i=0;i<size;i++) {
	num[i]=sc.nextInt();
}
//output
for(int i=0;i<size;i++) {
	sum=sum+num[i];
}
System.out.println(sum);
	}

}

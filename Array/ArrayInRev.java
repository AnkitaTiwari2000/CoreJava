package Array;

import java.util.Scanner;

public class ArrayInRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array....");
		int size=sc.nextInt();
		System.out.println("enter the array....according to size..");
		int  num[]=new int[size];
		for(int i=0;i<size;i++) {
			num[i]=sc.nextInt();
		}
		//output
		int n;
		for(int i=0;i<num.length/2;i++) {
			//if(num[i]%2==0) {
		//	System.out.println(num[i]);
			//}
			n=num[i];
			num[i]=num[num.length-1-i];
			num[num.length-1]=n;
			}
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
			}
	}
       

}

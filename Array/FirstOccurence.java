package Array;

import java.util.Scanner;

public class FirstOccurence {
	
	public static void main(String[] args) {
		int arr[]={2,3,4,4,5,6};
	     int target =4;
		int index=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				System.out.println(i +" index is first occurance");
			break;	
			}
			if(index!=-1) {
				System.out.println("not ");
			}
			
		}
		

	}

}

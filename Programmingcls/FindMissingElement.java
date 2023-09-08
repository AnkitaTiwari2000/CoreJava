package Programmingcls;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {20,30,12,20,30};
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++) {   
			for(int j=arr[i]+1;j<arr[i+1];j++) {
			
					System.out.print(j+" ");
				
			}
		}

		
	}

}

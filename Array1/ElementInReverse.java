package Array1;

import java.util.Arrays;

public class ElementInReverse {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		System.out.println("Original Array");
		System.out.println(Arrays.toString(arr));
		System.out.println("after reverse");
		for(int i=arr.length-1;i>=0;i--) {
			
			System.out.print(arr[i]+" ");
		}
		
	}

}

package Array1;

import java.util.Arrays;

public class ReplaceElement {
 public static void main(String[] args) {
	int arr[]= {1,2,3,5,6,7};
	int element=5;
	int Replace=0;
	System.out.println(Arrays.toString(arr));
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==element) {
	      arr[i]=Replace;
	      
		}
	}
	System.out.println(Arrays.toString(arr));
}
	
}

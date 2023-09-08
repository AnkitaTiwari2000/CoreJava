package Array1;

import java.util.Arrays;

public class Allunique {

	public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,4,3,5};
	boolean temp[]=new boolean[arr.length];
	System.out.println(Arrays.toString(arr));
	for(int i=0;i<arr.length;i++) {
		if(temp[i]==false) {
	int count=1;
	for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					temp[j]=true;
				
				}
			}
			
				if(count==1)
					System.out.println("unique element "+arr[i]);
				}
			}

	}

}

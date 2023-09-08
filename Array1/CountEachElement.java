package Array1;

import java.util.Arrays;

public class CountEachElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,5,5,5,6,3,10,-2,-2,10,5,1};
		System.out.println("Original Array");
		System.out.println(Arrays.toString(arr));
        System.out.println("count frequency of each element");
        boolean[]temp=new boolean[arr.length];
        for(int i=0;i<arr.length;i++) {
        	if(temp[i]==false) {
        	int count=1;
        	
        	for(int j=i+1;j<arr.length;j++){
        		if(arr[i]==arr[j]) {
        			count ++;
        			temp[j]=true;
        		}
        	}
        	
        	System.out.println(arr[i]+" "+count);
        	
        }
        }
	}

}

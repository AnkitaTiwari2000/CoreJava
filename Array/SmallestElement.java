
package Array;

public class SmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,4};
int min=arr[0];
for(int i=0;i<arr.length;i++) {
	if(arr[i]<min)
		min=arr[i];
	}
System.out.println("Smallest element present in given array"+" "+min);
}
	}



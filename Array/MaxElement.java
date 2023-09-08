package Array;

public class MaxElement {

	public static void main(String[] args) {
		int arr[]= {12,34,66,7,9};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
System.out.println(max);
	}

}

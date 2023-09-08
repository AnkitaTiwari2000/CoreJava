package Array1;

public class LargestElement {

	public static void main(String[] args) {
		short arr[]= {2,1,7,9,3,1};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);

	}

}

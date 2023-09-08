package Array1;

public class SecondLargest {

	public static void main(String[] args) {
		short arr[]= {2,1,7,7,9,3,1};
		int fmax=arr[0];
		int smax=arr[1];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>fmax) {
				smax=fmax;
				fmax=arr[i];
			}
			else if(arr[i]>smax && arr[i]!=fmax) {
				smax=arr[i];
			}
		}
		System.out.println("first largest :"+fmax);
		System.out.println("Second Largest :"+smax);

	}

}

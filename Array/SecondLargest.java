package Array;

public class SecondLargest {

	public static void main(String[] args) {
		int arr[]= {2,7,7,4,8,1,3};
		int fMax=arr[0];
		int sMax=arr[1];
		int tMax=arr[2];
		int foMax=arr[3];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>fMax) {
				foMax=tMax;
				tMax = sMax;
				sMax=fMax;
				fMax=arr[i];
			}
			else if(arr[i]>sMax && arr[i]!=fMax) {
				tMax = sMax;
				sMax=arr[i];
			}
			else if(arr[i]>tMax && arr[i]!=fMax && arr[i]!=sMax ) {
				foMax=tMax;
				tMax=arr[i];
			}
else if(arr[i]>foMax && arr[i]!=fMax && arr[i]!=sMax && arr[i]!=tMax) {
	foMax=arr[i];
}
		}
System.out.println(sMax);
System.out.println(tMax);
System.out.println(foMax);
	}

}

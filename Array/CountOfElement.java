package Array;

public class CountOfElement {

	public static void main(String[] args) {
		int arr[]= {1,2,5,1,3,5,5,9};
		
		int temp[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					temp[j] =-1;
				}
			}
			if(temp[i]!=-1) {
				System.out.println(arr[i]+" "+count);
			}
		}
		

	}

}

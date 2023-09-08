package Array;

public class SmallestInChar {
	public static void main(String[]args) {
		char []arr= {'a','C','d','D'};
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println((char)min);
	}

}

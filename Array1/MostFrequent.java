package Array1;

public class MostFrequent {

	public static void main(String[] args) {
		double arr[]= {1.5,2.0,2.0,2.0,3.5,3.5,4.1,5.1,1.1,1.1,1.1};
		int maxCount=0;
		double element=0;
		for(int i=0;i<arr.length;i++) {
			int count =1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(maxCount<count) {
				maxCount=count;
				element= arr[i];
				
			}
		}
		System.out.println(element+" Occure "+maxCount+" times");

	}

}

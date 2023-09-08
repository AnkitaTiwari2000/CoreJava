package Array;

public class EvenIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4};
		int sum=0;
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0)
				//System.out.println("even index"+" "+arr[i]);
				if(arr[i]>max)
					max=arr[i];
				//sum=sum+arr[i];
			}
		
		System.out.println(max);

	}

}

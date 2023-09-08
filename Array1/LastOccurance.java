package Array1;

public class LastOccurance {

	public static void main(String[] args) {
		int arr[]= {1,3,5,2,3,2};
		int key=1;
		boolean isfound =false;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]==key) {
System.out.println("first occurance of 1 in "+i+" Position");
  isfound =true;
				break;
			}
			
			
		}
		if(!isfound) {
			System.out.println("not available this number");
		}

	}

}

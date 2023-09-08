package Array1;

public class FirstOccurance {

	public static void main(String[] args) {
		int arr[]= {1,3,5,2,3,2};
		int key=7;
		boolean isfound =false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
System.out.println("first occurance of 3 in "+i+" Position");
isfound =true;
				break;
			}
			
			
		}
		if(!isfound) {
			System.out.println("not available this number");
		}

	}

}

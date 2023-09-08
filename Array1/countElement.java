package Array1;

public class countElement {

	public static void main(String[] args) {
	int arr[]= {-2,3,4,5,-1,2,2,-3,2,-1};
	int temp[]=new int[arr.length];
	int visited=-1;
	
	for(int i=0;i<arr.length;i++) {
		int count =1;
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				count++;
				temp[j]=visited;
				//System.out.println(arr[i]);
			}
		}
			if(temp[i]!=visited) {
				
				System.out.println(arr[i]+" "+count);
			}
		
	}

	}

}

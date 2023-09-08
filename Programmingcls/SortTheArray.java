package Programmingcls;

public class SortTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,45,11,76,43,76};
		for(int j=0;j<arr.length;j++) {
			for(int i=0;i<arr.length-1;i++) {
				if(arr[i]>arr[i+1])
				{
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					
				}
				
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
					}
		System.out.println();
		System.out.println("highest element"+" "+arr.length);

		
		
		
		
		

	}

}

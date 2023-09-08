package Array;

public class CopyOneArrayToAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= new int[]{1,2,3,4};
		int arr1[]= new int[arr.length];

		// copy
		for(int i=0;i<arr.length;i++) {
			arr1[i]=arr[i];
		}
		//display arr 
		System.out.println("element of original array");
       for(int i=0;i<arr.length;i++) {
    	   System.out.print(arr[i]+" ");
       }
       System.out.println();
       //display arr1
       System.out.println("element of new Arrayz");
       for(int i=0;i<arr1.length;i++) {
    	   System.out.print(arr1[i]+" ");
       }
	}

}

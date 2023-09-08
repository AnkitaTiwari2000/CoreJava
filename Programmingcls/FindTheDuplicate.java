package Programmingcls;

public class FindTheDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {20,30,12,20,30};
		for(int i=0;i<arr.length;i++) {   
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[j]+" ");
				}
			}
		}
	}

}

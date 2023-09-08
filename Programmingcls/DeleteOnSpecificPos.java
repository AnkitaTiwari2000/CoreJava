package Programmingcls;

public class DeleteOnSpecificPos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		int temp[]=new int[arr.length-1];
		for(int i=0;i<temp.length;i++) {
			if(i<2)
				temp[i]=arr[i];
			else
				temp[i]=arr[i+1];
		}
		for(int i=0;i<temp.length;i++) {
			System.out.println(temp[i]);
		}

	}

}

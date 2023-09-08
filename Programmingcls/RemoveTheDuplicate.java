package Programmingcls;

public class RemoveTheDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {20,30,12,20,30};
		int temp[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) { 
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					temp[j]=-1;
				}
			}
			//for print duplicate write in if count>1
			if(temp[i]!=-1) {
				System.out.println(arr[i]+" "+count);
			}
		}
	}

}

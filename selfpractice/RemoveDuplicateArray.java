package selfpractice;

public class RemoveDuplicateArray {
	public static void main(String[] args) {
		int index=0;
		int arr[]= new int[]{1,2,3,2,2,4,5};
		int count;
		int [] anti_dup=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<arr.length;i++) {
			count=0;
			for(int j=i+1;j<arr.length;j++) {
				if (arr[i]==arr[j]) { 
					count=count+1;
				break;
			//	System.out.println(arr[j]);
				}
				if(count==0) {
					anti_dup[index]=arr[i];
					index++;
				}
				
			}
			for( i=0;i<index;i++) {
				
				arr[i]=anti_dup[i];
				
			}
			System.out.println("after removing");
			for( i=0;i<index;i++)
			{
				System.out.println(arr[i]);
			}
		}
	}

}

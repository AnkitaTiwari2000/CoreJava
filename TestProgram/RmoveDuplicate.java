package TestProgram;

public class RmoveDuplicate {

	public static void main(String[] args) {
		int arr[]= {20,30,10,11,20,30};
		int index=0;
		int temp[]= new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j])
					count=count+1;
				
			}
			if(count ==0) {
				temp[index]=arr[i];
				index++;
				
			}
		}
		for(int i=0;i<index;i++) {
			arr[i]=temp[i];
		}
			for(int i=0;i<index;i++) {
				System.out.println(arr[i]);
		}

	}

}


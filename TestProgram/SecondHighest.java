package TestProgram;

public class SecondHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int []arr= {13,44,11,19,3,7};
       
       for(int j=0;j<arr.length;j++) {
    	   for(int i=0;i<arr.length-1;i++) {
    	   if(arr[i]<arr[i+1])
    	   {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				
    	   }
			}
       }
       
       for(int i=0;i<arr.length;i++) {
    	   System.out.println(arr[i]+" ");
       }
       //System.out.print(arr[arr.length-2]);
       
	}

}

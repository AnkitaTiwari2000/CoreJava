package Array;

public class MostFrequent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {1,22,3,5,6,6,6,6,6,};
      int element=0;
      int maxCount=0;
      for(int i=0;i<arr.length;i++) {
    	  int count=1;
    	  for(int j=i+1;j<arr.length;j++) {
    		  if(arr[i]==arr[j]) {
    			  count++;
    		  }
    	  }
    	  if(maxCount<count) {
    		  maxCount=count;
    		  element=arr[i];
    	  }
      }
      System.out.println(element+" occure "+maxCount+" times");
	}

}

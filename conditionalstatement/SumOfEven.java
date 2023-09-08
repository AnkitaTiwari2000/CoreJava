package conditionalstatement;

public class SumOfEven {
	public static void main(String[] args) {
		int start =5,end=20 ;
		int sum=0;
		while(start<=end) {
			if(start%2==0) {
				 sum=sum+start;
				 System.out.println(+sum); 
				
			}
			
			 start++;
		}
		
		
	}

}

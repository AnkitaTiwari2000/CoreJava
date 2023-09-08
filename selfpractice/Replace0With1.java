package selfpractice;

public class Replace0With1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int num=12001;
      
      while(num>0) {
    	  int res=num%10;
    	  if(res==0) 
    		  res=1;
    		num=num/10;
    		
    		      
    		      
    		      
    	  }
      System.out.println(num);
      }
	}



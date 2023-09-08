package selfpractice;

public class Excep2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.err.println("hello");
    System.out.println("Hello world!");
   
    try {
    	int num=9/0;
    }
   
    catch(Exception ex)
    {
    	System.out.println("j");
    	}
   
    finally {
    	System.out.println("i am finally");
    }
    }

}

package Pattern;

public class SimplePattern {

	public static void main(String[] args) {
		int num=10,i,j;
		for( i=1;i<=num;i++) {
			
		
			for( j=1;j<=num;j++)
		if(i==num||i==j||i+j==num+1||j==1||j==num||i==1||j==(num/2)||i==(num/2))
			    {
				System.out.print("* ");
				}
		else
			System.out.print("  ");
			System.out.println(" ");
		}
         
	}

}

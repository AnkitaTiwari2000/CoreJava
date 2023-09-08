package Programmingcls;

public class FactorialOfEachDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=345;
	
		while(n>0) {
			int res;
			int	fact=1;
			res=n%10;
			n=n/10;
			for(int i=1;i<=res;i++) {
			 
			fact=fact*i;
			}
	
			System.out.println("factorial of"+res+"="+fact);
			}
			
			
			
			
		}

	}



package Programmingcls;

public class PalindromeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=120,r;
        int temp=n;
        int sum=0;
        while(n>0) {
        	r=n%10;
        	sum=(sum*10)+r;
        	n=n/10;
        }
        if(temp==sum) {
        	System.out.println("P NO");
        }
        else {
        	System.out.println("No");
        }
	}

}

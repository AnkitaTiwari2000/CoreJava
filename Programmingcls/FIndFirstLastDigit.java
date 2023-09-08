
package Programmingcls;

public class FIndFirstLastDigit {
	public static void main(String[] args) {
		int n=9687;
		int lastdigit=0;
		int firstdigit=0;
	
			lastdigit=(n%10);
		
		System.out.println(lastdigit);
		while(n!=0) {
			
			firstdigit=n%10;
			n=n/10;
		}
		System.out.println(firstdigit);
	}

}

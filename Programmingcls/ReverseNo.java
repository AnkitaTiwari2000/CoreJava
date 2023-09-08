package Programmingcls;

public class ReverseNo {
	public static void main(String[] args) {
		int n=9876;
		int reversed=0;
		while(n>0) {
			//get last digit
			int digit=n%10;
			reversed=reversed*10+digit;
			//remove the last
			n /=10;
		}
		System.out.println(reversed);
	}

}

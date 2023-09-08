package Programmingcls;

public class PalindromNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=111;
		int temp=num;
		int rev=0;
		while(num>0) {
			int r=num%10;
			rev=rev*10+r;
			num /=10;
		}
		System.out.println(rev);
		if(rev==num) {
			System.out.println("Palindrome Number");
		}
		else {
			System.out.println("not Palindrome");
		}

	}

}

package Programmingcls;

public class EachDigitInReverse {
 public static void main(String[] args) {
	int n=1234;
	int res;
	 while(n>0) {
		 res=n%10;
		 if (res%2==0){
		 System.out.print(res);
		 }
		 n=n/10;
	 }
}
}

package Programmingcls;

public class SumOfAllDigitInNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=12345;
int sum=0;
while(n>0) {
	int r=n%10;
	sum=sum+r;
	n=n/10;
}
System.out.println(sum);
	}

}

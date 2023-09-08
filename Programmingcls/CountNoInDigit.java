package Programmingcls;

public class CountNoInDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=234987604;
int count=0;

int odd=0;
while(n>0) {
	
	 if(n%2==0) {
		count++;
	}
	else {
		odd++;
	}
	n=n/10;
	
}
System.out.println("even is"+count);
System.out.println("odd is"+odd);
//System.out.println("zero is"+zero);
	}

}

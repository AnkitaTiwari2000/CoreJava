package LoopQuestion;

public class SumOfEven {
public static void main(String[] args) {
	int st=15;
	int en=40;
	int sum=0;
	do {
		if(st%2==0) {
			sum=sum+st;
		}
		st++;
	}while(st<40);
	System.out.println(sum);
}
}

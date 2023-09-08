package LoopQuestion;

public class SumForPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=10;
int e=30,sum=0;

while(num<=e) {
	int count=0,i=1;
	while(num<=e/2) {
		int s=num;
		if(s%i==0) {
			
			count++;
		}
		i++;
	}
if (count==1) {
sum=sum+num;
}
num++;
}
System.out.println(sum);
	}

}

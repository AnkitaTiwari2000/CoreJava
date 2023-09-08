package Programmingcls;

public class NoDivby3Or9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
	int sum=0;
		while(num<=30) {
			if(num%3==0 && num%9==0) {
				sum=sum+num;
				//System.out.println("divisible by 3 & 9 "+" = "+ num);
			
			
			
			}
			
			
			num++;
		}
		System.out.println(sum);

	}

}

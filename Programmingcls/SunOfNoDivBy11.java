package Programmingcls;

public class SunOfNoDivBy11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=20;
		int sum=0;
		while(num<=60) {
			if(num%11==0) {
				sum=sum+num;
			}
			num++;
		}
		System.out.println(sum);

	}

}

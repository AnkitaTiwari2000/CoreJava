package LoopQuestion;

public class PrimeNoRange {
	public static void main(String[] args) {
		int num=10;int e=40;
		
		while(num<=e) {
			int count=0;
			int i=1;
		while(i<=num) {
			int s=num;
			if(s%i==0) {
				count++;
				
			}
			i++;
		}if(count==2) {
			System.out.println(num);
		}
		
		num++;
		}
		
	}

}

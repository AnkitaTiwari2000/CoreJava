package LoopQuestion;

public class Gcd {
	public static void main(String[] args) {
		int num1=5;
		int num2=30;
		while(num1!=num2) {
		if(num1>num2) {
				num1=num1-num2;
				
			}
			else
			{
				num2=num2-num1;
			}
	
			}
		System.out.println(num2);
		
	
		
	}

}

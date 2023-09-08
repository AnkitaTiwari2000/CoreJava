package LoopQuestion;

public class Lcm {
	public static void main(String[] args) {
		int n1=3;
		int n2=4;
		int lcm=0;
		int max=(n1>n2)?n1:n2;
		while(true) {
			if(max%n1==0 && max%n2==0) {
				lcm=max;
				break;
			}
			max++;
		}
		System.out.println("lcm is"+lcm);
	}

}

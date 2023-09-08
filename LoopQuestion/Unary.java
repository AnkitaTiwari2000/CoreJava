package LoopQuestion;

public class Unary {

	public static void main(String[] args) {
		int a=2;
		int b=0;
		int c=-1;
		a--;
		b--;
		a=a--+b--;
		--b;
		System.out.println(b--*c--);
		
		System.out.println(a-b-c);
		
		System.out.println(a+b+c);
		c=a--+b--+c--;
		System.out.println(a);
	}
}

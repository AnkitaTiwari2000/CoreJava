package LoopQuestion;

public class ProductOfFirstNatu {
	public static void main(String[] args) {
		int st=1;
		int pd=1;
		do {
			System.out.println(st);
			if(st<=10) {
		 pd=pd*st;
			
			
			}
			st++;
		}while(st<=10);
		System.out.println(pd);
	}

}

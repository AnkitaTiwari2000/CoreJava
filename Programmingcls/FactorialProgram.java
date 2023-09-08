package Programmingcls;

public class FactorialProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=456;

		while(n>0) {

			int r=n%10;
			if(r%2==0) {
				int fact=1;
				while(r>0) {

					fact=fact*r;
					r--;

				}

				System.out.println(fact);
			}
			n/=10;
		}
	}
}

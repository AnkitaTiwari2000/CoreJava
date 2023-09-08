package Programmingcls;

public class DivisorsOf10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int i=1;
		while(i<=n) {
			if(n%i==0) {
				System.out.println(i);
			}
			i++;
		}

	}

}

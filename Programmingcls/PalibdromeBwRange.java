package Programmingcls;

public class PalibdromeBwRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int en=200;
		
		for(int i=10;i<=en;i++) {
			int n=i,temp=n;
			int rev=0;
			for(;n>0; ) {
				int r=n%10;
				rev=rev*10+r;
				n /=10;
			}
			if(rev==temp) {
				System.out.println(i);
			}
		}

	}

}

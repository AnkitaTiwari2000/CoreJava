package TestProgram;

public class PalindromeBwRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=10;i<=200;i++) {
			int sum=0;
			int temp=i;
		  while(temp>0) {
				int num=temp%10;
				sum=sum*10+num;
				temp=temp/10;
			}
			if(sum==i) {
				System.out.println(i+" ");
			}
		}
		
		
		
		
		
		
		

	}

}

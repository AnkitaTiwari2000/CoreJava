package Programmingcls;

public class StrongDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Strong no  means 145 like factorial of each digit and sum of value equal to 145
		int i=1;
		
		while(i<=1000)
		
		{
			int num=i;
			int sum=0;
			int temp=num;
			while(num>0) {
			int r=num%10;
			int fact=1;
			while(r>0) {

				fact=fact*r;

				r--;
			}
			sum=sum+fact;
			num=num/10;
			}
			//System.out.println(sum);
			if(sum==temp) {
				System.out.println("Strong Number"+i);
			}
			
	
i++;
		}
		
		
		/*

else {
	System.out.println(" not Strong Number");
}
*/
	}
	

}

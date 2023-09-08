package LoopQuestion;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int num=10; int num2=40;
			
			while(num<=num2) {
				int count=0;
			int i=1;
			while(i<=num)
			{
				if(num%i==0) {
				count++;
			}
				i++;
			}
			if(count==2){
				System.out.println(num);
			}
			num++;
			
			}	
	}

}

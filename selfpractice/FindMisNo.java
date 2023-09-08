package selfpractice;

public class FindMisNo {
	public static int getMissingNo(int [] num,int n)
	{
		int sum=((n+1)*(n+2))/2;
		for(int i=0;i<n;i++)
			sum-=num[i];
		
		return sum;
		
	}
	
public static void main(String[] args) {
		int []a= {1,2,3,5};
		int N = a.length;
		
		System.out.println(getMissingNo(a,N));
		
		
		
	}

}

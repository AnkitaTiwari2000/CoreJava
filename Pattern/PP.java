package Pattern;

public class PP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;// i==j&&i<=n/2|| i+j==n-1&& j>=n/2
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++) {
				if(i>=j||i+j>=n-1)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
	}

	}

}

package Pattern;

public class Using3Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1;i<=5;i++) {
	for(int j=5;j>i;j--)//space
	{
		System.out.print(" ");
	}
	for(int k=1;k<=2*i-1;k++)//star
	{
		System.out.print("*");
	}
	System.out.println();
		
}
for(int i=4;i>=1;i--) {
	for(int j=5;j>i;j--)//space
	{
		System.out.print(" ");
	}
	for(int k=1;k<=2*i-1;k++)//star
	{
		System.out.print("*");
	}
	System.out.println();
		
}
	}

}

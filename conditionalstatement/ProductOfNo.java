package conditionalstatement;

public class ProductOfNo {
	public static void main(String[] args) {
		int first=1,last=10;
	int product=1;
while(first<=last) {
	product=first*product;
	//System.out.println(product);
	first++;
}
System.out.println(product);
}
}
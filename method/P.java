package method;

public class P {
	public static void maxMin(int a,int b,int c) {
		
		if(a>b && a>c) {
			System.out.println(a +"is largest");
		}
		else if(b>a &&b>c) {
			System.out.println(b+"is largest");
		}
		else if(c>a && c>b) {
			System.out.println(c+"is largest");
		}
		else {
			System.out.println("all is equal");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	maxMin(1
			,1,1);

	}

}

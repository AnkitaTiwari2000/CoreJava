package selfpractice;

public class Excep1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello world!");
try {
	System.out.println("Hello world!");
	int divvideByZero=5/0;
	System.out.println("Hello duniya");
}
catch(ArithmeticException e){
	System.out.println("Airthmatic Exception =>"+e.getMessage());
}
catch(Exception e){
	System.out.println("hello java");
}
finally {
	System.out.println("this is the finally block");
}
System.out.println(10+20);
	}

}

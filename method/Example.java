package method;

public class Example {
	public static void m1() {
		int st=10;int en=12;
		int count=0;
		while(st<=en) {
			if(st%2==0) {
				count++;
			}
			st++;
			
		}
		System.out.println(count);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 m1();
	}

}

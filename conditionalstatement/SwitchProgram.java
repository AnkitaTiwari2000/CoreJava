package conditionalstatement;

import java.util.Scanner;

public class SwitchProgram {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first num");
		int n1=sc.nextInt();
		System.out.println("enter the 2nd num");
		int n2=sc.nextInt();
		
		System.out.println("press + for addition");
		System.out.println("press - for sub");
		System.out.println("press * for multiplication");
		System.out.println("press / for division");
	
		char m =sc.next().charAt(0);
		switch(m){
		case '+':
			System.out.println("addition is"+(n1+n2));
		
		break;
	case '-':
		System.out.println("sub is"+(n1-n2));
		break;
	
	case '*':
		System.out.println("mul is"+(n1*n2));
		break;
	
case '/':
	System.out.println("div  is"+(n1/n2));

		break;
 default:
	 System.out.println("hii it is default");
		
		
		
		
		
		
		
		
		
		
	}

}
}
package Programmingcls;

import java.util.Scanner;

public class CheckCOnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char n=sc.next().charAt(0);
				
		
if(n>='0' &&n<='9') {
	System.out.println("digit");
	
	
}
else if(n>='A'&& n<='Z'||n>='a' && n<='z') {
	System.out.println("number");
}
else {
	System.out.println("Special Character");
}
	}

}

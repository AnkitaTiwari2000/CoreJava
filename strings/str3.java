package strings;

import java.util.Scanner;

public class str3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
   String s="NishuTiwari";
   int sum=0;
   for(int i=0;i<s.length();i++) {
	   if(s.charAt(i)!=' ')
	   sum++;
   }
    System.out.println(sum);
    	
		
		
	}

}

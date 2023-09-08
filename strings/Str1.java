package strings;

import java.util.Scanner;

public class Str1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
String name="Ankita Tiwari";
String s=new String("nishu");
String s1=sc.nextLine();
//add
System.out.println(name.concat(s));
//compare
if(name.compareTo(s)==0) {
System.out.println("it is equal");
}
else {
	System.out.println("not equal");
}
System.out.println(name.equals(s1));
//access character to Strings
for(int i=0;i<name.length();i++) {
	System.out.println(name.charAt(i));
}













}

}

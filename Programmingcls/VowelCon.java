package Programmingcls;

import java.util.Scanner;

public class VowelCon {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the character");
		char ch=sc.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='o'||ch=='u'||ch=='i'||ch=='A'||ch=='E'||
				ch=='I'||ch=='O'||ch=='U') {
			System.out.println(ch+" is vowel");
		}
		else {
			System.out.println(ch+" "+"is consonent");
		}
	}

}

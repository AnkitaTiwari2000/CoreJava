package Oop;

import java.util.Scanner;

public class Instagram {
	Scanner sc=new Scanner(System.in);
	private String name;
	private String email;

	private long mob;
	//getter of field
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public long getMob() {
		return mob;
	}
	//set
	public String setName(String name) {
			
		return this.name;
	}
	public String setEmail(String email) {
		return this.email;
	}
	{
		System.out.println("Instagram");
	}

	//Constructor

	public Instagram() {
		
		System.out.println("Enter the name");
		  this.name = sc.nextLine();
		
		 System.out.println("Enter the email");
	     this.email=sc.nextLine();
	     

	}


	//for log in
	public void login() {

		
		
	     if(isVerify()) {

			System.out.println("now you are login");
			System.out.println("Press S for setting ");
			char ch=sc.next().charAt(0);
			if(ch=='s'||ch=='S') {
				setting();
				}
			else {
				System.out.println(" Home page ");
			}


		}
		else {
			System.out.println("Wrong Password");
		}


	}

	public boolean isVerify() {
		int dataBasePin=12345;
System.out.println("enter the password");
		int password =sc.nextInt();
		if(password==dataBasePin) {
			return true;
		}
		return false;

	}
	public void setting() {
		System.out.println("What you want to change");
		System.out.println("Press N for name");
		System.out.println("press E for email");
		char ch=sc.next().charAt(0);
		if(ch=='N' || ch=='n') {
			
			
			setName(this.name=sc.next());
			System.out.println("Now Your Name Is"+" "+getName());
			
		}
		else if(ch=='e'||ch=='E') {
			setEmail(this.email=sc.next());
			System.out.println("Now Your Email Is"+" "+getEmail());
		}
		else {
			System.out.println("THANK YOU");
		}

	}





}

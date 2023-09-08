package Relationship;

import java.util.Scanner;

public class MainForBanking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//SBI s=new SBI("Ankita",110055,50000.0);
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the choice update the details");
		System.out.println("1:SBI \n2:ICICI \n3:PNB");
		int x;
		x=sc.nextInt();
		
		RBI bank;
		
		if(x==1) {
			bank=new SBI("Ankita",110055,5000.0);
			SBI s=(SBI)bank;
			System.out.println("Name :"+s.name+"\nAccount Number :"+s.acNo+"\nYour Current Balance :"+s.balance);
			s.printInfo();
			System.out.println("1:Deposite\n2:withdraw");
			int a=sc.nextInt();
			if(a==1) {
			s.deposite();
			}
			else if(a==2){
				s.withdraw();
			}
			
			else {
				System.out.println("......thank you......");
			}
			
		
		}
		
		if(x==2) {
			bank=new ICICI("Ankita",110015,5000.0);
			ICICI s=(ICICI)bank;
			System.out.println("Name :"+s.name+"\nAccount Number :"+s.acNo+"\nYour Current Balance :"+s.balance);
			s.printInfo();
			System.out.println("1:Deposite\n2:withdraw");
			int a=sc.nextInt();
			if(a==1) {
			s.deposite();
			}
			else if(a==2){
				s.withdraw();
			}
			
			else {
				System.out.println("......thank you......");
			}
			
		
		}

	}

}

package Oop;

import java.util.Scanner;

public class BankUsingEncap {
	Scanner sc=new Scanner(System.in);
	private String bankBranchName="Noida";
	private String name;
	private long acNo;
	private double balance;
	
	
	
	public String getBankBranchName() {
		return bankBranchName;
	}
  public String getName() {
		return name;
	}

    public long getAcNo() {
		return acNo;
	}

     public double getBalance() {
		return balance;
	}
     public void setBalance() {
    	 deposite();
     }
     {
    	 System.out.println("Bank Account is Open ...");
     }
     //constructor
	public BankUsingEncap( String bankBranchName, String name, long acNo, double balance) {
		
		this.bankBranchName = bankBranchName;
		this.name = name;
		this.acNo = acNo;
		this.balance = balance;
	}
                
    public void deposite() {
    	System.out.println("enter the amount to be deposite");
    	double amt=sc.nextDouble();
    	if(isVerify()) {
    	this.balance+=amt;
    	System.out.println("Amount is Sucessfully Deposite...........");
    	System.out.println("Do you want to check your current balance....?");
		System.out.println("Press Y for yes and N for no");
		char ch=sc.next().charAt(0);
		if(ch=='y'||ch=='Y') {
			System.out.println("Now your current balance is"+" "+this.balance);
		}
    	
    	}
    	else {
    		System.out.println("invalid pin");
    	}
    	
    }
    public boolean isVerify() {
    	int dataBasePin=12345;
    	System.out.println("enter your pin");
    	int userPin=sc.nextInt();
    	if(userPin==dataBasePin) {
    		return true;
    	}
    	return false;
    	
    }

	
    public void withdraw() {
    	if(isVerify()) {
    	
    		System.out.println("enter the amount to be Withdraw");
    		double amt=sc.nextDouble();
    		if((this.balance-amt)>0) {
    			System.out.println("Amount is Processing................");
    			this.balance=this.balance-amt;
    			
    		}
    		else {
    			
    		}
    	}
    		else {
    			System.out.println("insufficuient balance...........");
    		}
    		System.out.println("Do you want to check your current balance....?");
    		System.out.println("Press Y for yes and N for no");
    		char ch=sc.next().charAt(0);
    		if(ch=='y'||ch=='Y') {
    			System.out.println("Now your current balance is"+" "+this.balance);
    		}
    		System.out.println("Thnaks for Banking..");
    	}
    		else {
    			System.out.println("Invalid Pin.......");
    			System.out.println("try Again.........");
    		
    	}
    }



	

}

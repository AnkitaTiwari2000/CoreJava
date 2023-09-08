package Relationship;

import java.util.Scanner;

public class SBI extends RBI {
	String name;
	long acNo;
	Double balance;

	public SBI(String name, long acNo, Double balance) {
		super();
		this.name = name;
		this.acNo = acNo;
		this.balance = balance;

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

	Scanner sc = new Scanner(System.in);

	public void deposite() {
		System.out.println("enter the amount to be deposite");
		double amt = sc.nextDouble();
		if (isVerify()) {
			this.balance += amt;
			System.out.println("Amount is Sucessfully Deposite...........");
			System.out.println("Do you want to check your current balance....?");
			System.out.println("Press Y for yes and N for no");
			char ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {

				System.out.println("Now your current balance is" + " " + this.balance);
			}
			System.out.println("1:Deposite\n2:withdraw");
			int a = sc.nextInt();
			if (a == 1) {
				deposite();
			} else if (a == 2) {
				withdraw();
			}

			else {
				System.out.println("......thank you......");
			}

		} else {
			System.out.println("invalid pin");
		}
	}

	public void withdraw() {
		if (isVerify()) {
			System.out.println("enter the amount to be Withdraw");
			double amt = sc.nextDouble();
			if (amt <= maxWithdraw) {
				if ((this.balance - amt) > 0) {
					System.out.println("Amount is Processing................");
					this.balance = this.balance - amt;
				} else {

					System.out.println(".....Sorry insufficient balance.....");
				}
			} else {

				System.out.println("Limit execeed");
			}

			System.out.println("Do you want to check your current balance....?");
			System.out.println("Press Y for yes and N for no");
			char ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("Now your current balance is" + " " + this.balance);
			}
			System.out.println("Thnaks for Banking..");
		} else {
			System.out.println("Invalid Pin.......");
			System.out.println("try Again.........");

		}

	}
}

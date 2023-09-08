package Relationship;

import java.util.Scanner;

public class RBI {
Scanner sc=new Scanner(System.in);
int minBal,maxWithdraw;
	public RBI() {
	minBal=1000;
	maxWithdraw=10000;
}
	public void setMinBal(int minBal) {
		if(minBal>=this.minBal)
		this.minBal = minBal;
		else {
			System.out.println("Minimum Account Balance Should be atleast"+this.minBal+"as per RBI guidelines");
			
		}
	}
   public void setMaxWithdraw(int maxWithdraw) {
	   if(maxWithdraw>this.maxWithdraw)
		this.maxWithdraw = maxWithdraw;
	   else
		   System.out.println("Maximum withdrawl limit should be at least"
				+   this.maxWithdraw+"as per RBI guidelines");
	}
   public void printInfo() {
	   System.out.println("Update Minimum Balance limit:"+minBal);
	   System.out.println("Update Maximum Withdraw Limit :"+maxWithdraw);
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
	
	
	
	
	
	
	
	
}

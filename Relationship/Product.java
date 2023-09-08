package Relationship;

public class Product {
	protected boolean isUseForCall;
	
	public boolean isUseForCall() {
		return isUseForCall;
	}
	public void setUseForCall(boolean isUseForCall) {
		this.isUseForCall = isUseForCall;
	}
	public void music(){
		System.out.println("we listen music....");
	}
	public void video() {
		System.out.println("we see videos...");
	}

}

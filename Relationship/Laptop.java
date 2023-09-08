package Relationship;

public class Laptop extends Product {
	 String Comname;
	String modelNo;
	 String color;
	public Laptop(boolean isUseForCall,String comname, String modelNo, String color) {
		this.isUseForCall=isUseForCall;
		this.Comname = comname;
		this.modelNo = modelNo;
		this.color = color;
	}

}

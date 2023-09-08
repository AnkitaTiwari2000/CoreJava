package Relationship;

public class Animal {
     protected boolean nonVegetarian;
     String eats;
      int noOfLegs;
     
     
 	public boolean isNonVegetarian() {
		return nonVegetarian;
	}

	public void setNonVegetarian(boolean nonVegetarian) {
		this.nonVegetarian = nonVegetarian;
	}

	public String getEats() {
		return eats;
	}

	public void setEats(String eats) {
		this.eats = eats;
	}

	public int getNoOfLegs() {
		return noOfLegs;
	}
     
	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}
	public Animal() {
		
	}

	public Animal(boolean nonVege,String food,int leg) {
		this.nonVegetarian=nonVege;
		this.eats=food;
		this.noOfLegs=leg;
	}
	public void display() {
		System.out.println("Eating.....");
		System.out.println("Sleeping.....");
	}



	
	
}

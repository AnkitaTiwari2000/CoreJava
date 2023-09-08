package Relationship;

public class Cat extends Animal {
    
	private String color;
	private String sound;
	public Cat(boolean nonVege,String food,int leg,String color, String sound) {
		this.nonVegetarian=nonVege;
		this.eats=food;
		this.noOfLegs=leg;
		this.color = color;
		this.sound = sound;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	
	
	

}

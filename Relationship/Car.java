package Relationship;

public class Car extends Vehicles {

	public Car(String VeName, String tires, String start, String stop) {
		super(VeName, tires, start, stop);
		
	}
	public static void drive()
	{
		System.out.println("drive through engine.....");
	}
}

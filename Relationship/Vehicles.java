package Relationship;

public class Vehicles {

	String VeName;
	String tires;
	String start;
	String stop;
	public Vehicles(String VeName, String tires, String start, String stop) {
		
		this.VeName = VeName;
		this.tires = tires;
		this.start = start;
		this.stop = stop;
	}
	public static void drive()
	{
		System.out.println("Both u can drive....!");
	}

}

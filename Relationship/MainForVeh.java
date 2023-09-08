package Relationship;

public class MainForVeh {

	public static void main(String[] args) {
		Bycycle b=new Bycycle("Royal","2","yes","stop");
		System.out.println("name of bycyle--->"+b.VeName);
		System.out.println("tier of bycyle--->"+b.tires);
		System.out.println("start of bycyle--->"+b.start);
		System.out.println("stop of bycyle--->"+b.stop);
		b.drive();
		Car c=new Car("BMW","4","yes","stop");
		System.out.println("name of car--->"+b.VeName);
		System.out.println("tier of car--->"+b.tires);
		System.out.println("start of car--->"+b.start);
		System.out.println("stop of stop--->"+b.stop);
		c.drive();
	}

}

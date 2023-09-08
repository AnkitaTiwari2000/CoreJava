package Relationship;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cat c=new Cat(false,"Milk",4,"brown", "meeeo....");
System.out.println("Cat is vegetarian  "+c.isNonVegetarian());
System.out.println("Cat eats "+c.getEats());
System.out.println("Cat has  "+c.getNoOfLegs()+" legs");
c.display();
System.out.println("Cat color  "+ c.getColor());
System.out.println("Cat Sound   "+c.getSound());
System.out.println("...............................");


Cat d=new Cat(false,"Bread",4,"Black", "bho bho....");
System.out.println("DOg is vegetarian  "+d.isNonVegetarian());
System.out.println("Dog eats "+d.getEats());
System.out.println("Dog has  "+d.getNoOfLegs()+" legs");
c.display();
System.out.println("DOg color  "+ d.getColor());
System.out.println("Dog Sound   "+d.getSound());
System.out.println("...............................");








	}

}

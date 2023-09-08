package Oop;
abstract class Animal1{
	public abstract void animalSound();
	public void sleep() {
		System.out.println("Zzzz");
	}
}
class Pig extends Animal1{

	@Override
	public void animalSound() {
		// TODO Auto-generated method stub
		System.out.println("the pig say :wee wee");
	}
}
public class AbstractionC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pig p=new Pig();
p.animalSound();
p.sleep();
	}

}

package Oop;
class Animal{
	void eat() {
		System.out.println("i am eating....");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("hii i am barking");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Dog d=new Dog();
     d.eat();
     d.bark();

	}

}

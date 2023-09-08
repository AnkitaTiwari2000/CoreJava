package Relationship;
 class Phone{
	 public static void m1() {
		 System.out.println("hii i am used for calling");
	 }
	 
 }
 class Mobil extends Phone{
	 public static void m2() {
		 System.out.println("hii i am used for sending mesgs");
	 }
 }
 class SmartPhone extends Mobil{
	 public static void m3() {
		 System.out.println("hii i am used for multiple things ...like audio video etc");
		 
	 }
 }
public class Multilev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Phone p=new Phone();
		p.m1();
		System.out.println("..........................");
		Mobil m=new Mobil();
		m.m1();
		m.m2();
		System.out.println("..........................");
		SmartPhone s=new SmartPhone();
		s.m1();
		s.m2();
		s.m3();
		
		
		
		
		
		
		
		

	}

}

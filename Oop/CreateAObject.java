package Oop;

public class CreateAObject {
	static String inst="QJSpider";
	String name;
	int id;
	int phoneNo;
	public static void m1() {
		System.out.println("Hii I am Static block");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
		
		
		CreateAObject c=new CreateAObject();
		System.out.println(inst);
		System.out.println(c.name);
		System.out.println(c.id);
		
		System.out.println(c.phoneNo);
		
	
		

	}

}

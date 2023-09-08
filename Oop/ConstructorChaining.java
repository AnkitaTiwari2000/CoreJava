package Oop;

public class ConstructorChaining {

	private String name;
	private int id;
	//constructor
	public ConstructorChaining() {

	}
	//constructor with 2 arguments
	public ConstructorChaining(String name,int id) {
 this.name=name;
 this .id=id;
	}
	//getter method
	public String getName() {
		return name;
	}
		public int getId() {
			return id;
		}
	//setter method
		public void SetName(String name) {
			this.name=name;
		}
 public void setid(int id) {
	 this.id=id;
 }
	public static void main(String[] args) {
		 ConstructorChaining c1=new ConstructorChaining("amit",1234);
		 System.out.println(c1.name);
		 
		 
		 
		 
	}

}

package Oop;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ConstructorChaining c1=new ConstructorChaining("amit",1234);
 System.out.println(c1.getName()+" " +c1.getId());
  c1.SetName("abc");
  System.out.println(c1.getName());
	}

}

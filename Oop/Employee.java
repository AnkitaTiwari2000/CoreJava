package Oop;

public class Employee {
	static String comName;
	String EmpName;
	int id;
	static {
		comName="hcl";
		System.out.println("Compony Name ="+comName);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Employee e1=new Employee();
   e1.id=1;
   e1.EmpName="rashi";
   System.out.println("id =="+e1.id+"name ==>"+e1.EmpName);
   Employee e2=new Employee();
   e2.id=2;
   e2.EmpName="rahul";
   System.out.println("id =="+e2
		   
		   .id+"name ==>"+e2.EmpName);
   Employee e3=new Employee();
	}

}

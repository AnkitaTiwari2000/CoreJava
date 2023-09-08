package Oop;

public class Emp {
	static String comName;
	String empName;
	int id;
	static {
		comName="hcl";
		System.out.println("Compony Name ="+comName);
	}

	public Emp(String empName,int id) {
		
		this.empName=empName;
		this.id=id;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp e1=new Emp("anku",101);
		System.out.println(e1.id+" "+" " +e1.empName);
		Emp e2=new Emp("radha",102);
		System.out.println(e2.id+" "+" " +e2.empName);
		Emp e3=new Emp("aditya",103);
		System.out.println(e3.id+" "+" " +e3.empName);
		Emp e4=new Emp("ayush",104);
		System.out.println(e4.id+" "+" " +e4.empName);

	}

}

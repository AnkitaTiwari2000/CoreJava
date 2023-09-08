package Relationship;

public class Professer {
	private String profName;
	private int profId;
	private String profSub;
	Dept d;
	College c;
	
public Professer(College c,String profName, int profId, String profSub, Dept d) {
		this.c=c;
		this.profName = profName;
		this.profId = profId;
		this.profSub = profSub;
		this.d = d;
	}

public void displayInfo() {
	System.out.println("College Name----"+c.colName);
	System.out.println("College Code :---"+c.colCode);
	System.out.println("Professor name :---"+this.profName);
	System.out.println("Professor Id :---"+this.profId);
	System.out.println("Professor Subject:---"+this.profSub);
	System.out.println("Department name:---"+d.deptName);
	System.out.println("Department No:---"+d.DeptNo);
	System.out.println(".............................");
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
Professer p1=new Professer(new College("SRM",465),"Radha",1,"java",new Dept("Computer Science",101));
Professer p2=new Professer(new College("SRM",465),"Nidhi",2,"Sql",new Dept("Information Technology",102));	

     p1.displayInfo();
     p2.displayInfo();
	}

}

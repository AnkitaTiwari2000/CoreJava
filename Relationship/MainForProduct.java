package Relationship;

public class MainForProduct {

	public static void main(String[] args) {
		Mobile m=new Mobile(true,"SamSung","Jk123","black");
		m.music();
		m.video();
		System.out.println("Mobile is Use For Call "+ m.isUseForCall);
		System.out.println("Mobile Brand is "+m.Comname);
		System.out.println("Mobile Model No is "+m.modelNo);
		System.out.println("MObile Color Is "+m.color);
		System.out.println("...........................");

		Laptop l=new Laptop(false,"Acer","Ac381i904","black");
		m.music();
		m.video();
		System.out.println("Mobile is Use For Call "+ l.isUseForCall);
		System.out.println("Mobile Brand is "+l.Comname);
		System.out.println("Mobile Model No is "+l.modelNo);
		System.out.println("MObile Color Is "+l.color);
		System.out.println("...........................");
	}

}

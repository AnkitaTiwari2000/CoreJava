package Oop;

class Area {
	int length;
	int bredth;
	//constructor of class
	Area(int length,int bredth){
		this.length=length;
		this.bredth=bredth;
	}
	public void getArea() {
		int area=length*bredth;
		System.out.println("Area"+" "+area);
	}
}
public class EnaCaps{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Area rec=new Area(2,3);
rec.getArea();
	}

}

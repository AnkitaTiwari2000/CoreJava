package Relationship;
class hip{
	public static void mth() {
		System.out.println("hii i am parent");
	}
}
class hic1 extends hip{
public static void mt() {
	System.out.println("hii i am first child");	
	}
}
class hic2 extends hip{
public static void mh() {
		System.out.println("hii i am 2nd child");
	}
}

public class Hierarchicalp {
public static void main(String[] args) {
	hic1 h=new hic1();
	h.mth();
	h.mt();
	System.out.println("......................");
	hic2 c=new hic2();
	c.mh();
	c.mth();
	
}
}

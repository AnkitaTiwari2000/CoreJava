package BasicApp;

public class Top extends Clothing {
	private String size;

	public Top(String brand, double price, String size) {
		super(brand, price);
		this.size = size;
	}

	public String getSize() {
		return size;
	}
	


	public void displayInfo() {
		System.out.println("Brand :"+brand);
		System.out.println("price : Rs"+price);
		System.out.println("size   :"+ size);
	}
}
package conditionalstatement;

public class ArrayContainSpecificPos {
	//function or method
	public static boolean contains(int arr[],int item) {
		for(int i=0;i<arr.length;i++) {
			if(item==i) {
				return true;
			}
		}
		return false;
	}
	
public static void main(String[] args) {
	int my_arr[]= {10,22,30,47,55};
	System.out.println(contains(my_arr,10));
	System.out.println(contains(my_arr,1));
	
}
}

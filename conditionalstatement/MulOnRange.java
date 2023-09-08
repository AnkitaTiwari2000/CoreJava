package conditionalstatement;



public class MulOnRange {
	public static void main(String[] args) {
	
		int r1=5;
		int r2=20;
	
		
		
		while(r1<=r2) {
			int num=r1;
			int i=1;
			while(i<=10) {
			System.out.println(num+"X"+i+"="+(num*i));
			i++;
			}
			System.out.println("==========");
			//i++;
			r1++;
		}
	}

}

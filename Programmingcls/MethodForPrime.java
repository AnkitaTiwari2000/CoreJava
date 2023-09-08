package Programmingcls;

public class MethodForPrime {
	public static void primeNo() {
		int st;
		int count=0;
		for( st=2;st<=10;st++) {
			for(int i=1;i<=st;i++) {
				if(st%i==0) {
					count++;
				}
				i++;
				
			}
			
		}
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
primeNo();
	}

}

package LoopQuestion;

public class MulOnRangeDo {
	public static void main(String[] args) {
		int st=2;
		int en=10;
		
		while(st<=en) {
			int i=1;
		do {
			System.out.println(st+"X"+i+"="+(st*i));
			i++;
			
		}while(i<=10);
		st++;
		}
	}

}

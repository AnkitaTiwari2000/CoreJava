package LoopQuestion;

public class InfiniteLoop {
	public static void main(String[] args) {
		int i=0;
		int num=1;
		while(num>=i) {
			System.out.println(num);
			num++;
		}
	}

}

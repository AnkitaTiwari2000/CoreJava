package TestProgram;

public class ReverseEachWord {

	public static void main(String[] args) {
		String s="PRINCE IS GOOD SINGER";
		int length=s.length();
		String rev="";
		for(int i=length-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		 		
	}

}

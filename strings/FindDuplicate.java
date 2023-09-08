package strings;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="nishu tiwari";

		char s1[]=s.toCharArray();
		System.out.println("find duplicate");
		for(int i=0;i<s1.length;i++) {
			//count=1;
			for(int j=i+1;j<s1.length;j++) {
				if(s1[i]==s1[j] &&s1[i]!=' ' )
	 System.out.print(s1[j]+" ");
			
			
			}

		
		}
	
	}

}

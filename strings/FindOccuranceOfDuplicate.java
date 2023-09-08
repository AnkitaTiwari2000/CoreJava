package strings;

public class FindOccuranceOfDuplicate {

	public static void main(String[] args) {
		int count[]=new int[256];
		String s="hii i am ankita tiwari";
		
		
		//char ch[]=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			count[(int)s.charAt(i)]++;
		}
				for(int i=0;i<256;i++) {
					if(count[i]!=0) {
				
		System.out.println((char)i+"  -->"+count[i]);

	}
}
	}
}


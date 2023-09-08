package strings;

public class UppertoLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="HII I AM NISHU TIWARI";
       char[] lc=s.toCharArray();
       for(int i=0;i<lc.length;i++) {
    	   if(lc[i]>='A' && lc[i]<='Z') {
    		   lc[i]=(char)((int) lc[i]+32);
    	   }
       }
       for(int i=0;i<lc.length;i++) {
    	   System.out.print(lc[i]);
       }
       }

}

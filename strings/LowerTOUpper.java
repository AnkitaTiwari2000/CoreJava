package strings;

public class LowerTOUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="nishutiwari";
       char []upch=s.toCharArray();
       for(int i=0;i<upch.length;i++) {
    	  
    	   //System.out.println(i);
       if(upch[i]>='a'&& upch[i]<='z'){
    	   upch[i]=(char)((int)upch[i]-32);
       }
       
       }
       for(int i=0;i<upch.length;i++) {
    	   System.out.print(upch[i]);
       }
	}

}

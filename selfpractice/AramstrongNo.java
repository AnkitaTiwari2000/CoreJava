package selfpractice;
public class AramstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n=371;
	int temp=n;int res=0;
	int r ;
    while(temp!=0) {
    	r=temp%10;
    	res=(int) (res+Math.pow(r, 3));
    	n=n/10;
    }
    if(n==res) {
    	System.out.println("armstrong");
    }
    else {
    	System.out.println("not Armstrong");
    }
	}
	
	}
	



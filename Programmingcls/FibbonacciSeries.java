package Programmingcls;

public class FibbonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a1=0,a2=1;
 int num=10;
 int i=1;
 while(i<=num){
	 System.out.print(a1+" ");
	 int temp=a1+a2;
	 a1=a2;
	 a2=temp;
	 i++;
 }
 
	}

}

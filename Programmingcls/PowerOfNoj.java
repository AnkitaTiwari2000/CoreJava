package Programmingcls;

public class PowerOfNoj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int base=2;int exp=3;
int pow=1;
for(; exp>0;) {
	pow=pow*base;
	exp--;
}
System.out.println(pow);
	}

}

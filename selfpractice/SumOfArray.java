package selfpractice;

public class SumOfArray {
public static void main(String[] args) {
	int arr[]= {10,20,30,40,50,60,70,80,90,100};
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		sum=sum+arr[i];
		
	}
	System.out.println(sum);
	int avg=sum/arr.length;
	System.out.println("average of number is"+avg);
}
}

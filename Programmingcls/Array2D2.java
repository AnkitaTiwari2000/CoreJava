package Programmingcls;

public class Array2D2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{10,12,9,},{13,5,8,9}};
		int temp[][]=new int[3][2];
		for(int i=0;i<temp.length;i++) {
			for(int j=0;j<temp[i].length;j++) {
				temp[i][j]=arr[j][i];
			}
		}
		for(int i=0;i<temp.length;i++) {
			for(int j=0;j<temp[i].length;j++) {
				System.out.print(temp[i][j]+" ");
			}
			System.out.println();
		}
	}

}

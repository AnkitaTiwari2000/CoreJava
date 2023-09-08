package selfpractice;

import java.util.Scanner;

public class StudentMarks {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of student");
		int n=sc.nextInt();
		int rollNo[]=new int[n];
		int s1[]=new int[n];
		int s2[]=new int[n];
		int s3[]=new int[n];
		double total[]=new double[n];
		double avg[]=new double[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter student"+(i+1)+"details");
			System.out.println("roll no");
			rollNo[i]=sc.nextInt();
			System.out.println("marks 1");
			s1[i]=sc.nextInt();
			System.out.println("marks 2");
			s2[i]=sc.nextInt();
			System.out.println("marks 3");
			s3[i]=sc.nextInt();
			total[i]=(s1[i]+s2[i]+s3[i]);
			avg[i]=total[i]/3.0;
			
		}
			
		for(int i=0;i<n;i++)	
		System.out.println("roll no is"+""+rollNo[i]+" "+"total"+total[i]+" "+"average"+avg[i]);	
			
			
			
			
			
			
			
			
			
			
			
		}
		
	}



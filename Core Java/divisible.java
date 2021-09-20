package bank;

import java.util.Scanner;

public class divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[]=new int[100];
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter the number of elements you want to store: ");  
		 int n=sc.nextInt();
		 if(n<0)
		 {
			 System.out.print("Invalid input");
		 }
		 else
		 {
			//int a[]=new int[n]; 
		 
		 System.out.println("Enter the elements of the array");
		 for(int i=0;i<n;i++)
		 {
			 a[i]=sc.nextInt();
			 if(a[i]<0)
			 {
				 System.out.println("invalid");
			 }
		 }
		 int count=0;
		 for(int s:a)
		 {
			 if(s%3==0)
			 {
				 count++;
			 }
		 }
		 //System.out.println("count is"+count);
		 //return count;
		
	}
		 
}
}

	
package bank;

import java.util.*;

public class passcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,count=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n<0 || n%2!=0) {
			System.out.println("invalid array size");
		}
		else
		{
			int a[]=new int[n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
				if(a[i]<0) {
					System.out.println("invalid input");
				}
			}
			for(int i=1;i<n;i=i+2) {
				if(a[i]>=70)
					count++;
			}
			System.out.println(count);
		}
	}

}

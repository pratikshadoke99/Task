package bank;

import java.util.*;

public class throws1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cal c=new cal();
		try {
			c.div();
		}
		catch(Exception e) {
			System.out.println("not valid");
		}
		System.out.println("next logic");
	}

}
class cal{
	public void div()throws ArithmeticException{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 1st no");
		int a=sc.nextInt();
		System.out.println("enter the 2nd no");
		int b=sc.nextInt();
		System.out.println(a/b);
		
	}
}

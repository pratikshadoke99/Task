package bank;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a[];
		a=new int[40];
		String d[]=new String[5];
		d[3]="abc";
		String[] b= {"a","b","c","d"};
		String[] c=new String[] {"a","b","c"};*/
		/*String s[]= {"pooja","komal","kavita"};
		for(String s1:s) {
			System.out.println(s1);
		}
		for(int i=0;i<3;i++)
		{
			System.out.println(s[i]);
		}*/
		//check string present or not
		/*String s[]= {"pooja","renu"};
		boolean b=Arrays.asList(s).contains("renu");
		System.out.println(b);*/
		//merge concept
		/*int a[]= {1,2,3,4};
		int b[]= {5,6,7};
		int c[]= {7,9,12,14,35};
		int d[]=ArrayUtils.addAll(a,b);
		int e[]=ArrayUtils.addAll(d,c);
		for(int y:e) {
			System.out.print(y);
		}*/
		//break
		/*String s=StringUtils.join(new String[] {"i am pratiksha","i started the course","of java"},"&");
		System.out.println(s);*/
		//reverse
		/*
		char c[]= {'a','b','c'};
		ArrayUtils.reverse(c);
		System.out.println(Arrays.toString(c));*/
		//remove
		/*int a[]= {1,2,3,4,5};
		int r[]=ArrayUtils.removeElement(a,3);
		System.out.println(Arrays.toString(r));*/
		//copy array
		/*int a[]= {1,2,3,4,5};
		int b[]=new int[5];
		System.arraycopy(a,0,b,0,5);
		System.out.println(Arrays.toString(b));*/
		/*int a[]= {1,2,3,4,5};
		int b[]=java.util.Arrays.copyOf(a,10);
		System.out.println(Arrays.toString(b));
		int c[]=java.util.Arrays.copyOfRange(a,0,3);
		System.out.println(Arrays.toString(c));8*/
		int a[]= {134,25,36,43};
		String s[]= {"kavita","pooja","anu","babita"};
		System.out.println("original array"+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("sorted array"+Arrays.toString(a));
		System.out.println("original string"+Arrays.toString(s));
		Arrays.sort(s);
		System.out.println("sorted string"+Arrays.toString(s));
	}

}

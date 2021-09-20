package bank;

import java.util.Scanner;

public class sourse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//sc.nextLine();
		//String str=sc.nextLine();
		//sc.close();
	    Alphabet obj = new Alphabet();
	    String str=sc.nextLine();
	    String str1=sc.nextLine();
        System.out.println(obj.uniqueVowel(str));
        System.out.println(obj.uniqueVowel(str1));
        //obj.uniqueVowel("abacab");
        //obj.uniqueConsonant("abacab");
	}

}
class Alphabet{
	  // Write a code here..
	  int uniqueVowel(String str)
	  {
	      int n=str.length();
	      int arr[]=new int[n];
	      for(int i=0;i<n;i++)
	      {
	          if(i==0)
	          arr[i]=n;
	          else
	          arr[i]=(n-i)+arr[i-1]-i;
	      }
	      int sum=0;
	      for(int i=0;i<n;i++){
	          char ch=str.charAt(i);
	          if (ch == 'a' || ch == 'e' || ch == 'i'
	                || ch == 'o' || ch == 'u')
	                sum += arr[i];
	      }
	      return 1;
	  }
	  int uniqueConsonant(String str1){
	      return 2;
	  }
	}
package bank;

public class thread {
	public static void main(String[] args) {
		/*String s="komal";  
		System.out.println("upper and lower case");
		System.out.println(s.toUpperCase());  
		System.out.println(s.toLowerCase());  
		System.out.println(s);
		
		System.out.println("white space");
		String s1="  Sachin  ";  
		System.out.println(s1);   
		System.out.println(s1.trim()); 
		
		System.out.println("start and end");
		String s2="Sachin";  
		System.out.println(s2.startsWith("Sa"));  
		System.out.println(s2.endsWith("n"));
		
		System.out.println("position");
		String s3="’S’+’a’+’c’+’h’+’I’+’n’";  
		System.out.println(s3.charAt(0));  
		System.out.println(s3.charAt(3));
		
		System.out.println("length");
		String s4="Sachin";  
		System.out.println(s4.length());*/
		
		//String s5=new String("Sachin");  
		//String s6=s5.intern();  
		//System.out.println(s6);
		
		/*StringBuffer s=new StringBuffer("Hello ");  
		s.append("Java"); 
		System.out.println(s); */
		
		StringBuffer sb=new StringBuffer("Hello ");  
		 
		int returnvalue = sb.offsetByCodePoints(1,2
				);  
		System.out.println(returnvalue);
		
	}
}

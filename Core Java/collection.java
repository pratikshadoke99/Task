package bank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class collection {
	public static void main(String[] args) {
		/*LinkedList <String>a= new LinkedList();
		a.add("pooja");
		a.add("komal");
		System.out.println(a);
		a.add(1,"durga");
		System.out.println(a);
		LinkedList <String>a1= new LinkedList();
		a1.add("abc");
		a1.add("xyz");
		a1.addAll(a);
		System.out.println(a1);
		a.addFirst("lina");
		a.addLast("mno");
		System.out.println(a);*/
		/*LinkedList <String>a= new LinkedList();
		a.add("pooja");
		a.add("nikita");
		a.add("komal");
		a.add("nikita");
		a.remove("nikita");
		System.out.println(a);
		a.remove(0);
		System.out.println(a);
		a.removeFirstOccurrence("nikita");
		System.out.println(a);
		a.removeLastOccurrence("nikita");
		System.out.println(a);*/
		/*LinkedList<String> ll=new LinkedList<String>();  
			       ll.add("Ravi");  
		           ll.add("Vijay");  	           
		           ll.add("Ajay");  
			           //Traversing the list of elements in reverse order  
			           Iterator i=ll.descendingIterator();  	           while(i.hasNext())  
			           {  
			               System.out.println(i.next());  
		           }*/
		HashSet<String> a=new HashSet<String>();
		a.add("abc");
		a.add("xyz");
		a.add("mno");
		a.add(null);
		System.out.println(a);
		LinkedHashSet<String>a1=new LinkedHashSet<String>();
		a1.add("abc");
	a1.add("xyz");
		
		System.out.println(a1);
		TreeSet a2=new TreeSet<>();
		a2.add("ghj");
		a2.add("ag");
		System.out.println(a2);
	}

}

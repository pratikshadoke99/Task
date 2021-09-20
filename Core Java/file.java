package bank;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		try 
	       {
             File Obj = new File("abc.txt");
             Scanner obj1 = new Scanner(Obj);
             while (obj1.hasNextLine()) 
             {
     		  String obj2 = obj1.nextLine();
    		  System.out.println(obj2);
             }
             obj1.close();
     	}catch (FileNotFoundException e) 
         {
             System.out.println("Sorry for the trouble");
         }
}
}





/*try {
	FileWriter F=new FileWriter("abc.txt");
	/*if(F.createNewFile()) {
		System.out.println("file created");
	System.out.println("name of the file"+F.getName());
	System.out.println("absolute path")
}
	else
	{System.out.println("file already exit");
}
	F.write("welcome to");
	F.close();
	System.out.println("file is updated");

}
catch(IOException e)
{
	System.out.println(e);
*/
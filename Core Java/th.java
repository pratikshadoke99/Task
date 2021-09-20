package bank;

public class th {

	public static void main(String[] args) {
 
		  Pranita p=new Pranita();
		  
		  p.start();
	
}
	   
	   }

class Pranita extends Thread {
    public void run()  { 
        while(true)  { 
        	try {
            System.out.println("Red"); 
            Thread.sleep(20000);
        	}
        	catch(Exception e)
        	{
        	
        	}
        	try {
            System.out.println("Green"); 
            Thread.sleep(5000); 
        	}
        	catch(Exception e)
        	{
        	
        	}
	
}
}
}


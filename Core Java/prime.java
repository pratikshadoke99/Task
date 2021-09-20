import java.util.Scanner;
public class prime
{
          public static void main(String[] strings) 
          {
                    int n,count=0;
                    
                    Scanner s = new Scanner(System.in);
                    System.out.print("Enter any integer value");
                    n = s.nextInt();
                    for(int i=2;i<=n;i++)
                    {
                    boolean flag=false;
                       for(int j=2;j<i;j++)
                       {
                              if(i%j==0)
                              flag=true;
                       }
                    if(flag==false)
                    {
                              System.out.println(i+"\t");
                              count++;
                    }      
                    }
                System.out.println("Total prime number="+count);
          }  
}

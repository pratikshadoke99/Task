import java.util.Scanner;
public class fact
{
          public static void main(String[] strings) 
          {
              int num,i,fact=1;
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter any no");
              num=sc.nextInt();      
              for(i=1;i<=num;i++)
              {
                    fact=fact*i;
              }
                    System.out.println("factorial number" +fact);
          }
}

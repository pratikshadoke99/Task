import java.util.Scanner;
public class sumevenodd
{
          public static void main(String[] strings) 
          {
                    int n, sumE = 0,sumo=0;
                    Scanner s = new Scanner(System.in);
                   
                    System.out.print("Enter any integer value");
                    n = s.nextInt();
                    
                             
                                        for(int i = 0; i <= n; i++)
                                        {
                                                  if(i % 2 == 0)
                                                  sumE=sumE+i;
                                        }
                                      
                              
                                        for(int i = 0; i <= n; i++)
                                        {
                                                  if(i % 2 == 1)
                                                  sumo=sumo+i;
                                        }
                                          System.out.println("Sum of even numbers up to " +n+"="+sumE);
                                        System.out.println("Sum of odd numbers up to "+n+"= "+sumo);
                              
                  
        }  
}

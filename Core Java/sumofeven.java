import java.util.Scanner;
public class sumofeven
{
          public static void main(String[] strings) 
          {
                    int n, sumE = 0,sumo=0;
                    Scanner s = new Scanner(System.in);
                    System.out.println("Menu 1.Even 2.Odd");
                    System.out.print("Enter your choice ");
                    int choice = s.nextInt();
                    System.out.print("Enter the number");
                    n = s.nextInt();
                    switch(choice)
                    {
                              case 1:
                                        for(int i = 0; i <= n; i++)
                                        {
                                                  if(i % 2 == 0)
                                                  sumE=sumE+i;
                                        }
                                        System.out.println("Sum of Even Numbers:"+sumE);
                              break;
                              case 2:
                                        for(int i = 0; i <= n; i++)
                                        {
                                                  if(i % 2 == 1)
                                                  sumo=sumo+i;
                                        }
                                        System.out.println("Sum of odd Numbers:"+sumo);
                              break;
                    }
        }  
}

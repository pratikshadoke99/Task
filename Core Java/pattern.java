class pattern
{
public static void main(String[] args)
{
          int num=1;
          char ch=65;
          for(int i=0;i<5;i++)
          {
                    for(int j=0;j<=i;j++,num++,ch++)
                    {
                              if(i%2==0)
                              System.out.print(num+" ");
                              else
                              System.out.print(ch+" ");
                    }
                    System.out.println();
          }
}
}

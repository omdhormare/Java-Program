import java.util.*;
class fact
{
            public static void main(String[] argc)
             {
                     int i,f=1,n;
                    Scanner n1=new Scanner(System.in);
                    System.out.print("Enter Number : ");
                    n=n1.nextInt();
                    for(i=1;i<=n;i++)
                   {
                            f=f*i;
                  }
                        System.out.print("Factorial No : "+f);
            }
}
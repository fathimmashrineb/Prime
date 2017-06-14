import java.util.*;
public class Prime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=0;
        for(int i=2;i<(a/2);i++)
        {
              if(a%i==0)
               {
              System.out.println("not a prime number");  
              b=1;
              break;
               }
        
              else if(b==0)
              {
           System.out.println("prime number");      
              }
        }
    }
}



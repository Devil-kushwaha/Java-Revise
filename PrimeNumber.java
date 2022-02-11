/* https://nados.io/question/is-a-number-prime */

import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
  
       // write ur code here
       int t=sc.nextInt();
      int flag=0;
      for(int x=1;x<=t;x++)
      {
        flag=0;
        int n=sc.nextInt();
        for(int y=2;y<n;y++)
        {
          if(n%y==0)
          {
            System.out.println("not prime");
            flag=1;
            break;
          }
        }
        if(flag==0)
        {
          System.out.println("prime");
        }
      }

  
   }
  }
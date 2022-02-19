https://nados.io/question/pattern-16

import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

     // write ur code here

     int n=sc.nextInt();
     int sp=2*n-3;
     for(int x=1;x<=n;x++)
     {
         for(int y=1;y<=x;y++)
         {
             System.out.print(y+"\t");
         }
         for(int y=1;y<=sp;y++)
         {
             System.out.print("\t");
         }
         if(x!=n)
         {
             for(int y=x;y>=1;y--)
            {
             System.out.print(y+"\t");
            }
         }
         else
         {
            for(int y=x-1;y>=1;y--)
            {
             System.out.print(y+"\t");
            }
         }
         sp=sp-2;
         System.out.println();
         
     }

 }
}
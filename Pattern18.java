https://nados.io/question/pattern-18

import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

     // write ur code here

     int n=sc.nextInt();
     int spin=n-4;
     int spot=1;
     
     for(int x=1;x<=n;x++)
     {
            if(x==1||x==n)
             {
                 for(int y=1;y<=n;y++)
                 {
                     System.out.print("*\t");
                 }
                 
             }
             else
             {
                 for(int z=1;z<=spot;z++)
                 {
                     System.out.print("\t");
                 }
                 System.out.print("*\t");
                 if(x<=n/2)
                 {
                     for(int z=1;z<=spin;z++)
                    {
                     System.out.print("\t");
                    }
                 }
                 else
                 {
                     for(int z=1;z<=spin;z++)
                    {
                     System.out.print("*\t");
                    }
                 }
                 
                 if(x!=(n/2+1))
                 {
                     System.out.print("*\t");
                 }
                 
                 if(x<=n/2)
                 {
                     spin=spin-2;
                     spot++;
                 }
                 else
                 {
                     spin=spin+2;
                     spot--;
                 }
             }
         System.out.println();
     }

 }
}
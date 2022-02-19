https://nados.io/question/pattern-inverted-hour-glass

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int mid=n-4;
    int i=n/2;
    int spin=mid,spot=1;
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
            for(int y=1;y<=spot;y++)
            {
                System.out.print("\t");
            }
            System.out.print("*\t");
            if(x<=i)
            {
                for(int y=1;y<=spin;y++)
                {
                System.out.print("*\t");
                }
            }
            else
            {
                for(int y=1;y<=spin;y++)
                {
                System.out.print("\t");
                }
            }
            
            if(x!=(i+1))
            {
                System.out.print("*\t");
            }
            
            if(x<=i)
            {
                spot++;
                spin=spin-2;
            }
            else
            {
                spot--;
                spin=spin+2;
            }
        }
        System.out.println();
    }
 }

}
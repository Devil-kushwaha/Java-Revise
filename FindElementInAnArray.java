https://nados.io/question/find-element-in-an-array

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int x=0;x<n;x++)
    {
        a[x]=sc.nextInt();
    }
    int d=sc.nextInt();
    int ans=check(d,a);
    System.out.println(ans);
 }

 public static int check(int d,int ar[])
 {
     int index=-1;
     for(int x=0;x<ar.length;x++)
     {
         if(ar[x]==d)
         {
             index=x;
             return index;
         }

     }
     return index;
 }

}
https://nados.io/question/span-of-array

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int x=0;x<arr.length;x++)
     {
         arr[x]=sc.nextInt();
     }
    int diff=span(arr);
    System.out.println(diff);
 }

 

 public static int span(int ar[])
 {
     int max=0,min=0;
     for(int x=1;x<ar.length;x++)
     {
         if(ar[x]>ar[max])
         {
             max=x;
         }
         else if(ar[x]<ar[min])
         {
             min=x;
         }
     }
     int diff=ar[max]-ar[min];
     return diff;
 }

}
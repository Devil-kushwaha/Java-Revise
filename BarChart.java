https://nados.io/question/bar-chart

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
    int maxH=maxHeightOfBar(a);
    makeBarChart(a,maxH);
 }

 //Function for finding max height of the bar chart

 public static int maxHeightOfBar(int ar[])
 {
     int max=0;
     for(int x=1;x<ar.length;x++)
     {
         if(ar[x]>ar[max])
         {
             max=x;
         }
     }
     return ar[max];
 }

//Function for making a Bar Chart
 public static void makeBarChart(int ar[],int h)
 {
     for(int x=h;x>=1;x--)
     {
         for(int y=0;y<ar.length;y++)
         {
             if(ar[y]<x)
             {
                 System.out.print("\t");
             }
             else
             {
                 System.out.print("*\t");
             }
         }
         System.out.println();
     }
 }



}
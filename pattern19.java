https://nados.io/question/pattern-19
import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

     // write ur code here
     int n=sc.nextInt();
     int mid=n/2+1;

     for(int x=1;x<=n;x++)
     {
         for(int y=1;y<=n;y++)
         {
             if(x==mid||y==mid)
             {
                 System.out.print("*\t");
             }
             else if(x==1 && y<mid)
             {
                 System.out.print("*\t");
             }
             else if(x==n && y>mid)
             {
                 System.out.print("*\t");
             }
             else if(y==1 && x>mid)
             {
                 System.out.print("*\t");
             }
             else if(y==n && x<mid)
             {
                 System.out.print("*\t");
             }
             else
             {
                 System.out.print("\t");
             }
         }
         System.out.println();
     }

 }
}
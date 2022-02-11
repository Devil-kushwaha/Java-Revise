/* https://nados.io/question/digits-of-a-number */
import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      // write your code here  
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      String ns=Integer.toString(n);
      int l=ns.length();
      int div=(int)(Math.pow(10,l-1));
      while(div!=0)
      {
        int d=n/div;
        System.out.println(d);
        n=n%div;
        div=div/10;
      }
     }
    }
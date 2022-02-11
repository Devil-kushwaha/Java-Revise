/* https://nados.io/question/inverse-of-a-number
*/


import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here  
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  String ns=Integer.toString(n);
  int l=ns.length();
  int sum=0;
  for(int x=1;x<=l;x++)
  {
    int d=n%10;
    sum=sum+(int)(Math.pow(10,d-1))*x;
    n=n/10;
  }
  System.out.println(sum);
 }
}
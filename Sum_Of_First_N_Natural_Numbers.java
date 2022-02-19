https://www.geeksforgeeks.org/program-find-sum-first-n-natural-numbers/

import java.util.*;
class Sum_of_first_n_natural_numbers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int sum=calculate(n);
        System.out.println(sum);
    }
    
    
    //Function to find sum of n natural numbers
    public static int calculate(int n)
    {
        int sum=0;
        for(int x=1;x<=n;x++)
        {
            sum=sum+x;
        }
        return sum;
    }
}
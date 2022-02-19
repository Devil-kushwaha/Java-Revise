https://www.geeksforgeeks.org/check-if-a-number-is-palindrome/

import java.util.*;
class Palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        boolean b=check_palindrome(n);
        if(b==true)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrme");
        }
    }

    //Function for checking palindrome
    public static boolean check_palindrome(int n)
    {
        int temp=n;
        int rev=0;
        while(temp!=0)
        {
            int d=temp%10;
            rev=rev*10+d;
            temp=temp/10;
        }
        if(rev==n)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
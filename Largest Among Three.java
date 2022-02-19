https://www.java67.com/2019/05/how-to-find-largest-and-smallest-of-three-numbers-in-java.html

import java.util.*;
class Max_among_3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1");
        int n1=sc.nextInt();
        System.out.println("Enter number 2");
        int n2=sc.nextInt();
        System.out.println("Enter number 3");
        int n3=sc.nextInt();
        int big=biggest_among_3(n1,n2,n3);
        System.out.println(big);
    }

    public static int biggest_among_3(int a,int b,int c)
    {
        int max;
        if(a>b)
        {
            if(a>c)
            {
                max=a;
            }
            else
            {
                max=c;
            }
        }
        else
        {
            if(b>c)
            {
                max=b;
            }
            else
            {
                max=c;
            }
        }
        return max;
    }
}


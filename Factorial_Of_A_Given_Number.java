import java.util.Scanner;
class Factorial_Of_A_Given_Number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=sc.nextInt();
        int fact=1;
        while(n!=1)
        {
            fact=fact*n;
            n=n-1;
        }
        System.out.println(fact);
    }
}
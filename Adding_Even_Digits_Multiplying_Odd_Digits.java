import java.util.Scanner;
class Adding_Even_Digits_Multiplying_Odd_Digits
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int a =sc.nextInt();
        int sumE=0;
        int sumO=0;
        while(a!=0)
        {
            int l=a%10;
            if(l%2==0)
            {
                sumE=sumE+l;
            }
            else
            {
                sumO=sumO+l;
            }
            a=a/10;
        }
        System.out.println("Sum of Even Number : "+sumE);
        System.out.println("Sum of Odd Number : "+sumO);
    }
}
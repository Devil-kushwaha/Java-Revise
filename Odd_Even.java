import java.util.Scanner;
class Odd_Even{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int a=sc.nextInt();
        if(a%2==1)
        {
            System.out.println("Odd");
        }
        else
        {
            System.out.println("Even");
        }
    }
}
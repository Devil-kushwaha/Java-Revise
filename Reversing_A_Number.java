import java.util.Scanner;
class Reversing_a_number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        int temp=a;
        int n=0;
        while(temp!=0)
        {
            int l=temp%10;
            n=n*10+l;
            temp=temp/10;
        }
        System.out.println("Reverse : "+n);
    }
}
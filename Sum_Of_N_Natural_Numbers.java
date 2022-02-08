import java.util.Scanner;
class Sum_Of_N_Natural_Numbers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int sum=0;
        for(int x=1;x<=n;x++)
        {
            sum=sum+x;
        }
        System.out.println("Sum = "+sum);
    }
}
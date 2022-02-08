import java.util.Scanner;
class Print_N_Natural_Number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        for(int x=1;x<=n;x++)
        {
            System.out.println(x);
        }
    }
}
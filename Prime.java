import java.util.Scanner;
class Prime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter a number");
        int n=sc.nextInt();
        int flag=0;
        for(int x=2;x<n/2;x++)
        {
            if(n%x==0)
            {
                System.out.println("Not a Prime Number");
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("Prime Number");
        }
    }
}
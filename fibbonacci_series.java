class fibbonacci_series
{
    public static void main(String args[])
    {
        int a=0;
        int b=1;
        int sum=0;
        for(int x=1;x<=10;x++)
        {
            if(x==1)
            {
                System.out.print(a+",");
            }
            else if(x==2)
            {
                System.out.print(b+",");
            }
            else
            {
                sum=a+b;
                if(x!=10)
                {
                    System.out.print(sum+",");
                }
                else
                {
                    System.out.print(sum);
                }
                
                a=b;
                b=sum;
                
            }
        }
    }
}
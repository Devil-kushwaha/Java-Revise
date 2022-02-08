class Prime_Number_Between_1_And_100
{
    public static void main(String args[])
    {
        int flag=0;
        for(int x=2;x<=99;x++)
        {
            flag=0;
            for(int y=2;y<=x/2;y++)
            {
                if(x%y==0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.println(x);
            }
        }
    }
}
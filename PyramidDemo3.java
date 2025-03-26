import java.util.Scanner;
class Pyramid
{
    int n;
    void get()
    {
        Scanner objs=new Scanner(System.in);
        System.out.print("\n\t Enter the Value of n:");
        n=objs.nextInt();
    }
    void printPyramid()
    {
        for(int i=1;i<=n;i++)
        {
            System.out.print("\n\t");
            for(int j=1;j<=n;j++)
            {
                if(i==1||j==1||i==n||j==n)
                {
                    System.out.print(" @ ");
                }
                else
                {
                    System.out.print(" ");
                }
            }
        }
    }
}
class PyramidDemo3
{
    public static void main(String args[])
    {
        try
        {
            Pyramid obj=new Pyramid();
            obj.get();
            obj.printPyramid();
        }
        catch(Exception e)
        {
            System.out.print("\n\t Exception Occured:"+e);
        }
    }
}
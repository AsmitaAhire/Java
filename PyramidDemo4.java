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
            int spaces=n-i;
            while(spaces>0)
            {
                System.out.print(" ");
                spaces--;
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print( +j);
            }
        }
    }
}
class PyramidDemo4
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
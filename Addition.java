import java.util.Scanner;
class Addition
{
    int a,b,result;
    Addition(int p,int q)
    {
        a=p;
        b=q;
    }
    void Add()
    {
        result=a+b;
    }
    void put()
    {
        System.out.print("\n\t a="+a);
        System.out.print("\n\t b="+b);
        System.out.print("\n\t Addition="+result);
    }
}
class ConstructorDemo
{
    public static void main(String args[])
    {
        try
        {
            int x,y;
            Scanner objs=new Scanner(System.in);
            System.out.print("Enter the Value of x:");
            x=objs.nextInt();
            System.out.print("\n\t Enter the Value of y:");
            y=objs.nextInt();
            Addition obj=new Addition(x,y);
            obj.Add();
            obj.put();
        }
        catch(Exception e)
        {
            System.out.print("Exception Occured:"+e);
        }
    }
}
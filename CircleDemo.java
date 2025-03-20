import java.util.Scanner;
class Circle
{
    float r,A;
    void get()
    {
        Scanner objs=new Scanner(System.in);
        System.out.print("\n\t Enter the Radius of the Circle:");
        r=objs.nextFloat();
    }
    void put()
    {
        System.out.print("\n\t Area of Circle="+A+"Sq.cm");
    }
    void area()
    {
        A=3.14f*r*r;
    }
}
class CircleDemo
{
    public static void main(String args[])
    {
        try
        {
            Circle obj=new Circle();
            obj.get();
            obj.area();
            obj.put();
        }
        catch(Exception e)
        {
            System.out.print("\n\t Exception Occured:"+e);
        }
    }
}
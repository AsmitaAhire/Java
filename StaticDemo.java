class Student
{
    int a;
    int b;
    static int c;
    static float d;
}
class StaticDemo
{
    public static void main(String args[])
    {
        try
        {
            Student obj=new Student();
            obj.a=10;
            obj.b=20;
            System.out.print("\n\t a="+obj.a+"b="+obj.b);
            Student.c=19;
            Student.d=99.99f;
            System.out.print("\n\t c="+Student.c+"d="+Student.d);
        }
        catch(Exception e)
        {
            System.out.print("\n\t Exception Occured:"+e);
        }
    }
}
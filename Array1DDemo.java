import java.util.Scanner;
class Array
{
    int Arr[];
    void getArray()
    {
        Scanner objArr=new Scanner(System.in);
        System.out.print("\n\t Enter the Number of element in Array:");
        int n=objArr.nextInt();
        Arr=new int[n];
        for(int i=0;i<Arr.length;i++)
        {
            System.out.print("\n\t Enter the Elements:["+i+"]:");
            Arr[i]=objArr.nextInt();
        }
    }
    void putArray()
    {
        for(int i=0;i<Arr.length;i++)
        {
            System.out.print(" "+Arr[i]);
        }
    }
}
class ArrayDemo
{
    public static void main(String args[])
    {
        try
        {
            Array obj=new Array();
            obj.getArray();
            System.out.print("\n\t Array Elements:");
            obj.putArray();
        }
        catch(Exception e)
        {
            System.out.print("Exception Occured:"+e);
        }
    }
}
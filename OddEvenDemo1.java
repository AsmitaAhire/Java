import java.util.Scanner;
class OddEven 
{
    int num;
    OddEven(int x) 
        {
            num = x;
        }
    void evenodd()
        {
            if ((int) (num & 1) == 0) 
            {
            System.out.print("\n\t" + num + "is Even Number");
            } 
            else 
            {
            System.out.print("\n\t" + num + "is Odd Number");
            }
        }
    void put()
         {
             System.out.print("\n\t num=" + num);
         }
}
class OddEvenDemo1 
{
    public static void main(String args[])
    {
        try
        {
                int n;
                Scanner objs=new Scanner(System.in);
                System.out.print("\n\t Enter the Number:");
                n=objs.nextInt();
                OddEven obj=new OddEven(n);
                obj.put();
                obj.evenodd();
        }
        catch(Exception e)
        {
            System.out.print("\n\t Exception Occured:"+e);
        }
    }
}
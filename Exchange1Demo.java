import java.util.Scanner;
class Exchange
{
    int n1,n2;
    void get()
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("\n\t Enter the value of n1:");
        n1=obj.nextInt();
        System.out.print("\n\t Enter the Value of n2:");
        n2=obj.nextInt();
    }
    void put()
    {
        System.out.print("n1="+n1+"\n n2="+n2);
    }
    void exchange()
    {
        int n1=n1^n2;
            n2=n1^n2;
            n1=n1^n2;
    }
}
class Exchange1Demo
{
    public static void main(String args[])
    {
        try
        {
            Exchange objE=new Exchange();
            objE.get();
            System.out.print("\n\t Before Exchange:");
            objE.put();
            objE.exchange();
            System.out.print("\n\t After Exchange;");
            objE.put();
        }
        catch(Exception e)
        {
            System.out.print("\n\t Exception Occured:"+e);
        }
    }

}
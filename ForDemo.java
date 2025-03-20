import java.util.Scanner;
class For
{
    int n;
    void get()
    {
        Scanner objs=new Scanner(System.in);
        System.out.print("\n\t Enter the Value of n:");
        n=objs.nextInt();
    }
    void print1ton()
    {
        for(int i=1;i<=n;i++)
        {
            System.out.print(" "+i);
        }
    }
}
class ForDemo
    {
        public static void main(String args[])
        {
            try
            {
                For objf=new For();
                objf.get();
                objf.print1ton();
            }
            catch(Exception e)
            {
                System.out.print("Exception Occured:"+e);

            }
        }
    }
    

    

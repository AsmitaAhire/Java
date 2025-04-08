import java.util.Scanner;
class Array
{
    int r,c,Arr[][];
    void getArray()
    {
        Scanner objArr=new Scanner(System.in);
        System.out.print("\n\t Enter the Number of Rows in Array Matrix:");
        int r=objArr.nextInt();
        System.out.print("\n\t Enter the Number of Columns in Array Matrix:");
        int c=objArr.nextInt();
        Arr=new int[r][c];
        for(int i=0;i<Arr.length;i++)
        {
            for(int j=0;j<Arr[i].length;j++)
            {
                System.out.print("\n\t Enter the Elements:["+i+"]["+j+"]:");
                Arr[i][j]=objArr.nextInt();
            }
        }
    }
    void putArray()
    {
        for(int i=0;i<Arr.length;i++)
        {
            System.out.print("\n\t ");
            for(int j=0;j<Arr[i].length;j++)
            {
                System.out.print(" "+Arr[i][j]);
            }
        }
    }
}
class Array2DDemo
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
package AkshayAssignment.Others;

public class PatternNumber {
    public  void create(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String arg[])
    {
        PatternNumber obj=new PatternNumber();
        obj.create(5);
    }
}

import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int m=in.nextInt();
      int num = n;
      for(int i =1; i<=n; i++)
      {
        for(int j=n; j>n-i; j--)
        {
          System.out.print(j);
        }
        for(int j=1; j<=n-i; j++)
        {
          System.out.print(n-i+1);
        }
        System.out.print("\n");
      }
    }
}


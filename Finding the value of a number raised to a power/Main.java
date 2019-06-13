import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner in = new Scanner(System.in);
      int base = in.nextInt();
      int exponent = in.nextInt();
      int out = 1;
      for(int i=1; i<=exponent; i++)
      {
        out = base*out;
      }
      System.out.print(out);
    }
}
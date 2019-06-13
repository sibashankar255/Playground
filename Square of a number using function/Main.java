import java.util.Scanner;
class Main
{
   public static int square_digit(int m)
   {
      
     int square = m*m;
      
      return square;
   }
   public static void main(String args[])
   {
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     int square = square_digit(n);
     System.out.println(square); //result printed here
   }
}
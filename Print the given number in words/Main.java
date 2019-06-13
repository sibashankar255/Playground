import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	    // Type your code here
      Scanner in = new Scanner ( System.in);
      int option = in.nextInt();
      switch(option)
      {
        case 1 :
         System.out.print("one");
         break;
        case 2 :
         System.out.print("two");
         break;
        case 3 :
         System.out.print("Three");
         break;
        case 4 :
         System.out.print("four");
         break;
        case 5 :
         System.out.print("five");
         break;
        default:
         System.out.print("Invalid");
        break;
      }
      }
}
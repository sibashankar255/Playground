import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        // Get the array size
        int arr_size = in.nextInt();
      int arr[]= new int[arr_size];
      for(int index=0; index<=(arr_size-1); index++)
      {
        arr[index] = in.nextInt();
      }
      int search1 = in.nextInt();
      int search2 = in.nextInt();
      int ele1 = -1;
      int ele2 = -1;
      for(int index=0; index<=(arr_size-1); index++)
      {
        if(search1==arr[index])
        {
          ele1=index;
        }
        if(search2==arr[index])
        {
          ele2=index;
        }
      }
      System.out.println(ele1);
      System.out.print(ele2);
    }
}
import java.util.*;
public class Main 
{
   static boolean  tEst(int a )
   {
      int square = a*a;
      int sum =0;
      while(square>0)
      {
        sum+=square%10;
        square=square/10;
      }
      if(sum==a)
      {
         return true;
      }
      else{
         return false;
      }
   }
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter no ");
      int a = sc.nextInt();
     boolean b= tEst(a);
     System.out.println(b);


   }
}

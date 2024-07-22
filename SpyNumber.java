import java.util.*;
public class Main 
{
   static boolean  tEst(int a )
   {
      int temp =a;
      int product =1;
      int sum =0;
      while(temp>0)
      {
         int tempa = temp%10;
         sum+=tempa;
         product=product*tempa;
         temp=temp/10;
      }
      if(product==sum)
      {
         return true;
      }
      else
      {
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

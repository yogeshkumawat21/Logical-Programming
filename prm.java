
public class Main
{
   
   static boolean checkPrime(int n)
   {
       int count =0;
       for(int i=2;i<n;i++)
       {
           if(n%i==0)
           {
               count++;
           }
       }
       if(count==0)
       {
          
           return true;
       }
       else
       {
           return false;
       }
   }
    
	public static void main(String[] args) {
	    int count=1;
	   for(int i=2;count<11;i++)
	   {
	      if (checkPrime(i))
	      {
	          count++;
	           System.out.print(" "+i);
	      };
	   }
	         
	}
}

public class Main  
{
    static boolean armstrong(int n)
    {
        int digit=0;
       int temp =n;
       while(temp>0)
       {
           temp=temp/10;
           digit++;
       }
       temp=n;
       int sum =0;
       while(temp>0)
       {
           int rem= temp%10;
           sum+=Main.pow(rem,digit);
           temp=temp/10;
       }
       
       if(sum==n)
       {
           return true;
       }
       else return false;
       
    }
    static int pow(int n ,int pow)
    {
        int result=1;
        while(pow>0)
        {
            result=result*n;
            pow--;
        }
        return result;
    }
    
    public static void main (String[] args) {
        int n=153;
        
      System.out.print( Main.armstrong(n));
    }
}


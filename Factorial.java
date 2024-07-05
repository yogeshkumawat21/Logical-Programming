public class Main  
{
    static void factorial(int n)
    {
       int sum=1;
       for(int i=1;i<=n;i++)
       {
           sum=sum*i;
       }
       System.out.print(sum);
    }
    public static void main (String[] args) {
        int n=5;
        
        Main.factorial(n);
    }
}


//7) Factorial using Recurssion?
Ans)public class Main  
{
    static int factorial(int n)
    {
       if(n==0)
       {
           return 1;
       }
       
       else
      return (n*(factorial(n-1)));
    }
    public static void main (String[] args) {
        int n=5;
        
       System.out.print( Main.factorial(n));;
    }
}

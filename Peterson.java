public class Main 
{
    static boolean  isPeterson( int n)
    {
        int a[]={1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};
        int temp =n;
        int sum=0;
       while(temp>0)
       {
          int rem =temp%10;
          sum+=a[rem];
          temp=temp/10;

       }
       return (sum == n);  
    
    }
    public static void main(String[] args) {
        int n=145;
        if(isPeterson(n))
        {
            System.out.println("it is peterson no ");
        }
        else
        {
            System.out.println("It is not");
        }
    }
}

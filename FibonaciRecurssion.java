public class Main
{
	 
	static int fibonacciSeries(int n)
	{
	   if (n==0){
	       return 0;
	   }
	   if (n==1){
	       return 1;
	   }
	   else
	   return fibonacciSeries(n-1)+fibonacciSeries(n-2);
	}
	
	public static void main(String[] args)
	{
	    int count =10;
	    for(int i=0;i<count;i++)
	    {
	        System.out.print(fibonacciSeries(i)+" ");
	    }
	}
}
